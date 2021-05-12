/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.network.v2020_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.network.v2020_06_01.HubRouteTables;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.network.v2020_06_01.HubRouteTable;

class HubRouteTablesImpl extends WrapperImpl<HubRouteTablesInner> implements HubRouteTables {
    private final NetworkManager manager;

    HubRouteTablesImpl(NetworkManager manager) {
        super(manager.inner().hubRouteTables());
        this.manager = manager;
    }

    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public HubRouteTableImpl define(String name) {
        return wrapModel(name);
    }

    private HubRouteTableImpl wrapModel(HubRouteTableInner inner) {
        return  new HubRouteTableImpl(inner, manager());
    }

    private HubRouteTableImpl wrapModel(String name) {
        return new HubRouteTableImpl(name, this.manager());
    }

    @Override
    public Observable<HubRouteTable> listAsync(final String resourceGroupName, final String virtualHubName) {
        HubRouteTablesInner client = this.inner();
        return client.listAsync(resourceGroupName, virtualHubName)
        .flatMapIterable(new Func1<Page<HubRouteTableInner>, Iterable<HubRouteTableInner>>() {
            @Override
            public Iterable<HubRouteTableInner> call(Page<HubRouteTableInner> page) {
                return page.items();
            }
        })
        .map(new Func1<HubRouteTableInner, HubRouteTable>() {
            @Override
            public HubRouteTable call(HubRouteTableInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<HubRouteTable> getAsync(String resourceGroupName, String virtualHubName, String routeTableName) {
        HubRouteTablesInner client = this.inner();
        return client.getAsync(resourceGroupName, virtualHubName, routeTableName)
        .flatMap(new Func1<HubRouteTableInner, Observable<HubRouteTable>>() {
            @Override
            public Observable<HubRouteTable> call(HubRouteTableInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((HubRouteTable)wrapModel(inner));
                }
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String virtualHubName, String routeTableName) {
        HubRouteTablesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, virtualHubName, routeTableName).toCompletable();
    }

}
