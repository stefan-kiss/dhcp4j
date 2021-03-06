/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *  
 *    http://www.apache.org/licenses/LICENSE-2.0
 *  
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License. 
 *  
 */
package org.apache.directory.server.dhcp.options.tcp;

import org.apache.directory.server.dhcp.options.IntOption;

/**
 * This option specifies the interval (in seconds) that the client TCP
 * should wait before sending a keepalive message on a TCP connection.
 * The time is specified as a 32-bit unsigned integer.  A value of zero
 * indicates that the client should not generate keepalive messages on
 * connections unless specifically requested by an application.
 * 
 * The code for this option is 38, and its length is 4.
 * 
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
public class TcpKeepaliveGarbage extends IntOption {
    /*
     * @see org.apache.directory.server.dhcp.options.DhcpOption#getTag()
     */

    @Override
    public byte getTag() {
        return 38;
    }
}
