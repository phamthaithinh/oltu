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
package org.apache.amber.signature;

import java.net.URL;
import java.util.Collection;
import java.util.HashSet;

import org.apache.amber.HTTPMethod;
import org.apache.amber.OAuthMessageParameter;
import org.apache.amber.OAuthRequest;
import org.apache.amber.OAuthRequestParameter;

/**
 * 
 * @version $Id$
 */
final class FakeOAuthRequest implements OAuthRequest {

    private HTTPMethod httpMethod;

    private URL requestURL;

    private final Collection<OAuthMessageParameter> messageParameters = new HashSet<OAuthMessageParameter>();

    private final Collection<OAuthRequestParameter> requestParameters = new HashSet<OAuthRequestParameter>();

    public void addOAuthMessageParameter(OAuthMessageParameter parameter) {
        this.messageParameters.add(parameter);
    }

    public void addOAuthRequestParameter(OAuthRequestParameter parameter) {
        this.requestParameters.add(parameter);
    }

    public HTTPMethod getHTTPMethod() {
        return this.httpMethod;
    }

    public void setHTTPMethod(HTTPMethod httpMethod) {
        this.httpMethod = httpMethod;
    }

    public Collection<OAuthMessageParameter> getOAuthMessageParameters() {
        return this.messageParameters;
    }

    public Collection<OAuthRequestParameter> getOAuthRequestParameters() {
        return this.requestParameters;
    }

    public URL getRequestURL() {
        return this.requestURL;
    }

    public void setRequestURL(URL requestURL) {
        this.requestURL = requestURL;
    }

}
