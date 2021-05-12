/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Define match conditions.
 */
public class MatchCondition {
    /**
     * List of match variables.
     */
    @JsonProperty(value = "matchVariables", required = true)
    private List<MatchVariable> matchVariables;

    /**
     * The operator to be matched. Possible values include: 'IPMatch', 'Equal',
     * 'Contains', 'LessThan', 'GreaterThan', 'LessThanOrEqual',
     * 'GreaterThanOrEqual', 'BeginsWith', 'EndsWith', 'Regex', 'GeoMatch'.
     */
    @JsonProperty(value = "operator", required = true)
    private WebApplicationFirewallOperator operator;

    /**
     * Whether this is negate condition or not.
     */
    @JsonProperty(value = "negationConditon")
    private Boolean negationConditon;

    /**
     * Match value.
     */
    @JsonProperty(value = "matchValues", required = true)
    private List<String> matchValues;

    /**
     * List of transforms.
     */
    @JsonProperty(value = "transforms")
    private List<WebApplicationFirewallTransform> transforms;

    /**
     * Get list of match variables.
     *
     * @return the matchVariables value
     */
    public List<MatchVariable> matchVariables() {
        return this.matchVariables;
    }

    /**
     * Set list of match variables.
     *
     * @param matchVariables the matchVariables value to set
     * @return the MatchCondition object itself.
     */
    public MatchCondition withMatchVariables(List<MatchVariable> matchVariables) {
        this.matchVariables = matchVariables;
        return this;
    }

    /**
     * Get the operator to be matched. Possible values include: 'IPMatch', 'Equal', 'Contains', 'LessThan', 'GreaterThan', 'LessThanOrEqual', 'GreaterThanOrEqual', 'BeginsWith', 'EndsWith', 'Regex', 'GeoMatch'.
     *
     * @return the operator value
     */
    public WebApplicationFirewallOperator operator() {
        return this.operator;
    }

    /**
     * Set the operator to be matched. Possible values include: 'IPMatch', 'Equal', 'Contains', 'LessThan', 'GreaterThan', 'LessThanOrEqual', 'GreaterThanOrEqual', 'BeginsWith', 'EndsWith', 'Regex', 'GeoMatch'.
     *
     * @param operator the operator value to set
     * @return the MatchCondition object itself.
     */
    public MatchCondition withOperator(WebApplicationFirewallOperator operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Get whether this is negate condition or not.
     *
     * @return the negationConditon value
     */
    public Boolean negationConditon() {
        return this.negationConditon;
    }

    /**
     * Set whether this is negate condition or not.
     *
     * @param negationConditon the negationConditon value to set
     * @return the MatchCondition object itself.
     */
    public MatchCondition withNegationConditon(Boolean negationConditon) {
        this.negationConditon = negationConditon;
        return this;
    }

    /**
     * Get match value.
     *
     * @return the matchValues value
     */
    public List<String> matchValues() {
        return this.matchValues;
    }

    /**
     * Set match value.
     *
     * @param matchValues the matchValues value to set
     * @return the MatchCondition object itself.
     */
    public MatchCondition withMatchValues(List<String> matchValues) {
        this.matchValues = matchValues;
        return this;
    }

    /**
     * Get list of transforms.
     *
     * @return the transforms value
     */
    public List<WebApplicationFirewallTransform> transforms() {
        return this.transforms;
    }

    /**
     * Set list of transforms.
     *
     * @param transforms the transforms value to set
     * @return the MatchCondition object itself.
     */
    public MatchCondition withTransforms(List<WebApplicationFirewallTransform> transforms) {
        this.transforms = transforms;
        return this;
    }

}
