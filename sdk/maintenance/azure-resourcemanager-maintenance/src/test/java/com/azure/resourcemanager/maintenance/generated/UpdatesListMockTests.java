// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.maintenance.MaintenanceManager;
import com.azure.resourcemanager.maintenance.models.ImpactType;
import com.azure.resourcemanager.maintenance.models.MaintenanceScope;
import com.azure.resourcemanager.maintenance.models.Update;
import com.azure.resourcemanager.maintenance.models.UpdateStatus;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class UpdatesListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"maintenanceScope\":\"Extension\",\"impactType\":\"None\",\"status\":\"Cancel\",\"impactDurationInSec\":1094064824,\"notBefore\":\"2021-06-12T21:48:36Z\",\"properties\":{\"resourceId\":\"awx\"}}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        MaintenanceManager manager = MaintenanceManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Update> response
            = manager.updates().list("juj", "ickpz", "cpopmxel", "wcltyjede", com.azure.core.util.Context.NONE);

        Assertions.assertEquals(MaintenanceScope.EXTENSION, response.iterator().next().maintenanceScope());
        Assertions.assertEquals(ImpactType.NONE, response.iterator().next().impactType());
        Assertions.assertEquals(UpdateStatus.CANCEL, response.iterator().next().status());
        Assertions.assertEquals(1094064824, response.iterator().next().impactDurationInSec());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-12T21:48:36Z"), response.iterator().next().notBefore());
        Assertions.assertEquals("awx", response.iterator().next().resourceId());
    }
}
