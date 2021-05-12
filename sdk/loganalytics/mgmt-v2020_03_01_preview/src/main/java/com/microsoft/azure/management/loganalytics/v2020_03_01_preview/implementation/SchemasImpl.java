/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.loganalytics.v2020_03_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.loganalytics.v2020_03_01_preview.Schemas;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.loganalytics.v2020_03_01_preview.SearchGetSchemaResponse;

class SchemasImpl extends WrapperImpl<SchemasInner> implements Schemas {
    private final LogAnalyticsManager manager;

    SchemasImpl(LogAnalyticsManager manager) {
        super(manager.inner().schemas());
        this.manager = manager;
    }

    public LogAnalyticsManager manager() {
        return this.manager;
    }

    @Override
    public Observable<SearchGetSchemaResponse> getAsync(String resourceGroupName, String workspaceName) {
        SchemasInner client = this.inner();
        return client.getAsync(resourceGroupName, workspaceName)
        .map(new Func1<SearchGetSchemaResponseInner, SearchGetSchemaResponse>() {
            @Override
            public SearchGetSchemaResponse call(SearchGetSchemaResponseInner inner) {
                return new SearchGetSchemaResponseImpl(inner, manager());
            }
        });
    }

}
