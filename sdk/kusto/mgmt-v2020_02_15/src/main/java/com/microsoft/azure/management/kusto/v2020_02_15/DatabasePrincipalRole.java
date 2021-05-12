/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2020_02_15;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for DatabasePrincipalRole.
 */
public final class DatabasePrincipalRole extends ExpandableStringEnum<DatabasePrincipalRole> {
    /** Static value Admin for DatabasePrincipalRole. */
    public static final DatabasePrincipalRole ADMIN = fromString("Admin");

    /** Static value Ingestor for DatabasePrincipalRole. */
    public static final DatabasePrincipalRole INGESTOR = fromString("Ingestor");

    /** Static value Monitor for DatabasePrincipalRole. */
    public static final DatabasePrincipalRole MONITOR = fromString("Monitor");

    /** Static value User for DatabasePrincipalRole. */
    public static final DatabasePrincipalRole USER = fromString("User");

    /** Static value UnrestrictedViewers for DatabasePrincipalRole. */
    public static final DatabasePrincipalRole UNRESTRICTED_VIEWERS = fromString("UnrestrictedViewers");

    /** Static value Viewer for DatabasePrincipalRole. */
    public static final DatabasePrincipalRole VIEWER = fromString("Viewer");

    /**
     * Creates or finds a DatabasePrincipalRole from its string representation.
     * @param name a name to look for
     * @return the corresponding DatabasePrincipalRole
     */
    @JsonCreator
    public static DatabasePrincipalRole fromString(String name) {
        return fromString(name, DatabasePrincipalRole.class);
    }

    /**
     * @return known DatabasePrincipalRole values
     */
    public static Collection<DatabasePrincipalRole> values() {
        return values(DatabasePrincipalRole.class);
    }
}
