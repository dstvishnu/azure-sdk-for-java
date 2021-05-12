/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.loganalytics.v2020_08_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.loganalytics.v2020_08_01.DataSources;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.loganalytics.v2020_08_01.DataSource;

class DataSourcesImpl extends WrapperImpl<DataSourcesInner> implements DataSources {
    private final LogAnalyticsManager manager;

    DataSourcesImpl(LogAnalyticsManager manager) {
        super(manager.inner().dataSources());
        this.manager = manager;
    }

    public LogAnalyticsManager manager() {
        return this.manager;
    }

    @Override
    public DataSourceImpl define(String name) {
        return wrapModel(name);
    }

    private DataSourceImpl wrapModel(DataSourceInner inner) {
        return  new DataSourceImpl(inner, manager());
    }

    private DataSourceImpl wrapModel(String name) {
        return new DataSourceImpl(name, this.manager());
    }

    @Override
    public Observable<DataSource> listByWorkspaceAsync(final String resourceGroupName, final String workspaceName, final String filter) {
        DataSourcesInner client = this.inner();
        return client.listByWorkspaceAsync(resourceGroupName, workspaceName, filter)
        .flatMapIterable(new Func1<Page<DataSourceInner>, Iterable<DataSourceInner>>() {
            @Override
            public Iterable<DataSourceInner> call(Page<DataSourceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DataSourceInner, DataSource>() {
            @Override
            public DataSource call(DataSourceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<DataSource> getAsync(String resourceGroupName, String workspaceName, String dataSourceName) {
        DataSourcesInner client = this.inner();
        return client.getAsync(resourceGroupName, workspaceName, dataSourceName)
        .flatMap(new Func1<DataSourceInner, Observable<DataSource>>() {
            @Override
            public Observable<DataSource> call(DataSourceInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((DataSource)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String workspaceName, String dataSourceName) {
        DataSourcesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, workspaceName, dataSourceName).toCompletable();
    }

}
