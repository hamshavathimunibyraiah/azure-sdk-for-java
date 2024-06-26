// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The scope and whether it is valid. */
@Fluent
public final class ScopeProperties {
    /*
     * The scope property.
     */
    @JsonProperty(value = "scope")
    private String scope;

    /*
     * The valid property.
     */
    @JsonProperty(value = "valid")
    private Boolean valid;

    /** Creates an instance of ScopeProperties class. */
    public ScopeProperties() {
    }

    /**
     * Get the scope property: The scope property.
     *
     * @return the scope value.
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Set the scope property: The scope property.
     *
     * @param scope the scope value to set.
     * @return the ScopeProperties object itself.
     */
    public ScopeProperties withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the valid property: The valid property.
     *
     * @return the valid value.
     */
    public Boolean valid() {
        return this.valid;
    }

    /**
     * Set the valid property: The valid property.
     *
     * @param valid the valid value to set.
     * @return the ScopeProperties object itself.
     */
    public ScopeProperties withValid(Boolean valid) {
        this.valid = valid;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
