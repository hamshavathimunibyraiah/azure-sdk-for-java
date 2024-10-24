// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.securityinsights.models.InsightQueryItemPropertiesTableQuery;
import com.azure.resourcemanager.securityinsights.models.InsightQueryItemPropertiesTableQueryColumnsDefinitionsItem;
import com.azure.resourcemanager.securityinsights.models.InsightQueryItemPropertiesTableQueryQueriesDefinitionsItem;
import com.azure.resourcemanager.securityinsights.models.InsightQueryItemPropertiesTableQueryQueriesDefinitionsPropertiesItemsItem;
import com.azure.resourcemanager.securityinsights.models.OutputType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class InsightQueryItemPropertiesTableQueryTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InsightQueryItemPropertiesTableQuery model = BinaryData.fromString(
            "{\"columnsDefinitions\":[{\"header\":\"auyqnj\",\"outputType\":\"Date\",\"supportDeepLink\":false},{\"header\":\"gjs\",\"outputType\":\"Entity\",\"supportDeepLink\":false},{\"header\":\"hwvixqqggljkybsj\",\"outputType\":\"String\",\"supportDeepLink\":true}],\"queriesDefinitions\":[{\"filter\":\"nrbctbhpjhxpcvrd\",\"summarize\":\"eitaneqadynzjahw\",\"project\":\"uomzczfki\",\"linkColumnsDefinitions\":[{\"projectedName\":\"saaxwspca\",\"Query\":\"khfjqebglcxkx\"},{\"projectedName\":\"zromvygys\",\"Query\":\"tme\"}]}]}")
            .toObject(InsightQueryItemPropertiesTableQuery.class);
        Assertions.assertEquals("auyqnj", model.columnsDefinitions().get(0).headerProperty());
        Assertions.assertEquals(OutputType.DATE, model.columnsDefinitions().get(0).outputType());
        Assertions.assertEquals(false, model.columnsDefinitions().get(0).supportDeepLink());
        Assertions.assertEquals("nrbctbhpjhxpcvrd", model.queriesDefinitions().get(0).filter());
        Assertions.assertEquals("eitaneqadynzjahw", model.queriesDefinitions().get(0).summarize());
        Assertions.assertEquals("uomzczfki", model.queriesDefinitions().get(0).project());
        Assertions.assertEquals("saaxwspca",
            model.queriesDefinitions().get(0).linkColumnsDefinitions().get(0).projectedName());
        Assertions.assertEquals("khfjqebglcxkx",
            model.queriesDefinitions().get(0).linkColumnsDefinitions().get(0).query());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InsightQueryItemPropertiesTableQuery model = new InsightQueryItemPropertiesTableQuery()
            .withColumnsDefinitions(Arrays.asList(
                new InsightQueryItemPropertiesTableQueryColumnsDefinitionsItem().withHeaderProperty("auyqnj")
                    .withOutputType(OutputType.DATE)
                    .withSupportDeepLink(false),
                new InsightQueryItemPropertiesTableQueryColumnsDefinitionsItem().withHeaderProperty("gjs")
                    .withOutputType(OutputType.ENTITY)
                    .withSupportDeepLink(false),
                new InsightQueryItemPropertiesTableQueryColumnsDefinitionsItem().withHeaderProperty("hwvixqqggljkybsj")
                    .withOutputType(OutputType.STRING)
                    .withSupportDeepLink(true)))
            .withQueriesDefinitions(Arrays
                .asList(new InsightQueryItemPropertiesTableQueryQueriesDefinitionsItem().withFilter("nrbctbhpjhxpcvrd")
                    .withSummarize("eitaneqadynzjahw")
                    .withProject("uomzczfki")
                    .withLinkColumnsDefinitions(Arrays.asList(
                        new InsightQueryItemPropertiesTableQueryQueriesDefinitionsPropertiesItemsItem()
                            .withProjectedName("saaxwspca")
                            .withQuery("khfjqebglcxkx"),
                        new InsightQueryItemPropertiesTableQueryQueriesDefinitionsPropertiesItemsItem()
                            .withProjectedName("zromvygys")
                            .withQuery("tme")))));
        model = BinaryData.fromObject(model).toObject(InsightQueryItemPropertiesTableQuery.class);
        Assertions.assertEquals("auyqnj", model.columnsDefinitions().get(0).headerProperty());
        Assertions.assertEquals(OutputType.DATE, model.columnsDefinitions().get(0).outputType());
        Assertions.assertEquals(false, model.columnsDefinitions().get(0).supportDeepLink());
        Assertions.assertEquals("nrbctbhpjhxpcvrd", model.queriesDefinitions().get(0).filter());
        Assertions.assertEquals("eitaneqadynzjahw", model.queriesDefinitions().get(0).summarize());
        Assertions.assertEquals("uomzczfki", model.queriesDefinitions().get(0).project());
        Assertions.assertEquals("saaxwspca",
            model.queriesDefinitions().get(0).linkColumnsDefinitions().get(0).projectedName());
        Assertions.assertEquals("khfjqebglcxkx",
            model.queriesDefinitions().get(0).linkColumnsDefinitions().get(0).query());
    }
}
