// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.generated;

/**
 * Samples for Evidence Get.
 */
public final class EvidenceGetSamples {
    /*
     * x-ms-original-file:
     * specification/appcomplianceautomation/resource-manager/Microsoft.AppComplianceAutomation/stable/2024-06-27/
     * examples/Evidence_Get.json
     */
    /**
     * Sample code: Evidence_Get.
     * 
     * @param manager Entry point to AppComplianceAutomationManager.
     */
    public static void
        evidenceGet(com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager) {
        manager.evidences().getWithResponse("testReportName", "evidence1", com.azure.core.util.Context.NONE);
    }
}
