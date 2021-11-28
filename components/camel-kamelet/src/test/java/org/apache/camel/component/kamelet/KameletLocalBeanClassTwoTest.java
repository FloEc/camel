/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.kamelet;

import org.apache.camel.RoutesBuilder;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.test.junit5.CamelTestSupport;
import org.junit.jupiter.api.Test;

public class KameletLocalBeanClassTwoTest extends CamelTestSupport {

    @Test
    public void testOne() throws Exception {
        getMockEndpoint("mock:result").expectedBodiesReceived("Hi John we are going to Murphys");

        template.sendBody("direct:bar", "John");

        assertMockEndpointsSatisfied();
    }

    // **********************************************
    //
    // test set-up
    //
    // **********************************************

    @Override
    protected RoutesBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                routeTemplate("whereTo")
                        .templateBean("myBar", "#class:org.apache.camel.component.kamelet.KameletLocalBeanClassTwoTest$MyBar")
                        .from("kamelet:source")
                        // must use {{myBar}} to refer to the local bean
                        .to("bean:{{myBar}}");

                from("direct:bar")
                        .kamelet("whereTo")
                        .to("mock:result");
            }
        };
    }

    public static class MyBar {

        private final String bar = "Murphys";

        public String where(String name) {
            return "Hi " + name + " we are going to " + bar;
        }
    }

}
