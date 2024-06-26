// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;

/**
 * Container for SQL workloads under Azure Virtual Machines.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "containerType",
    defaultImpl = AzureVMAppContainerProtectionContainer.class,
    visible = true)
@JsonTypeName("VMAppContainer")
@Fluent
public final class AzureVMAppContainerProtectionContainer extends AzureWorkloadContainer {
    /*
     * Type of the container. The value of this property for: 1. Compute Azure VM is Microsoft.Compute/virtualMachines 2.
     * Classic Compute Azure VM is Microsoft.ClassicCompute/virtualMachines 3. Windows machines (like MAB, DPM etc) is
     * Windows 4. Azure SQL instance is AzureSqlContainer. 5. Storage containers is StorageContainer. 6. Azure workload
     * Backup is VMAppContainer
     */
    @JsonTypeId
    @JsonProperty(value = "containerType", required = true)
    private ProtectableContainerType containerType = ProtectableContainerType.VMAPP_CONTAINER;

    /**
     * Creates an instance of AzureVMAppContainerProtectionContainer class.
     */
    public AzureVMAppContainerProtectionContainer() {
    }

    /**
     * Get the containerType property: Type of the container. The value of this property for: 1. Compute Azure VM is
     * Microsoft.Compute/virtualMachines 2.
     * Classic Compute Azure VM is Microsoft.ClassicCompute/virtualMachines 3. Windows machines (like MAB, DPM etc) is
     * Windows 4. Azure SQL instance is AzureSqlContainer. 5. Storage containers is StorageContainer. 6. Azure workload
     * Backup is VMAppContainer.
     * 
     * @return the containerType value.
     */
    @Override
    public ProtectableContainerType containerType() {
        return this.containerType;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVMAppContainerProtectionContainer withSourceResourceId(String sourceResourceId) {
        super.withSourceResourceId(sourceResourceId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVMAppContainerProtectionContainer withLastUpdatedTime(OffsetDateTime lastUpdatedTime) {
        super.withLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVMAppContainerProtectionContainer withExtendedInfo(AzureWorkloadContainerExtendedInfo extendedInfo) {
        super.withExtendedInfo(extendedInfo);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVMAppContainerProtectionContainer withWorkloadType(WorkloadType workloadType) {
        super.withWorkloadType(workloadType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVMAppContainerProtectionContainer withOperationType(OperationType operationType) {
        super.withOperationType(operationType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVMAppContainerProtectionContainer withFriendlyName(String friendlyName) {
        super.withFriendlyName(friendlyName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVMAppContainerProtectionContainer withBackupManagementType(BackupManagementType backupManagementType) {
        super.withBackupManagementType(backupManagementType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVMAppContainerProtectionContainer withRegistrationStatus(String registrationStatus) {
        super.withRegistrationStatus(registrationStatus);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVMAppContainerProtectionContainer withHealthStatus(String healthStatus) {
        super.withHealthStatus(healthStatus);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureVMAppContainerProtectionContainer withProtectableObjectType(String protectableObjectType) {
        super.withProtectableObjectType(protectableObjectType);
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
}
