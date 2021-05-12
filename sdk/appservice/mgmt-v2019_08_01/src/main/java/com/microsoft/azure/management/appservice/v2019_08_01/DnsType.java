/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for DnsType.
 */
public enum DnsType {
    /** Enum value AzureDns. */
    AZURE_DNS("AzureDns"),

    /** Enum value DefaultDomainRegistrarDns. */
    DEFAULT_DOMAIN_REGISTRAR_DNS("DefaultDomainRegistrarDns");

    /** The actual serialized value for a DnsType instance. */
    private String value;

    DnsType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a DnsType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed DnsType object, or null if unable to parse.
     */
    @JsonCreator
    public static DnsType fromString(String value) {
        DnsType[] items = DnsType.values();
        for (DnsType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
