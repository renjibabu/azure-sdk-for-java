/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storageimportexport.v2016_11_01.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.storageimportexport.v2016_11_01.Locations;
import com.microsoft.azure.management.storageimportexport.v2016_11_01.Jobs;
import com.microsoft.azure.management.storageimportexport.v2016_11_01.BitLockerKeys;
import com.microsoft.azure.management.storageimportexport.v2016_11_01.Operations;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure StorageImportExport resource management.
 */
public final class StorageImportExportManager extends ManagerCore<StorageImportExportManager, StorageImportExportImpl> {
    private Locations locations;
    private Jobs jobs;
    private BitLockerKeys bitLockerKeys;
    private Operations operations;
    /**
    * Get a Configurable instance that can be used to create StorageImportExportManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new StorageImportExportManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of StorageImportExportManager that exposes StorageImportExport resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the StorageImportExportManager
    */
    public static StorageImportExportManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new StorageImportExportManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of StorageImportExportManager that exposes StorageImportExport resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the StorageImportExportManager
    */
    public static StorageImportExportManager authenticate(RestClient restClient, String subscriptionId) {
        return new StorageImportExportManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of StorageImportExportManager that exposes StorageImportExport management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing StorageImportExport management API entry points that work across subscriptions
        */
        StorageImportExportManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage Locations.
     */
    public Locations locations() {
        if (this.locations == null) {
            this.locations = new LocationsImpl(this);
        }
        return this.locations;
    }

    /**
     * @return Entry point to manage Jobs.
     */
    public Jobs jobs() {
        if (this.jobs == null) {
            this.jobs = new JobsImpl(this);
        }
        return this.jobs;
    }

    /**
     * @return Entry point to manage BitLockerKeys.
     */
    public BitLockerKeys bitLockerKeys() {
        if (this.bitLockerKeys == null) {
            this.bitLockerKeys = new BitLockerKeysImpl(this);
        }
        return this.bitLockerKeys;
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
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public StorageImportExportManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return StorageImportExportManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private StorageImportExportManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new StorageImportExportImpl(restClient).withSubscriptionId(subscriptionId));
    }
}