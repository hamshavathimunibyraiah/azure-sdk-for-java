// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.netapp.models.VolumeGroupMetadata;
import java.io.IOException;

/**
 * Volume group properties.
 */
@Fluent
public final class VolumeGroupListProperties implements JsonSerializable<VolumeGroupListProperties> {
    /*
     * Azure lifecycle management
     */
    private String provisioningState;

    /*
     * Volume group details
     */
    private VolumeGroupMetadata groupMetadata;

    /**
     * Creates an instance of VolumeGroupListProperties class.
     */
    public VolumeGroupListProperties() {
    }

    /**
     * Get the provisioningState property: Azure lifecycle management.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the groupMetadata property: Volume group details.
     * 
     * @return the groupMetadata value.
     */
    public VolumeGroupMetadata groupMetadata() {
        return this.groupMetadata;
    }

    /**
     * Set the groupMetadata property: Volume group details.
     * 
     * @param groupMetadata the groupMetadata value to set.
     * @return the VolumeGroupListProperties object itself.
     */
    public VolumeGroupListProperties withGroupMetadata(VolumeGroupMetadata groupMetadata) {
        this.groupMetadata = groupMetadata;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (groupMetadata() != null) {
            groupMetadata().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("groupMetaData", this.groupMetadata);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VolumeGroupListProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VolumeGroupListProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VolumeGroupListProperties.
     */
    public static VolumeGroupListProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VolumeGroupListProperties deserializedVolumeGroupListProperties = new VolumeGroupListProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("provisioningState".equals(fieldName)) {
                    deserializedVolumeGroupListProperties.provisioningState = reader.getString();
                } else if ("groupMetaData".equals(fieldName)) {
                    deserializedVolumeGroupListProperties.groupMetadata = VolumeGroupMetadata.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVolumeGroupListProperties;
        });
    }
}
