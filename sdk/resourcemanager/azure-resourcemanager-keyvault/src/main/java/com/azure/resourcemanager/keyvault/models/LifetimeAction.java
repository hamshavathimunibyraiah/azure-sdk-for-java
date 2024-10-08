// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The LifetimeAction model.
 */
@Fluent
public final class LifetimeAction implements JsonSerializable<LifetimeAction> {
    /*
     * The trigger of key rotation policy lifetimeAction.
     */
    private Trigger trigger;

    /*
     * The action of key rotation policy lifetimeAction.
     */
    private Action action;

    /**
     * Creates an instance of LifetimeAction class.
     */
    public LifetimeAction() {
    }

    /**
     * Get the trigger property: The trigger of key rotation policy lifetimeAction.
     * 
     * @return the trigger value.
     */
    public Trigger trigger() {
        return this.trigger;
    }

    /**
     * Set the trigger property: The trigger of key rotation policy lifetimeAction.
     * 
     * @param trigger the trigger value to set.
     * @return the LifetimeAction object itself.
     */
    public LifetimeAction withTrigger(Trigger trigger) {
        this.trigger = trigger;
        return this;
    }

    /**
     * Get the action property: The action of key rotation policy lifetimeAction.
     * 
     * @return the action value.
     */
    public Action action() {
        return this.action;
    }

    /**
     * Set the action property: The action of key rotation policy lifetimeAction.
     * 
     * @param action the action value to set.
     * @return the LifetimeAction object itself.
     */
    public LifetimeAction withAction(Action action) {
        this.action = action;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (trigger() != null) {
            trigger().validate();
        }
        if (action() != null) {
            action().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("trigger", this.trigger);
        jsonWriter.writeJsonField("action", this.action);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LifetimeAction from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LifetimeAction if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the LifetimeAction.
     */
    public static LifetimeAction fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LifetimeAction deserializedLifetimeAction = new LifetimeAction();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("trigger".equals(fieldName)) {
                    deserializedLifetimeAction.trigger = Trigger.fromJson(reader);
                } else if ("action".equals(fieldName)) {
                    deserializedLifetimeAction.action = Action.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLifetimeAction;
        });
    }
}
