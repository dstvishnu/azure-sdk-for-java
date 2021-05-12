/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_06_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The unique key on that enforces uniqueness constraint on documents in the
 * collection in the Azure Cosmos DB service.
 */
public class UniqueKey {
    /**
     * List of paths must be unique for each document in the Azure Cosmos DB
     * service.
     */
    @JsonProperty(value = "paths")
    private List<String> paths;

    /**
     * Get list of paths must be unique for each document in the Azure Cosmos DB service.
     *
     * @return the paths value
     */
    public List<String> paths() {
        return this.paths;
    }

    /**
     * Set list of paths must be unique for each document in the Azure Cosmos DB service.
     *
     * @param paths the paths value to set
     * @return the UniqueKey object itself.
     */
    public UniqueKey withPaths(List<String> paths) {
        this.paths = paths;
        return this;
    }

}
