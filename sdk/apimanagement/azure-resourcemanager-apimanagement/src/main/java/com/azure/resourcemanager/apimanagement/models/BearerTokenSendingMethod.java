// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for BearerTokenSendingMethod. */
public final class BearerTokenSendingMethod extends ExpandableStringEnum<BearerTokenSendingMethod> {
    /** Static value authorizationHeader for BearerTokenSendingMethod. */
    public static final BearerTokenSendingMethod AUTHORIZATION_HEADER = fromString("authorizationHeader");

    /** Static value query for BearerTokenSendingMethod. */
    public static final BearerTokenSendingMethod QUERY = fromString("query");

    /**
     * Creates or finds a BearerTokenSendingMethod from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BearerTokenSendingMethod.
     */
    @JsonCreator
    public static BearerTokenSendingMethod fromString(String name) {
        return fromString(name, BearerTokenSendingMethod.class);
    }

    /** @return known BearerTokenSendingMethod values. */
    public static Collection<BearerTokenSendingMethod> values() {
        return values(BearerTokenSendingMethod.class);
    }
}
