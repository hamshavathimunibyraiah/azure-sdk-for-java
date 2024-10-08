// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.azurestackhci.models.HealthState;
import com.azure.resourcemanager.azurestackhci.models.PackageVersionInfo;
import com.azure.resourcemanager.azurestackhci.models.PrecheckResult;
import com.azure.resourcemanager.azurestackhci.models.ProvisioningState;
import com.azure.resourcemanager.azurestackhci.models.UpdateSummariesPropertiesState;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Get the update summaries for the cluster.
 */
@Fluent
public final class UpdateSummariesInner extends ProxyResource {
    /*
     * The geo-location where the resource lives
     */
    private String location;

    /*
     * Update summaries properties
     */
    private UpdateSummariesProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    private SystemData systemData;

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

    /**
     * Creates an instance of UpdateSummariesInner class.
     */
    public UpdateSummariesInner() {
    }

    /**
     * Get the location property: The geo-location where the resource lives.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The geo-location where the resource lives.
     * 
     * @param location the location value to set.
     * @return the UpdateSummariesInner object itself.
     */
    public UpdateSummariesInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the innerProperties property: Update summaries properties.
     * 
     * @return the innerProperties value.
     */
    private UpdateSummariesProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
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
     * Get the provisioningState property: Provisioning state of the UpdateSummaries proxy resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the oemFamily property: OEM family name.
     * 
     * @return the oemFamily value.
     */
    public String oemFamily() {
        return this.innerProperties() == null ? null : this.innerProperties().oemFamily();
    }

    /**
     * Set the oemFamily property: OEM family name.
     * 
     * @param oemFamily the oemFamily value to set.
     * @return the UpdateSummariesInner object itself.
     */
    public UpdateSummariesInner withOemFamily(String oemFamily) {
        if (this.innerProperties() == null) {
            this.innerProperties = new UpdateSummariesProperties();
        }
        this.innerProperties().withOemFamily(oemFamily);
        return this;
    }

