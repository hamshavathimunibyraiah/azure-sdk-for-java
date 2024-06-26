// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The comparison rule.
 */
@Fluent
public final class ComparisonRule {
    /*
     * The comparison operator.
     */
    @JsonProperty(value = "operator", required = true)
    private ComparisonOperator operator;

    /*
     * Threshold setting.
     */
    @JsonProperty(value = "threshold", required = true)
    private float threshold;

    /**
     * Creates an instance of ComparisonRule class.
     */
    public ComparisonRule() {
    }

    /**
     * Get the operator property: The comparison operator.
     * 
     * @return the operator value.
     */
    public ComparisonOperator operator() {
        return this.operator;
    }

    /**
     * Set the operator property: The comparison operator.
     * 
     * @param operator the operator value to set.
     * @return the ComparisonRule object itself.
     */
    public ComparisonRule withOperator(ComparisonOperator operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Get the threshold property: Threshold setting.
     * 
     * @return the threshold value.
     */
    public float threshold() {
        return this.threshold;
    }

    /**
     * Set the threshold property: Threshold setting.
     * 
     * @param threshold the threshold value to set.
     * @return the ComparisonRule object itself.
     */
    public ComparisonRule withThreshold(float threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (operator() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property operator in model ComparisonRule"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ComparisonRule.class);
}
