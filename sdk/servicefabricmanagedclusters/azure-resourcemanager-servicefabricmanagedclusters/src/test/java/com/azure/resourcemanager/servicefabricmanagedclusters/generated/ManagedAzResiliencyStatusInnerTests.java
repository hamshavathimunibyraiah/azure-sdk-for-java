// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmanagedclusters.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.servicefabricmanagedclusters.fluent.models.ManagedAzResiliencyStatusInner;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.ResourceAzStatus;
import java.util.Arrays;

public final class ManagedAzResiliencyStatusInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagedAzResiliencyStatusInner model = BinaryData.fromString(
            "{\"baseResourceStatus\":[{\"resourceName\":\"iftohqkvpu\",\"resourceType\":\"sgplsakn\",\"isZoneResilient\":true,\"details\":\"ynl\"},{\"resourceName\":\"huopxodlqiynto\",\"resourceType\":\"ihleos\",\"isZoneResilient\":false,\"details\":\"rmslyzrpzbchckqq\"},{\"resourceName\":\"ioxiysuiizyn\",\"resourceType\":\"dy\",\"isZoneResilient\":true,\"details\":\"yhqmibzyhwi\"},{\"resourceName\":\"mypyynpcdpu\",\"resourceType\":\"zgmwznmabikns\",\"isZoneResilient\":false,\"details\":\"hxbld\"}],\"isClusterZoneResilient\":true}")
            .toObject(ManagedAzResiliencyStatusInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagedAzResiliencyStatusInner model = new ManagedAzResiliencyStatusInner().withBaseResourceStatus(Arrays
            .asList(new ResourceAzStatus(), new ResourceAzStatus(), new ResourceAzStatus(), new ResourceAzStatus()));
        model = BinaryData.fromObject(model).toObject(ManagedAzResiliencyStatusInner.class);
    }
}
