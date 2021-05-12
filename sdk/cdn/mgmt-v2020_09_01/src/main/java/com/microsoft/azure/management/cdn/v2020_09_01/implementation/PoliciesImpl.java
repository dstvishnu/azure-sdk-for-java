/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.cdn.v2020_09_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.cdn.v2020_09_01.Policies;
import com.microsoft.azure.management.cdn.v2020_09_01.CdnWebApplicationFirewallPolicy;
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

class PoliciesImpl extends GroupableResourcesCoreImpl<CdnWebApplicationFirewallPolicy, CdnWebApplicationFirewallPolicyImpl, CdnWebApplicationFirewallPolicyInner, PoliciesInner, CdnManager>  implements Policies {
    protected PoliciesImpl(CdnManager manager) {
        super(manager.inner().policies(), manager);
    }

    @Override
    protected Observable<CdnWebApplicationFirewallPolicyInner> getInnerAsync(String resourceGroupName, String name) {
        PoliciesInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        PoliciesInner client = this.inner();
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
    public PagedList<CdnWebApplicationFirewallPolicy> listByResourceGroup(String resourceGroupName) {
        PoliciesInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<CdnWebApplicationFirewallPolicy> listByResourceGroupAsync(String resourceGroupName) {
        PoliciesInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<CdnWebApplicationFirewallPolicyInner>, Iterable<CdnWebApplicationFirewallPolicyInner>>() {
            @Override
            public Iterable<CdnWebApplicationFirewallPolicyInner> call(Page<CdnWebApplicationFirewallPolicyInner> page) {
                return page.items();
            }
        })
        .map(new Func1<CdnWebApplicationFirewallPolicyInner, CdnWebApplicationFirewallPolicy>() {
            @Override
            public CdnWebApplicationFirewallPolicy call(CdnWebApplicationFirewallPolicyInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public CdnWebApplicationFirewallPolicyImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    protected CdnWebApplicationFirewallPolicyImpl wrapModel(CdnWebApplicationFirewallPolicyInner inner) {
        return  new CdnWebApplicationFirewallPolicyImpl(inner.name(), inner, manager());
    }

    @Override
    protected CdnWebApplicationFirewallPolicyImpl wrapModel(String name) {
        return new CdnWebApplicationFirewallPolicyImpl(name, new CdnWebApplicationFirewallPolicyInner(), this.manager());
    }

}
