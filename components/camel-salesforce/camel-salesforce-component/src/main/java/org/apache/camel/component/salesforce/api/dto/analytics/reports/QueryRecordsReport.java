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
package org.apache.camel.component.salesforce.api.dto.analytics.reports;

import java.util.List;

import org.apache.camel.component.salesforce.api.dto.AbstractQueryRecordsBase;

/**
 * Salesforce QueryRecords DTO for type Report
 */
public class QueryRecordsReport extends AbstractQueryRecordsBase {

    private List<Report> records;

    public List<Report> getRecords() {
        return records;
    }

    public void setRecords(List<Report> records) {
        this.records = records;
    }
}
