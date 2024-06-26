// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagemover.models.EndpointBaseProperties;
import org.junit.jupiter.api.Assertions;

public final class EndpointBasePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EndpointBaseProperties model = BinaryData.fromString(
            "{\"endpointType\":\"EndpointBaseProperties\",\"description\":\"ufizuckyf\",\"provisioningState\":\"Failed\"}")
            .toObject(EndpointBaseProperties.class);
        Assertions.assertEquals("ufizuckyf", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EndpointBaseProperties model = new EndpointBaseProperties().withDescription("ufizuckyf");
        model = BinaryData.fromObject(model).toObject(EndpointBaseProperties.class);
        Assertions.assertEquals("ufizuckyf", model.description());
    }
}
