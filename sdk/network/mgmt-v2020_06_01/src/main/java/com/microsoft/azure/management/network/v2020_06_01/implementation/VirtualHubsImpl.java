/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.network.v2020_06_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.network.v2020_06_01.VirtualHubs;
import com.microsoft.azure.management.network.v2020_06_01.VirtualHub;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;

class VirtualHubsImpl extends GroupableResourcesCoreImpl<VirtualHub, VirtualHubImpl, VirtualHubInner, VirtualHubsInner, NetworkManager>  implements VirtualHubs {
    protected VirtualHubsImpl(NetworkManager manager) {
        super(manager.inner().virtualHubs(), manager);
    }

    @Override
    protected Observable<VirtualHubInner> getInnerAsync(String resourceGroupName, String name) {
        VirtualHubsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        VirtualHubsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<VirtualHub> listByResourceGroup(String resourceGroupName) {
        VirtualHubsInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<VirtualHub> listByResourceGroupAsync(String resourceGroupName) {
        VirtualHubsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<VirtualHubInner>, Iterable<VirtualHubInner>>() {
            @Override
            public Iterable<VirtualHubInner> call(Page<VirtualHubInner> page) {
                return page.items();
            }
        })
        .map(new Func1<VirtualHubInner, VirtualHub>() {
            @Override
            public VirtualHub call(VirtualHubInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<VirtualHub> list() {
        VirtualHubsInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<VirtualHub> listAsync() {
        VirtualHubsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<VirtualHubInner>, Iterable<VirtualHubInner>>() {
            @Override
            public Iterable<VirtualHubInner> call(Page<VirtualHubInner> page) {
                return page.items();
            }
        })
        .map(new Func1<VirtualHubInner, VirtualHub>() {
            @Override
            public VirtualHub call(VirtualHubInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public VirtualHubImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public Completable getEffectiveVirtualHubRoutesAsync(String resourceGroupName, String virtualHubName) {
        VirtualHubsInner client = this.inner();
        return client.getEffectiveVirtualHubRoutesAsync(resourceGroupName, virtualHubName).toCompletable();
    }

    @Override
    protected VirtualHubImpl wrapModel(VirtualHubInner inner) {
        return  new VirtualHubImpl(inner.name(), inner, manager());
    }

    @Override
    protected VirtualHubImpl wrapModel(String name) {
        return new VirtualHubImpl(name, new VirtualHubInner(), this.manager());
    }

}
