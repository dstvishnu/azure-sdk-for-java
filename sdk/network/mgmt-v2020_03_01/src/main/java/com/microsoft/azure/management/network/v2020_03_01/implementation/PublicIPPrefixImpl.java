/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_03_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.network.v2020_03_01.PublicIPPrefix;
import rx.Observable;
import com.microsoft.azure.management.network.v2020_03_01.PublicIPPrefixSku;
import com.microsoft.azure.management.network.v2020_03_01.IPVersion;
import java.util.List;
import com.microsoft.azure.management.network.v2020_03_01.IpTag;
import com.microsoft.azure.management.network.v2020_03_01.ReferencedPublicIpAddress;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2020_03_01.ProvisioningState;

class PublicIPPrefixImpl extends GroupableResourceCoreImpl<PublicIPPrefix, PublicIPPrefixInner, PublicIPPrefixImpl, NetworkManager> implements PublicIPPrefix, PublicIPPrefix.Definition, PublicIPPrefix.Update {
    PublicIPPrefixImpl(String name, PublicIPPrefixInner inner, NetworkManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<PublicIPPrefix> createResourceAsync() {
        PublicIPPrefixesInner client = this.manager().inner().publicIPPrefixes();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<PublicIPPrefix> updateResourceAsync() {
        PublicIPPrefixesInner client = this.manager().inner().publicIPPrefixes();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<PublicIPPrefixInner> getInnerAsync() {
        PublicIPPrefixesInner client = this.manager().inner().publicIPPrefixes();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public String ipPrefix() {
        return this.inner().ipPrefix();
    }

    @Override
    public List<IpTag> ipTags() {
        return this.inner().ipTags();
    }

    @Override
    public SubResource loadBalancerFrontendIpConfiguration() {
        return this.inner().loadBalancerFrontendIpConfiguration();
    }

    @Override
    public Integer prefixLength() {
        return this.inner().prefixLength();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public List<ReferencedPublicIpAddress> publicIPAddresses() {
        return this.inner().publicIPAddresses();
    }

    @Override
    public IPVersion publicIPAddressVersion() {
        return this.inner().publicIPAddressVersion();
    }

    @Override
    public String resourceGuid() {
        return this.inner().resourceGuid();
    }

    @Override
    public PublicIPPrefixSku sku() {
        return this.inner().sku();
    }

    @Override
    public List<String> zones() {
        return this.inner().zones();
    }

    @Override
    public PublicIPPrefixImpl withIpTags(List<IpTag> ipTags) {
        this.inner().withIpTags(ipTags);
        return this;
    }

    @Override
    public PublicIPPrefixImpl withPrefixLength(Integer prefixLength) {
        this.inner().withPrefixLength(prefixLength);
        return this;
    }

    @Override
    public PublicIPPrefixImpl withPublicIPAddressVersion(IPVersion publicIPAddressVersion) {
        this.inner().withPublicIPAddressVersion(publicIPAddressVersion);
        return this;
    }

    @Override
    public PublicIPPrefixImpl withSku(PublicIPPrefixSku sku) {
        this.inner().withSku(sku);
        return this;
    }

    @Override
    public PublicIPPrefixImpl withZones(List<String> zones) {
        this.inner().withZones(zones);
        return this;
    }

}
