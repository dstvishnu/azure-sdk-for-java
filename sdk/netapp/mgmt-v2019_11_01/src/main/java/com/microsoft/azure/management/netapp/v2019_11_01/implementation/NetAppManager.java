/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2019_11_01.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.netapp.v2019_11_01.Operations;
import com.microsoft.azure.management.netapp.v2019_11_01.NetAppResources;
import com.microsoft.azure.management.netapp.v2019_11_01.Accounts;
import com.microsoft.azure.management.netapp.v2019_11_01.Pools;
import com.microsoft.azure.management.netapp.v2019_11_01.Volumes;
import com.microsoft.azure.management.netapp.v2019_11_01.Snapshots;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure NetApp resource management.
 */
public final class NetAppManager extends ManagerCore<NetAppManager, AzureNetAppFilesManagementClientImpl> {
    private Operations operations;
    private NetAppResources netAppResources;
    private Accounts accounts;
    private Pools pools;
    private Volumes volumes;
    private Snapshots snapshots;
    /**
    * Get a Configurable instance that can be used to create NetAppManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new NetAppManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of NetAppManager that exposes NetApp resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the NetAppManager
    */
    public static NetAppManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new NetAppManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of NetAppManager that exposes NetApp resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the NetAppManager
    */
    public static NetAppManager authenticate(RestClient restClient, String subscriptionId) {
        return new NetAppManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of NetAppManager that exposes NetApp management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing NetApp management API entry points that work across subscriptions
        */
        NetAppManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(this);
        }
        return this.operations;
    }

    /**
     * @return Entry point to manage NetAppResources.
     */
    public NetAppResources netAppResources() {
        if (this.netAppResources == null) {
            this.netAppResources = new NetAppResourcesImpl(this);
        }
        return this.netAppResources;
    }

    /**
     * @return Entry point to manage Accounts.
     */
    public Accounts accounts() {
        if (this.accounts == null) {
            this.accounts = new AccountsImpl(this);
        }
        return this.accounts;
    }

    /**
     * @return Entry point to manage Pools.
     */
    public Pools pools() {
        if (this.pools == null) {
            this.pools = new PoolsImpl(this);
        }
        return this.pools;
    }

    /**
     * @return Entry point to manage Volumes.
     */
    public Volumes volumes() {
        if (this.volumes == null) {
            this.volumes = new VolumesImpl(this);
        }
        return this.volumes;
    }

    /**
     * @return Entry point to manage Snapshots.
     */
    public Snapshots snapshots() {
        if (this.snapshots == null) {
            this.snapshots = new SnapshotsImpl(this);
        }
        return this.snapshots;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public NetAppManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return NetAppManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private NetAppManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new AzureNetAppFilesManagementClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
