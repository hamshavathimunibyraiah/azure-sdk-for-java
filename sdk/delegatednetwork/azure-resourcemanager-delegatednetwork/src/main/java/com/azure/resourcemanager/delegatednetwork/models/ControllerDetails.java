// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.delegatednetwork.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** controller details. */
@Fluent
public final class ControllerDetails {
    /*
     * controller arm resource id
     */
    @JsonProperty(value = "id")
    private String id;

    /** Creates an instance of ControllerDetails class. */
    public ControllerDetails() {
    }

    /**
     * Get the id property: controller arm resource id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: controller arm resource id.
     *
     * @param id the id value to set.
     * @return the ControllerDetails object itself.
     */
    public ControllerDetails withId(String id) {
        this.id = id;
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
