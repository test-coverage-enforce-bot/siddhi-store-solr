/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.extension.siddhi.store.solr.beans;

import org.apache.solr.common.SolrInputDocument;
import org.wso2.extension.siddhi.store.solr.utils.SolrTableUtils;

import java.util.Map;

/**
 * This represents a Solr document which is created from a DAL record.
 */
public class SiddhiSolrDocument extends SolrInputDocument {


    private static final long serialVersionUID = -2176046055014616443L;

    public SiddhiSolrDocument(String... fields) {
        super(fields);
    }

    public SiddhiSolrDocument(Map<String, SiddhiSolrDocumentField> fields) {
        super(SolrTableUtils.getSolrFields(fields));
    }
}
