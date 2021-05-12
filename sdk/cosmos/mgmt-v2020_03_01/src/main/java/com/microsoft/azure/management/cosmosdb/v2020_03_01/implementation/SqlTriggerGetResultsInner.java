/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_03_01.implementation;

import com.microsoft.azure.management.cosmosdb.v2020_03_01.SqlTriggerGetPropertiesResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.cosmosdb.v2020_03_01.ARMResourceProperties;

/**
 * An Azure Cosmos DB trigger.
 */
@JsonFlatten
public class SqlTriggerGetResultsInner extends ARMResourceProperties {
    /**
     * The resource property.
     */
    @JsonProperty(value = "properties.resource")
    private SqlTriggerGetPropertiesResource resource;

    /**
     * Get the resource value.
     *
     * @return the resource value
     */
    public SqlTriggerGetPropertiesResource resource() {
        return this.resource;
    }

    /**
     * Set the resource value.
     *
     * @param resource the resource value to set
     * @return the SqlTriggerGetResultsInner object itself.
     */
    public SqlTriggerGetResultsInner withResource(SqlTriggerGetPropertiesResource resource) {
        this.resource = resource;
        return this;
    }

}
