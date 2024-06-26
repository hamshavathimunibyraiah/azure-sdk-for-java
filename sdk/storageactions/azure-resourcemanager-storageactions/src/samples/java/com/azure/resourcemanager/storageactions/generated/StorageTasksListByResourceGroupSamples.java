// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storageactions.generated;

/**
 * Samples for StorageTasks ListByResourceGroup.
 */
public final class StorageTasksListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/storageactions/resource-manager/Microsoft.StorageActions/stable/2023-01-01/examples/
     * storageTasksList/ListStorageTasksByResourceGroup.json
     */
    /**
     * Sample code: ListStorageTasksByResourceGroup.
     * 
     * @param manager Entry point to StorageActionsManager.
     */
    public static void
        listStorageTasksByResourceGroup(com.azure.resourcemanager.storageactions.StorageActionsManager manager) {
        manager.storageTasks().listByResourceGroup("res6117", com.azure.core.util.Context.NONE);
    }
}
