/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.amber;

import java.util.Map;

/**
 * An object representing the response returned from an
 * {@link org.apache.amber.client.OAuthClient} or {@link org.apache.amber.server.OAuthServer}.
 *
 * @version $Id$
 * @see org.apache.amber.client.OAuthClient
 */
public interface OAuthResponse {

  public String getLocationUri();

  public String getBody();

  public String getHeader(String name);

  public Map<String, String> getHeaders();

  public int getResponseStatus();

}
