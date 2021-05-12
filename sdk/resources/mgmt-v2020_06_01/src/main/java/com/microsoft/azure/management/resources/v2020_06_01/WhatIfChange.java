/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2020_06_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about a single resource change predicted by What-If operation.
 */
public class WhatIfChange {
    /**
     * Resource ID.
     */
    @JsonProperty(value = "resourceId", required = true)
    private String resourceId;

    /**
     * Type of change that will be made to the resource when the deployment is
     * executed. Possible values include: 'Create', 'Delete', 'Ignore',
     * 'Deploy', 'NoChange', 'Modify'.
     */
    @JsonProperty(value = "changeType", required = true)
    private ChangeType changeType;

    /**
     * The snapshot of the resource before the deployment is executed.
     */
    @JsonProperty(value = "before")
    private Object before;

    /**
     * The predicted snapshot of the resource after the deployment is executed.
     */
    @JsonProperty(value = "after")
    private Object after;

    /**
     * The predicted changes to resource properties.
     */
    @JsonProperty(value = "delta")
    private List<WhatIfPropertyChange> delta;

    /**
     * Get resource ID.
     *
     * @return the resourceId value
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set resource ID.
     *
     * @param resourceId the resourceId value to set
     * @return the WhatIfChange object itself.
     */
    public WhatIfChange withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get type of change that will be made to the resource when the deployment is executed. Possible values include: 'Create', 'Delete', 'Ignore', 'Deploy', 'NoChange', 'Modify'.
     *
     * @return the changeType value
     */
    public ChangeType changeType() {
        return this.changeType;
    }

    /**
     * Set type of change that will be made to the resource when the deployment is executed. Possible values include: 'Create', 'Delete', 'Ignore', 'Deploy', 'NoChange', 'Modify'.
     *
     * @param changeType the changeType value to set
     * @return the WhatIfChange object itself.
     */
    public WhatIfChange withChangeType(ChangeType changeType) {
        this.changeType = changeType;
        return this;
    }

    /**
     * Get the snapshot of the resource before the deployment is executed.
     *
     * @return the before value
     */
    public Object before() {
        return this.before;
    }

    /**
     * Set the snapshot of the resource before the deployment is executed.
     *
     * @param before the before value to set
     * @return the WhatIfChange object itself.
     */
    public WhatIfChange withBefore(Object before) {
        this.before = before;
        return this;
    }

    /**
     * Get the predicted snapshot of the resource after the deployment is executed.
     *
     * @return the after value
     */
    public Object after() {
        return this.after;
    }

    /**
     * Set the predicted snapshot of the resource after the deployment is executed.
     *
     * @param after the after value to set
     * @return the WhatIfChange object itself.
     */
    public WhatIfChange withAfter(Object after) {
        this.after = after;
        return this;
    }

    /**
     * Get the predicted changes to resource properties.
     *
     * @return the delta value
     */
    public List<WhatIfPropertyChange> delta() {
        return this.delta;
    }

    /**
     * Set the predicted changes to resource properties.
     *
     * @param delta the delta value to set
     * @return the WhatIfChange object itself.
     */
    public WhatIfChange withDelta(List<WhatIfPropertyChange> delta) {
        this.delta = delta;
        return this;
    }

}
