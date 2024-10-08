// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

/**
 * Samples for Clusters ListServiceConfigs.
 */
public final class ClustersListServiceConfigsSamples {
    /*
     * x-ms-original-file:
     * specification/hdinsight/resource-manager/Microsoft.HDInsight/HDInsightOnAks/preview/2024-05-01-preview/examples/
     * ListClusterServiceConfigs.json
     */
    /**
     * Sample code: HDInsightClusterGetServiceConfigs.
     * 
     * @param manager Entry point to HDInsightContainersManager.
     */
    public static void hDInsightClusterGetServiceConfigs(
        com.azure.resourcemanager.hdinsight.containers.HDInsightContainersManager manager) {
        manager.clusters().listServiceConfigs("rg1", "clusterPool1", "cluster1", com.azure.core.util.Context.NONE);
    }
}