    /**
     * Get the currentOemVersion property: Current OEM Version.
     * 
     * @return the currentOemVersion value.
     */
    public String currentOemVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().currentOemVersion();
    }

    /**
     * Set the currentOemVersion property: Current OEM Version.
     * 
     * @param currentOemVersion the currentOemVersion value to set.
     * @return the UpdateSummariesInner object itself.
     */
    public UpdateSummariesInner withCurrentOemVersion(String currentOemVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new UpdateSummariesProperties();
        }
        this.innerProperties().withCurrentOemVersion(currentOemVersion);
        return this;
    }

    /**
     * Get the hardwareModel property: Name of the hardware model.
     * 
     * @return the hardwareModel value.
     */
    public String hardwareModel() {
        return this.innerProperties() == null ? null : this.innerProperties().hardwareModel();
    }

    /**
     * Set the hardwareModel property: Name of the hardware model.
     * 
     * @param hardwareModel the hardwareModel value to set.
     * @return the UpdateSummariesInner object itself.
     */
    public UpdateSummariesInner withHardwareModel(String hardwareModel) {
        if (this.innerProperties() == null) {
            this.innerProperties = new UpdateSummariesProperties();
        }
        this.innerProperties().withHardwareModel(hardwareModel);
        return this;
    }

    /**
     * Get the packageVersions property: Current version of each updatable component.
     * 
     * @return the packageVersions value.
     */
    public List<PackageVersionInfo> packageVersions() {
        return this.innerProperties() == null ? null : this.innerProperties().packageVersions();
    }

    /**
     * Set the packageVersions property: Current version of each updatable component.
     * 
     * @param packageVersions the packageVersions value to set.
     * @return the UpdateSummariesInner object itself.
     */
    public UpdateSummariesInner withPackageVersions(List<PackageVersionInfo> packageVersions) {
        if (this.innerProperties() == null) {
            this.innerProperties = new UpdateSummariesProperties();
        }
        this.innerProperties().withPackageVersions(packageVersions);
        return this;
    }

    /**
     * Get the currentVersion property: Current Solution Bundle version of the stamp.
     * 
     * @return the currentVersion value.
     */
    public String currentVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().currentVersion();
    }

    /**
     * Set the currentVersion property: Current Solution Bundle version of the stamp.
     * 
     * @param currentVersion the currentVersion value to set.
     * @return the UpdateSummariesInner object itself.
     */
    public UpdateSummariesInner withCurrentVersion(String currentVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new UpdateSummariesProperties();
        }
        this.innerProperties().withCurrentVersion(currentVersion);
        return this;
    }

    /**
     * Get the currentSbeVersion property: Current Sbe version of the stamp.
     * 
     * @return the currentSbeVersion value.
     */
    public String currentSbeVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().currentSbeVersion();
    }

    /**
     * Set the currentSbeVersion property: Current Sbe version of the stamp.
     * 
     * @param currentSbeVersion the currentSbeVersion value to set.
     * @return the UpdateSummariesInner object itself.
     */
    public UpdateSummariesInner withCurrentSbeVersion(String currentSbeVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new UpdateSummariesProperties();
        }
        this.innerProperties().withCurrentSbeVersion(currentSbeVersion);
        return this;
    }

    /**
     * Get the lastUpdated property: Last time an update installation completed successfully.
     * 
     * @return the lastUpdated value.
     */
    public OffsetDateTime lastUpdated() {
        return this.innerProperties() == null ? null : this.innerProperties().lastUpdated();
    }

    /**
     * Set the lastUpdated property: Last time an update installation completed successfully.
     * 
     * @param lastUpdated the lastUpdated value to set.
     * @return the UpdateSummariesInner object itself.
     */
    public UpdateSummariesInner withLastUpdated(OffsetDateTime lastUpdated) {
        if (this.innerProperties() == null) {
            this.innerProperties = new UpdateSummariesProperties();
        }
        this.innerProperties().withLastUpdated(lastUpdated);
        return this;
    }

    /**
     * Get the lastChecked property: Last time the update service successfully checked for updates.
     * 
     * @return the lastChecked value.
     */
    public OffsetDateTime lastChecked() {
        return this.innerProperties() == null ? null : this.innerProperties().lastChecked();
    }

    /**
     * Set the lastChecked property: Last time the update service successfully checked for updates.
     * 
     * @param lastChecked the lastChecked value to set.
     * @return the UpdateSummariesInner object itself.
     */
    public UpdateSummariesInner withLastChecked(OffsetDateTime lastChecked) {
        if (this.innerProperties() == null) {
            this.innerProperties = new UpdateSummariesProperties();
        }
        this.innerProperties().withLastChecked(lastChecked);
        return this;
    }

    /**
     * Get the healthState property: Overall health state for update-specific health checks.
     * 
     * @return the healthState value.
     */
    public HealthState healthState() {
        return this.innerProperties() == null ? null : this.innerProperties().healthState();
    }

    /**
     * Set the healthState property: Overall health state for update-specific health checks.
     * 
     * @param healthState the healthState value to set.
     * @return the UpdateSummariesInner object itself.
     */
    public UpdateSummariesInner withHealthState(HealthState healthState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new UpdateSummariesProperties();
        }
        this.innerProperties().withHealthState(healthState);
        return this;
    }

    /**
     * Get the healthCheckResult property: An array of pre-check result objects.
     * 
     * @return the healthCheckResult value.
     */
    public List<PrecheckResult> healthCheckResult() {
        return this.innerProperties() == null ? null : this.innerProperties().healthCheckResult();
    }

    /**
     * Set the healthCheckResult property: An array of pre-check result objects.
     * 
     * @param healthCheckResult the healthCheckResult value to set.
     * @return the UpdateSummariesInner object itself.
     */
    public UpdateSummariesInner withHealthCheckResult(List<PrecheckResult> healthCheckResult) {
        if (this.innerProperties() == null) {
            this.innerProperties = new UpdateSummariesProperties();
        }
        this.innerProperties().withHealthCheckResult(healthCheckResult);
        return this;
    }

    /**
     * Get the healthCheckDate property: Last time the package-specific checks were run.
     * 
     * @return the healthCheckDate value.
     */
    public OffsetDateTime healthCheckDate() {
        return this.innerProperties() == null ? null : this.innerProperties().healthCheckDate();
    }

    /**
     * Set the healthCheckDate property: Last time the package-specific checks were run.
     * 
     * @param healthCheckDate the healthCheckDate value to set.
     * @return the UpdateSummariesInner object itself.
     */
    public UpdateSummariesInner withHealthCheckDate(OffsetDateTime healthCheckDate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new UpdateSummariesProperties();
        }
        this.innerProperties().withHealthCheckDate(healthCheckDate);
        return this;
    }

    /**
     * Get the state property: Overall update state of the stamp.
     * 
     * @return the state value.
     */
    public UpdateSummariesPropertiesState state() {
        return this.innerProperties() == null ? null : this.innerProperties().state();
    }

    /**
     * Set the state property: Overall update state of the stamp.
     * 
     * @param state the state value to set.
     * @return the UpdateSummariesInner object itself.
     */
    public UpdateSummariesInner withState(UpdateSummariesPropertiesState state) {
        if (this.innerProperties() == null) {
            this.innerProperties = new UpdateSummariesProperties();
        }
        this.innerProperties().withState(state);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", this.location);
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of UpdateSummariesInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UpdateSummariesInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the UpdateSummariesInner.
     */
    public static UpdateSummariesInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UpdateSummariesInner deserializedUpdateSummariesInner = new UpdateSummariesInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedUpdateSummariesInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedUpdateSummariesInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedUpdateSummariesInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedUpdateSummariesInner.location = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedUpdateSummariesInner.innerProperties = UpdateSummariesProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedUpdateSummariesInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedUpdateSummariesInner;
        });
    }
}
