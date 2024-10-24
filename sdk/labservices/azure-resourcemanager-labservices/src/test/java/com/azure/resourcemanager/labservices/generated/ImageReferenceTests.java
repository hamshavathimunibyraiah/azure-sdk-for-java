// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.labservices.models.ImageReference;
import org.junit.jupiter.api.Assertions;

public final class ImageReferenceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ImageReference model = BinaryData.fromString(
            "{\"id\":\"ytlmoyrxvwfud\",\"offer\":\"zntxhdz\",\"publisher\":\"rqjbhckfrl\",\"sku\":\"xsbkyvpyca\",\"version\":\"z\",\"exactVersion\":\"zka\"}")
            .toObject(ImageReference.class);
        Assertions.assertEquals("ytlmoyrxvwfud", model.id());
        Assertions.assertEquals("zntxhdz", model.offer());
        Assertions.assertEquals("rqjbhckfrl", model.publisher());
        Assertions.assertEquals("xsbkyvpyca", model.sku());
        Assertions.assertEquals("z", model.version());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ImageReference model = new ImageReference().withId("ytlmoyrxvwfud")
            .withOffer("zntxhdz")
            .withPublisher("rqjbhckfrl")
            .withSku("xsbkyvpyca")
            .withVersion("z");
        model = BinaryData.fromObject(model).toObject(ImageReference.class);
        Assertions.assertEquals("ytlmoyrxvwfud", model.id());
        Assertions.assertEquals("zntxhdz", model.offer());
        Assertions.assertEquals("rqjbhckfrl", model.publisher());
        Assertions.assertEquals("xsbkyvpyca", model.sku());
        Assertions.assertEquals("z", model.version());
    }
}
