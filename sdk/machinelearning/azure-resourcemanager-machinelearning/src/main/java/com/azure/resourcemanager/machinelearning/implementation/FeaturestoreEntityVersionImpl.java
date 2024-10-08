// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearning.fluent.models.FeaturestoreEntityVersionInner;
import com.azure.resourcemanager.machinelearning.models.FeaturestoreEntityVersion;
import com.azure.resourcemanager.machinelearning.models.FeaturestoreEntityVersionProperties;

public final class FeaturestoreEntityVersionImpl
    implements FeaturestoreEntityVersion, FeaturestoreEntityVersion.Definition, FeaturestoreEntityVersion.Update {
    private FeaturestoreEntityVersionInner innerObject;

    private final com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public FeaturestoreEntityVersionProperties properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public FeaturestoreEntityVersionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.machinelearning.MachineLearningManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String workspaceName;

    private String name;

    private String version;

    public FeaturestoreEntityVersionImpl withExistingFeaturestoreEntity(String resourceGroupName, String workspaceName,
        String name) {
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        this.name = name;
        return this;
    }

    public FeaturestoreEntityVersion create() {
        this.innerObject = serviceManager.serviceClient()
            .getFeaturestoreEntityVersions()
            .createOrUpdate(resourceGroupName, workspaceName, name, version, this.innerModel(), Context.NONE);
        return this;
    }

    public FeaturestoreEntityVersion create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getFeaturestoreEntityVersions()
            .createOrUpdate(resourceGroupName, workspaceName, name, version, this.innerModel(), context);
        return this;
    }

    FeaturestoreEntityVersionImpl(String name,
        com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager) {
        this.innerObject = new FeaturestoreEntityVersionInner();
        this.serviceManager = serviceManager;
        this.version = name;
    }

    public FeaturestoreEntityVersionImpl update() {
        return this;
    }

    public FeaturestoreEntityVersion apply() {
        this.innerObject = serviceManager.serviceClient()
            .getFeaturestoreEntityVersions()
            .createOrUpdate(resourceGroupName, workspaceName, name, version, this.innerModel(), Context.NONE);
        return this;
    }

    public FeaturestoreEntityVersion apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getFeaturestoreEntityVersions()
            .createOrUpdate(resourceGroupName, workspaceName, name, version, this.innerModel(), context);
        return this;
    }

    FeaturestoreEntityVersionImpl(FeaturestoreEntityVersionInner innerObject,
        com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.workspaceName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "workspaces");
        this.name = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "featurestoreEntities");
        this.version = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "versions");
    }

    public FeaturestoreEntityVersion refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getFeaturestoreEntityVersions()
            .getWithResponse(resourceGroupName, workspaceName, name, version, Context.NONE)
            .getValue();
        return this;
    }

    public FeaturestoreEntityVersion refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getFeaturestoreEntityVersions()
            .getWithResponse(resourceGroupName, workspaceName, name, version, context)
            .getValue();
        return this;
    }

    public FeaturestoreEntityVersionImpl withProperties(FeaturestoreEntityVersionProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }
}
