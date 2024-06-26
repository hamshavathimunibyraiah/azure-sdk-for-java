// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.models.CustomJwtAuthenticationManagedIdentity;
import com.azure.resourcemanager.eventgrid.models.CustomJwtAuthenticationManagedIdentityType;
import org.junit.jupiter.api.Assertions;

public final class CustomJwtAuthenticationManagedIdentityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CustomJwtAuthenticationManagedIdentity model
            = BinaryData.fromString("{\"type\":\"UserAssigned\",\"userAssignedIdentity\":\"gz\"}")
                .toObject(CustomJwtAuthenticationManagedIdentity.class);
        Assertions.assertEquals(CustomJwtAuthenticationManagedIdentityType.USER_ASSIGNED, model.type());
        Assertions.assertEquals("gz", model.userAssignedIdentity());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CustomJwtAuthenticationManagedIdentity model = new CustomJwtAuthenticationManagedIdentity()
            .withType(CustomJwtAuthenticationManagedIdentityType.USER_ASSIGNED)
            .withUserAssignedIdentity("gz");
        model = BinaryData.fromObject(model).toObject(CustomJwtAuthenticationManagedIdentity.class);
        Assertions.assertEquals(CustomJwtAuthenticationManagedIdentityType.USER_ASSIGNED, model.type());
        Assertions.assertEquals("gz", model.userAssignedIdentity());
    }
}
