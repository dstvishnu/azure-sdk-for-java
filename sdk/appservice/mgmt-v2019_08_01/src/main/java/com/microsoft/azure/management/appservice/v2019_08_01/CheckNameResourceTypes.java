/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for CheckNameResourceTypes.
 */
public final class CheckNameResourceTypes extends ExpandableStringEnum<CheckNameResourceTypes> {
    /** Static value Site for CheckNameResourceTypes. */
    public static final CheckNameResourceTypes SITE = fromString("Site");

    /** Static value Slot for CheckNameResourceTypes. */
    public static final CheckNameResourceTypes SLOT = fromString("Slot");

    /** Static value HostingEnvironment for CheckNameResourceTypes. */
    public static final CheckNameResourceTypes HOSTING_ENVIRONMENT = fromString("HostingEnvironment");

    /** Static value PublishingUser for CheckNameResourceTypes. */
    public static final CheckNameResourceTypes PUBLISHING_USER = fromString("PublishingUser");

    /** Static value Microsoft.Web/sites for CheckNameResourceTypes. */
    public static final CheckNameResourceTypes MICROSOFT_WEBSITES = fromString("Microsoft.Web/sites");

    /** Static value Microsoft.Web/sites/slots for CheckNameResourceTypes. */
    public static final CheckNameResourceTypes MICROSOFT_WEBSITESSLOTS = fromString("Microsoft.Web/sites/slots");

    /** Static value Microsoft.Web/hostingEnvironments for CheckNameResourceTypes. */
    public static final CheckNameResourceTypes MICROSOFT_WEBHOSTING_ENVIRONMENTS = fromString("Microsoft.Web/hostingEnvironments");

    /** Static value Microsoft.Web/publishingUsers for CheckNameResourceTypes. */
    public static final CheckNameResourceTypes MICROSOFT_WEBPUBLISHING_USERS = fromString("Microsoft.Web/publishingUsers");

    /**
     * Creates or finds a CheckNameResourceTypes from its string representation.
     * @param name a name to look for
     * @return the corresponding CheckNameResourceTypes
     */
    @JsonCreator
    public static CheckNameResourceTypes fromString(String name) {
        return fromString(name, CheckNameResourceTypes.class);
    }

    /**
     * @return known CheckNameResourceTypes values
     */
    public static Collection<CheckNameResourceTypes> values() {
        return values(CheckNameResourceTypes.class);
    }
}
