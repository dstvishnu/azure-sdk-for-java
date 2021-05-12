/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.monitor.v2019_11_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.monitor.v2019_11_01.ActivityLogAlerts;
import com.microsoft.azure.management.monitor.v2019_11_01.ActivityLogAlertResource;
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

class ActivityLogAlertsImpl extends GroupableResourcesCoreImpl<ActivityLogAlertResource, ActivityLogAlertResourceImpl, ActivityLogAlertResourceInner, ActivityLogAlertsInner, MonitorManager>  implements ActivityLogAlerts {
    protected ActivityLogAlertsImpl(MonitorManager manager) {
        super(manager.inner().activityLogAlerts(), manager);
    }

    @Override
    protected Observable<ActivityLogAlertResourceInner> getInnerAsync(String resourceGroupName, String name) {
        ActivityLogAlertsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        ActivityLogAlertsInner client = this.inner();
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
    public PagedList<ActivityLogAlertResource> listByResourceGroup(String resourceGroupName) {
        ActivityLogAlertsInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<ActivityLogAlertResource> listByResourceGroupAsync(String resourceGroupName) {
        ActivityLogAlertsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMap(new Func1<Page<ActivityLogAlertResourceInner>, Observable<ActivityLogAlertResourceInner>>() {
            @Override
            public Observable<ActivityLogAlertResourceInner> call(Page<ActivityLogAlertResourceInner> innerPage) {
                return Observable.from(innerPage.items());
            }
        })
        .map(new Func1<ActivityLogAlertResourceInner, ActivityLogAlertResource>() {
            @Override
            public ActivityLogAlertResource call(ActivityLogAlertResourceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<ActivityLogAlertResource> list() {
        ActivityLogAlertsInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<ActivityLogAlertResource> listAsync() {
        ActivityLogAlertsInner client = this.inner();
        return client.listAsync()
        .flatMap(new Func1<Page<ActivityLogAlertResourceInner>, Observable<ActivityLogAlertResourceInner>>() {
            @Override
            public Observable<ActivityLogAlertResourceInner> call(Page<ActivityLogAlertResourceInner> innerPage) {
                return Observable.from(innerPage.items());
            }
        })
        .map(new Func1<ActivityLogAlertResourceInner, ActivityLogAlertResource>() {
            @Override
            public ActivityLogAlertResource call(ActivityLogAlertResourceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public ActivityLogAlertResourceImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    protected ActivityLogAlertResourceImpl wrapModel(ActivityLogAlertResourceInner inner) {
        return  new ActivityLogAlertResourceImpl(inner.name(), inner, manager());
    }

    @Override
    protected ActivityLogAlertResourceImpl wrapModel(String name) {
        return new ActivityLogAlertResourceImpl(name, new ActivityLogAlertResourceInner(), this.manager());
    }

}
