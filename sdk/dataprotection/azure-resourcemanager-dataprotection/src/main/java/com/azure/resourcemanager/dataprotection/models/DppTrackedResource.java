// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * The DppTrackedResource model.
 */
@Fluent
public class DppTrackedResource extends DppBaseTrackedResource {
    /*
     * Input Managed Identity Details
     */
    private DppIdentityDetails identity;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    private SystemData systemData;

    /**
     * Creates an instance of DppTrackedResource class.
     */
    public DppTrackedResource() {
    }

    /**
     * Get the identity property: Input Managed Identity Details.
     * 
     * @return the identity value.
     */
    public DppIdentityDetails identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Input Managed Identity Details.
     * 
     * @param identity the identity value to set.
     * @return the DppTrackedResource object itself.
     */
    public DppTrackedResource withIdentity(DppIdentityDetails identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     * 
     * @return the systemData value.
     */
    @Override
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DppTrackedResource withEtag(String etag) {
        super.withEtag(etag);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DppTrackedResource withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DppTrackedResource withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (identity() != null) {
            identity().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("eTag", etag());
        jsonWriter.writeJsonField("identity", this.identity);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DppTrackedResource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DppTrackedResource if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DppTrackedResource.
     */
    public static DppTrackedResource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DppTrackedResource deserializedDppTrackedResource = new DppTrackedResource();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedDppTrackedResource.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedDppTrackedResource.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedDppTrackedResource.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedDppTrackedResource.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedDppTrackedResource.withTags(tags);
                } else if ("eTag".equals(fieldName)) {
                    deserializedDppTrackedResource.withEtag(reader.getString());
                } else if ("systemData".equals(fieldName)) {
                    deserializedDppTrackedResource.systemData = SystemData.fromJson(reader);
                } else if ("identity".equals(fieldName)) {
                    deserializedDppTrackedResource.identity = DppIdentityDetails.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDppTrackedResource;
        });
    }
}
