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
package org.apache.camel.builder.endpoint.dsl;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.processing.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Zeebe component which does integrage with Camunda Zeebe to interact with the
 * API.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface ZeebeEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Zeebe component.
     */
    public interface ZeebeEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedZeebeEndpointConsumerBuilder advanced() {
            return (AdvancedZeebeEndpointConsumerBuilder) this;
        }
        /**
         * Format the result in the body as JSON.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param formatJSON the value to set
         * @return the dsl builder
         */
        default ZeebeEndpointConsumerBuilder formatJSON(boolean formatJSON) {
            doSetProperty("formatJSON", formatJSON);
            return this;
        }
        /**
         * Format the result in the body as JSON.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: common
         * 
         * @param formatJSON the value to set
         * @return the dsl builder
         */
        default ZeebeEndpointConsumerBuilder formatJSON(String formatJSON) {
            doSetProperty("formatJSON", formatJSON);
            return this;
        }
        /**
         * JobKey for the job worker.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param jobKey the value to set
         * @return the dsl builder
         */
        default ZeebeEndpointConsumerBuilder jobKey(String jobKey) {
            doSetProperty("jobKey", jobKey);
            return this;
        }
        /**
         * Timeout for job worker.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 10
         * Group: consumer
         * 
         * @param timeout the value to set
         * @return the dsl builder
         */
        default ZeebeEndpointConsumerBuilder timeout(int timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
        /**
         * Timeout for job worker.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 10
         * Group: consumer
         * 
         * @param timeout the value to set
         * @return the dsl builder
         */
        default ZeebeEndpointConsumerBuilder timeout(String timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Zeebe component.
     */
    public interface AdvancedZeebeEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default ZeebeEndpointConsumerBuilder basic() {
            return (ZeebeEndpointConsumerBuilder) this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer (advanced)
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default AdvancedZeebeEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: consumer (advanced)
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default AdvancedZeebeEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedZeebeEndpointConsumerBuilder exceptionHandler(
                org.apache.camel.spi.ExceptionHandler exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedZeebeEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedZeebeEndpointConsumerBuilder exchangePattern(
                org.apache.camel.ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedZeebeEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Zeebe component.
     */
    public interface ZeebeEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedZeebeEndpointProducerBuilder advanced() {
            return (AdvancedZeebeEndpointProducerBuilder) this;
        }
        /**
         * Format the result in the body as JSON.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param formatJSON the value to set
         * @return the dsl builder
         */
        default ZeebeEndpointProducerBuilder formatJSON(boolean formatJSON) {
            doSetProperty("formatJSON", formatJSON);
            return this;
        }
        /**
         * Format the result in the body as JSON.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: common
         * 
         * @param formatJSON the value to set
         * @return the dsl builder
         */
        default ZeebeEndpointProducerBuilder formatJSON(String formatJSON) {
            doSetProperty("formatJSON", formatJSON);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Zeebe component.
     */
    public interface AdvancedZeebeEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default ZeebeEndpointProducerBuilder basic() {
            return (ZeebeEndpointProducerBuilder) this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedZeebeEndpointProducerBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedZeebeEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Zeebe component.
     */
    public interface ZeebeEndpointBuilder
            extends
                ZeebeEndpointConsumerBuilder,
                ZeebeEndpointProducerBuilder {
        default AdvancedZeebeEndpointBuilder advanced() {
            return (AdvancedZeebeEndpointBuilder) this;
        }
        /**
         * Format the result in the body as JSON.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param formatJSON the value to set
         * @return the dsl builder
         */
        default ZeebeEndpointBuilder formatJSON(boolean formatJSON) {
            doSetProperty("formatJSON", formatJSON);
            return this;
        }
        /**
         * Format the result in the body as JSON.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: common
         * 
         * @param formatJSON the value to set
         * @return the dsl builder
         */
        default ZeebeEndpointBuilder formatJSON(String formatJSON) {
            doSetProperty("formatJSON", formatJSON);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Zeebe component.
     */
    public interface AdvancedZeebeEndpointBuilder
            extends
                AdvancedZeebeEndpointConsumerBuilder,
                AdvancedZeebeEndpointProducerBuilder {
        default ZeebeEndpointBuilder basic() {
            return (ZeebeEndpointBuilder) this;
        }
    }

    public interface ZeebeBuilders {
        /**
         * Zeebe (camel-zeebe)
         * Zeebe component which does integrage with Camunda Zeebe to interact
         * with the API.
         * 
         * Category: process
         * Since: 3.21
         * Maven coordinates: org.apache.camel:camel-zeebe
         * 
         * @return the dsl builder for the headers' name.
         */
        default ZeebeHeaderNameBuilder zeebe() {
            return ZeebeHeaderNameBuilder.INSTANCE;
        }
        /**
         * Zeebe (camel-zeebe)
         * Zeebe component which does integrage with Camunda Zeebe to interact
         * with the API.
         * 
         * Category: process
         * Since: 3.21
         * Maven coordinates: org.apache.camel:camel-zeebe
         * 
         * Syntax: <code>zeebe:operationName</code>
         * 
         * Path parameter: operationName (required)
         * The operation to use
         * There are 9 enums and the value can be one of: startProcess,
         * cancelProcess, publishMessage, completeJob, failJob,
         * updateJobRetries, worker, throwError, deployResource
         * 
         * @param path operationName
         * @return the dsl builder
         */
        default ZeebeEndpointBuilder zeebe(String path) {
            return ZeebeEndpointBuilderFactory.endpointBuilder("zeebe", path);
        }
        /**
         * Zeebe (camel-zeebe)
         * Zeebe component which does integrage with Camunda Zeebe to interact
         * with the API.
         * 
         * Category: process
         * Since: 3.21
         * Maven coordinates: org.apache.camel:camel-zeebe
         * 
         * Syntax: <code>zeebe:operationName</code>
         * 
         * Path parameter: operationName (required)
         * The operation to use
         * There are 9 enums and the value can be one of: startProcess,
         * cancelProcess, publishMessage, completeJob, failJob,
         * updateJobRetries, worker, throwError, deployResource
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path operationName
         * @return the dsl builder
         */
        default ZeebeEndpointBuilder zeebe(String componentName, String path) {
            return ZeebeEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }

    /**
     * The builder of headers' name for the Zeebe component.
     */
    public static class ZeebeHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final ZeebeHeaderNameBuilder INSTANCE = new ZeebeHeaderNameBuilder();

        /**
         * The name of the resource.
         * 
         * The option is a: {@code } type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code ZeebeResourceName}.
         */
        public String zeebeResourceName() {
            return "ZeebeResourceName";
        }

        /**
         * True if the operation was successful.
         * 
         * The option is a: {@code } type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code ZeebeIsSuccess}.
         */
        public String zeebeIsSuccess() {
            return "ZeebeIsSuccess";
        }

        /**
         * In case of an error, the error message.
         * 
         * The option is a: {@code } type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code ZeebeErrorMessage}.
         */
        public String zeebeErrorMessage() {
            return "ZeebeErrorMessage";
        }

        /**
         * In case of an error, the error code if available.
         * 
         * The option is a: {@code } type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code ZeebeErrorCode}.
         */
        public String zeebeErrorCode() {
            return "ZeebeErrorCode";
        }

        /**
         * The process ID of a deployed process.
         * 
         * The option is a: {@code } type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code ZeebeBPMNProcessId}.
         */
        public String zeebeBPMNProcessId() {
            return "ZeebeBPMNProcessId";
        }

        /**
         * The version of a deployed process.
         * 
         * The option is a: {@code } type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code ZeebeVersion}.
         */
        public String zeebeVersion() {
            return "ZeebeVersion";
        }

        /**
         * The process definition key of a deployed process.
         * 
         * The option is a: {@code } type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code ZeebeProcessDefinitionKey}.
         */
        public String zeebeProcessDefinitionKey() {
            return "ZeebeProcessDefinitionKey";
        }
    }
    static ZeebeEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class ZeebeEndpointBuilderImpl extends AbstractEndpointBuilder implements ZeebeEndpointBuilder, AdvancedZeebeEndpointBuilder {
            public ZeebeEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new ZeebeEndpointBuilderImpl(path);
    }
}