/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.knowledge.qnamaker.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Post body schema for Replace KB operation.
 */
public class ReplaceKbDTO {
    /**
     * List of Q-A (QnADTO) to be added to the knowledgebase. Q-A Ids are
     * assigned by the service and should be omitted.
     */
    @JsonProperty(value = "qnAList", required = true)
    private List<QnADTO> qnAList;

    /**
     * Get the qnAList value.
     *
     * @return the qnAList value
     */
    public List<QnADTO> qnAList() {
        return this.qnAList;
    }

    /**
     * Set the qnAList value.
     *
     * @param qnAList the qnAList value to set
     * @return the ReplaceKbDTO object itself.
     */
    public ReplaceKbDTO withQnAList(List<QnADTO> qnAList) {
        this.qnAList = qnAList;
        return this;
    }

}
