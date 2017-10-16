/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.kafka.common.security.auth;

import java.net.InetAddress;

/**
 * An object representing contextual information from the authentication session. See
 * {@link SaslAuthenticationContext} and {@link SslAuthenticationContext}.
 */
public interface AuthenticationContext {
    /**
     * Underlying security protocol of the authentication session.
<<<<<<< HEAD
     */
    SecurityProtocol securityProtocol();
=======
     * @return The name of the security protocol (i.e. PLAINTEXT, SASL_PLAINTEXT, SASL_SSL, SSL)
     */
    String securityProtocolName();
>>>>>>> 74551108ea1e7cb8a09861db4ae63a531bf19e9d

    /**
     * Address of the authenticated client
     */
    InetAddress clientAddress();
}
