// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.hdinsight.containers.HDInsightContainersManager;
import com.azure.resourcemanager.hdinsight.containers.models.Category;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterLibrary;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ClusterLibrariesListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"type\":\"ClusterLibraryProperties\",\"remarks\":\"yych\",\"timestamp\":\"2021-07-13T04:48:49Z\",\"status\":\"UNINSTALLING\",\"message\":\"jrtwsz\"},\"id\":\"vuicp\",\"name\":\"vtrrmhwrbfdpyflu\",\"type\":\"hvj\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        HDInsightContainersManager manager = HDInsightContainersManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<ClusterLibrary> response = manager.clusterLibraries()
            .list("llklmtk", "lowkxxpvb", "dfjmzsyzfhotlh", Category.CUSTOM, com.azure.core.util.Context.NONE);

        Assertions.assertEquals("yych", response.iterator().next().properties().remarks());
    }
}
