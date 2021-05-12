// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for InvoiceStatus. */
public final class InvoiceStatus extends ExpandableStringEnum<InvoiceStatus> {
    /** Static value Due for InvoiceStatus. */
    public static final InvoiceStatus DUE = fromString("Due");

    /** Static value OverDue for InvoiceStatus. */
    public static final InvoiceStatus OVER_DUE = fromString("OverDue");

    /** Static value Paid for InvoiceStatus. */
    public static final InvoiceStatus PAID = fromString("Paid");

    /** Static value Void for InvoiceStatus. */
    public static final InvoiceStatus VOID = fromString("Void");

    /**
     * Creates or finds a InvoiceStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding InvoiceStatus.
     */
    @JsonCreator
    public static InvoiceStatus fromString(String name) {
        return fromString(name, InvoiceStatus.class);
    }

    /** @return known InvoiceStatus values. */
    public static Collection<InvoiceStatus> values() {
        return values(InvoiceStatus.class);
    }
}
