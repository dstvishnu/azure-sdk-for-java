// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for QueryAnswer. */
public final class QueryAnswer extends ExpandableStringEnum<QueryAnswer> {
    /** Static value none for QueryAnswer. */
    public static final QueryAnswer NONE = fromString("none");

    /** Static value extractive for QueryAnswer. */
    public static final QueryAnswer EXTRACTIVE = fromString("extractive");

    /**
     * Creates or finds a QueryAnswer from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding QueryAnswer.
     */
    @JsonCreator
    public static QueryAnswer fromString(String name) {
        return fromString(name, QueryAnswer.class);
    }

    /** @return known QueryAnswer values. */
    public static Collection<QueryAnswer> values() {
        return values(QueryAnswer.class);
    }
}
