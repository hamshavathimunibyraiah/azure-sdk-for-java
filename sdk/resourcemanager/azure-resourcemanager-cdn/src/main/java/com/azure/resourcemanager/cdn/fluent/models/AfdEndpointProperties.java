// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.cdn.models.AfdProvisioningState;
import com.azure.resourcemanager.cdn.models.AutoGeneratedDomainNameLabelScope;
import com.azure.resourcemanager.cdn.models.DeploymentStatus;
import com.azure.resourcemanager.cdn.models.EnabledState;
import java.io.IOException;

/**
 * The JSON object that contains the properties required to create an endpoint.
 */
@Fluent
public final class AfdEndpointProperties extends AfdEndpointPropertiesUpdateParameters {
    /*
     * The host name of the endpoint structured as {endpointName}.{DNSZone}, e.g. contoso.azureedge.net
     */
    private String hostname;

    /*
     * Indicates the endpoint name reuse scope. The default value is TenantReuse.
     */
    private AutoGeneratedDomainNameLabelScope autoGeneratedDomainNameLabelScope;

    /*
     * Provisioning status
     */
    private AfdProvisioningState provisioningState;

    /*
     * The deploymentStatus property.
     */
    private DeploymentStatus deploymentStatus;

    /*
     * The name of the profile which holds the endpoint.
     */
    private String profileName;

    /**
     * Creates an instance of AfdEndpointProperties class.
     */
    public AfdEndpointProperties() {
    }

    /**
     * Get the hostname property: The host name of the endpoint structured as {endpointName}.{DNSZone}, e.g.
     * contoso.azureedge.net.
     * 
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Get the autoGeneratedDomainNameLabelScope property: Indicates the endpoint name reuse scope. The default value is
     * TenantReuse.
     * 
     * @return the autoGeneratedDomainNameLabelScope value.
     */
    public AutoGeneratedDomainNameLabelScope autoGeneratedDomainNameLabelScope() {
        return this.autoGeneratedDomainNameLabelScope;
    }

    /**
     * Set the autoGeneratedDomainNameLabelScope property: Indicates the endpoint name reuse scope. The default value is
     * TenantReuse.
     * 
     * @param autoGeneratedDomainNameLabelScope the autoGeneratedDomainNameLabelScope value to set.
     * @return the AfdEndpointProperties object itself.
     */
    public AfdEndpointProperties
        withAutoGeneratedDomainNameLabelScope(AutoGeneratedDomainNameLabelScope autoGeneratedDomainNameLabelScope) {
        this.autoGeneratedDomainNameLabelScope = autoGeneratedDomainNameLabelScope;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning status.
     * 
     * @return the provisioningState value.
     */
    public AfdProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the deploymentStatus property: The deploymentStatus property.
     * 
     * @return the deploymentStatus value.
     */
    public DeploymentStatus deploymentStatus() {
        return this.deploymentStatus;
    }

    /**
     * Get the profileName property: The name of the profile which holds the endpoint.
     * 
     * @return the profileName value.
     */
    @Override
    public String profileName() {
        return this.profileName;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AfdEndpointProperties withEnabledState(EnabledState enabledState) {
        super.withEnabledState(enabledState);
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
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("enabledState", enabledState() == null ? null : enabledState().toString());
        jsonWriter.writeStringField("autoGeneratedDomainNameLabelScope",
            this.autoGeneratedDomainNameLabelScope == null ? null : this.autoGeneratedDomainNameLabelScope.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AfdEndpointProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AfdEndpointProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AfdEndpointProperties.
     */
    public static AfdEndpointProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AfdEndpointProperties deserializedAfdEndpointProperties = new AfdEndpointProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("profileName".equals(fieldName)) {
                    deserializedAfdEndpointProperties.profileName = reader.getString();
                } else if ("enabledState".equals(fieldName)) {
                    deserializedAfdEndpointProperties.withEnabledState(EnabledState.fromString(reader.getString()));
                } else if ("hostName".equals(fieldName)) {
                    deserializedAfdEndpointProperties.hostname = reader.getString();
                } else if ("autoGeneratedDomainNameLabelScope".equals(fieldName)) {
                    deserializedAfdEndpointProperties.autoGeneratedDomainNameLabelScope
                        = AutoGeneratedDomainNameLabelScope.fromString(reader.getString());
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedAfdEndpointProperties.provisioningState
                        = AfdProvisioningState.fromString(reader.getString());
                } else if ("deploymentStatus".equals(fieldName)) {
                    deserializedAfdEndpointProperties.deploymentStatus
                        = DeploymentStatus.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAfdEndpointProperties;
        });
    }
}
