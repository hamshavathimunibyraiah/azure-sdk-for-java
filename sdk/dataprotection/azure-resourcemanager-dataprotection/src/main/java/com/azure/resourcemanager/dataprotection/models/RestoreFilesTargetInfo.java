// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Class encapsulating restore as files target parameters.
 */
@Fluent
public final class RestoreFilesTargetInfo extends RestoreTargetInfoBase {
    /*
     * Type of Datasource object, used to initialize the right inherited type
     */
    private String objectType = "RestoreFilesTargetInfo";

    /*
     * Destination of RestoreAsFiles operation, when destination is not a datasource
     */
    private TargetDetails targetDetails;

    /**
     * Creates an instance of RestoreFilesTargetInfo class.
     */
    public RestoreFilesTargetInfo() {
    }

    /**
     * Get the objectType property: Type of Datasource object, used to initialize the right inherited type.
     * 
     * @return the objectType value.
     */
    @Override
    public String objectType() {
        return this.objectType;
    }

    /**
     * Get the targetDetails property: Destination of RestoreAsFiles operation, when destination is not a datasource.
     * 
     * @return the targetDetails value.
     */
    public TargetDetails targetDetails() {
        return this.targetDetails;
    }

    /**
     * Set the targetDetails property: Destination of RestoreAsFiles operation, when destination is not a datasource.
     * 
     * @param targetDetails the targetDetails value to set.
     * @return the RestoreFilesTargetInfo object itself.
     */
    public RestoreFilesTargetInfo withTargetDetails(TargetDetails targetDetails) {
        this.targetDetails = targetDetails;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RestoreFilesTargetInfo withRecoveryOption(RecoveryOption recoveryOption) {
        super.withRecoveryOption(recoveryOption);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RestoreFilesTargetInfo withRestoreLocation(String restoreLocation) {
        super.withRestoreLocation(restoreLocation);
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
        if (targetDetails() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property targetDetails in model RestoreFilesTargetInfo"));
        } else {
            targetDetails().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RestoreFilesTargetInfo.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("recoveryOption", recoveryOption() == null ? null : recoveryOption().toString());
        jsonWriter.writeStringField("restoreLocation", restoreLocation());
        jsonWriter.writeJsonField("targetDetails", this.targetDetails);
        jsonWriter.writeStringField("objectType", this.objectType);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RestoreFilesTargetInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RestoreFilesTargetInfo if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RestoreFilesTargetInfo.
     */
    public static RestoreFilesTargetInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RestoreFilesTargetInfo deserializedRestoreFilesTargetInfo = new RestoreFilesTargetInfo();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("recoveryOption".equals(fieldName)) {
                    deserializedRestoreFilesTargetInfo
                        .withRecoveryOption(RecoveryOption.fromString(reader.getString()));
                } else if ("restoreLocation".equals(fieldName)) {
                    deserializedRestoreFilesTargetInfo.withRestoreLocation(reader.getString());
                } else if ("targetDetails".equals(fieldName)) {
                    deserializedRestoreFilesTargetInfo.targetDetails = TargetDetails.fromJson(reader);
                } else if ("objectType".equals(fieldName)) {
                    deserializedRestoreFilesTargetInfo.objectType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRestoreFilesTargetInfo;
        });
    }
}
