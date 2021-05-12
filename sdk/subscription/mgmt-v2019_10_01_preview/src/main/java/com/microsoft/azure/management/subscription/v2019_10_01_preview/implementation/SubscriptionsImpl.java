/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.subscription.v2019_10_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.subscription.v2019_10_01_preview.Subscriptions;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.subscription.v2019_10_01_preview.SubscriptionCreationResult;
import com.microsoft.azure.management.subscription.v2019_10_01_preview.SubscriptionCreationParameters;
import com.microsoft.azure.management.subscription.v2019_10_01_preview.ModernSubscriptionCreationParameters;
import com.microsoft.azure.management.subscription.v2019_10_01_preview.ModernCspSubscriptionCreationParameters;
import com.microsoft.azure.management.subscription.v2019_10_01_preview.CanceledSubscriptionId;
import com.microsoft.azure.management.subscription.v2019_10_01_preview.RenamedSubscriptionId;
import com.microsoft.azure.management.subscription.v2019_10_01_preview.EnabledSubscriptionId;

class SubscriptionsImpl extends WrapperImpl<SubscriptionsInner> implements Subscriptions {
    private final BillingManager manager;

    SubscriptionsImpl(BillingManager manager) {
        super(manager.inner().subscriptions());
        this.manager = manager;
    }

    public BillingManager manager() {
        return this.manager;
    }

    @Override
    public Observable<SubscriptionCreationResult> createSubscriptionInEnrollmentAccountAsync(String enrollmentAccountName, SubscriptionCreationParameters body) {
        SubscriptionsInner client = this.inner();
        return client.createSubscriptionInEnrollmentAccountAsync(enrollmentAccountName, body)
        .map(new Func1<SubscriptionCreationResultInner, SubscriptionCreationResult>() {
            @Override
            public SubscriptionCreationResult call(SubscriptionCreationResultInner inner) {
                return new SubscriptionCreationResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<SubscriptionCreationResult> createSubscriptionAsync(String billingAccountName, String billingProfileName, String invoiceSectionName, ModernSubscriptionCreationParameters body) {
        SubscriptionsInner client = this.inner();
        return client.createSubscriptionAsync(billingAccountName, billingProfileName, invoiceSectionName, body)
        .map(new Func1<SubscriptionCreationResultInner, SubscriptionCreationResult>() {
            @Override
            public SubscriptionCreationResult call(SubscriptionCreationResultInner inner) {
                return new SubscriptionCreationResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<SubscriptionCreationResult> createCspSubscriptionAsync(String billingAccountName, String customerName, ModernCspSubscriptionCreationParameters body) {
        SubscriptionsInner client = this.inner();
        return client.createCspSubscriptionAsync(billingAccountName, customerName, body)
        .map(new Func1<SubscriptionCreationResultInner, SubscriptionCreationResult>() {
            @Override
            public SubscriptionCreationResult call(SubscriptionCreationResultInner inner) {
                return new SubscriptionCreationResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<CanceledSubscriptionId> cancelAsync(String subscriptionId) {
        SubscriptionsInner client = this.inner();
        return client.cancelAsync(subscriptionId)
        .map(new Func1<CanceledSubscriptionIdInner, CanceledSubscriptionId>() {
            @Override
            public CanceledSubscriptionId call(CanceledSubscriptionIdInner inner) {
                return new CanceledSubscriptionIdImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<RenamedSubscriptionId> renameAsync(String subscriptionId) {
        SubscriptionsInner client = this.inner();
        return client.renameAsync(subscriptionId)
        .map(new Func1<RenamedSubscriptionIdInner, RenamedSubscriptionId>() {
            @Override
            public RenamedSubscriptionId call(RenamedSubscriptionIdInner inner) {
                return new RenamedSubscriptionIdImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<EnabledSubscriptionId> enableAsync(String subscriptionId) {
        SubscriptionsInner client = this.inner();
        return client.enableAsync(subscriptionId)
        .map(new Func1<EnabledSubscriptionIdInner, EnabledSubscriptionId>() {
            @Override
            public EnabledSubscriptionId call(EnabledSubscriptionIdInner inner) {
                return new EnabledSubscriptionIdImpl(inner, manager());
            }
        });
    }

}
