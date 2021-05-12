/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Firewall Policy Filter Rule Collection.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ruleCollectionType", defaultImpl = FirewallPolicyFilterRuleCollection.class)
@JsonTypeName("FirewallPolicyFilterRuleCollection")
public class FirewallPolicyFilterRuleCollection extends FirewallPolicyRuleCollection {
    /**
     * The action type of a Filter rule collection.
     */
    @JsonProperty(value = "action")
    private FirewallPolicyFilterRuleCollectionAction action;

    /**
     * List of rules included in a rule collection.
     */
    @JsonProperty(value = "rules")
    private List<FirewallPolicyRule> rules;

    /**
     * Get the action type of a Filter rule collection.
     *
     * @return the action value
     */
    public FirewallPolicyFilterRuleCollectionAction action() {
        return this.action;
    }

    /**
     * Set the action type of a Filter rule collection.
     *
     * @param action the action value to set
     * @return the FirewallPolicyFilterRuleCollection object itself.
     */
    public FirewallPolicyFilterRuleCollection withAction(FirewallPolicyFilterRuleCollectionAction action) {
        this.action = action;
        return this;
    }

    /**
     * Get list of rules included in a rule collection.
     *
     * @return the rules value
     */
    public List<FirewallPolicyRule> rules() {
        return this.rules;
    }

    /**
     * Set list of rules included in a rule collection.
     *
     * @param rules the rules value to set
     * @return the FirewallPolicyFilterRuleCollection object itself.
     */
    public FirewallPolicyFilterRuleCollection withRules(List<FirewallPolicyRule> rules) {
        this.rules = rules;
        return this;
    }

}
