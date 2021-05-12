/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Vpn Client Parameters for package generation.
 */
public class P2SVpnProfileParameters {
    /**
     * VPN client authentication method. Possible values include: 'EAPTLS',
     * 'EAPMSCHAPv2'.
     */
    @JsonProperty(value = "authenticationMethod")
    private AuthenticationMethod authenticationMethod;

    /**
     * Get vPN client authentication method. Possible values include: 'EAPTLS', 'EAPMSCHAPv2'.
     *
     * @return the authenticationMethod value
     */
    public AuthenticationMethod authenticationMethod() {
        return this.authenticationMethod;
    }

    /**
     * Set vPN client authentication method. Possible values include: 'EAPTLS', 'EAPMSCHAPv2'.
     *
     * @param authenticationMethod the authenticationMethod value to set
     * @return the P2SVpnProfileParameters object itself.
     */
    public P2SVpnProfileParameters withAuthenticationMethod(AuthenticationMethod authenticationMethod) {
        this.authenticationMethod = authenticationMethod;
        return this;
    }

}
