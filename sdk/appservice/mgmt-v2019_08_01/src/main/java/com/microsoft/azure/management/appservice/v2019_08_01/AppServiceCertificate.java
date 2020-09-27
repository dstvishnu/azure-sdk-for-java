/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Key Vault container for a certificate that is purchased through Azure.
 */
public class AppServiceCertificate {
    /**
     * Key Vault resource Id.
     */
    @JsonProperty(value = "keyVaultId")
    private String keyVaultId;

    /**
     * Key Vault secret name.
     */
    @JsonProperty(value = "keyVaultSecretName")
    private String keyVaultSecretName;

    /**
     * Status of the Key Vault secret. Possible values include: 'Initialized',
     * 'WaitingOnCertificateOrder', 'Succeeded', 'CertificateOrderFailed',
     * 'OperationNotPermittedOnKeyVault',
     * 'AzureServiceUnauthorizedToAccessKeyVault', 'KeyVaultDoesNotExist',
     * 'KeyVaultSecretDoesNotExist', 'UnknownError', 'ExternalPrivateKey',
     * 'Unknown'.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private KeyVaultSecretStatus provisioningState;

    /**
     * Get key Vault resource Id.
     *
     * @return the keyVaultId value
     */
    public String keyVaultId() {
        return this.keyVaultId;
    }

    /**
     * Set key Vault resource Id.
     *
     * @param keyVaultId the keyVaultId value to set
     * @return the AppServiceCertificate object itself.
     */
    public AppServiceCertificate withKeyVaultId(String keyVaultId) {
        this.keyVaultId = keyVaultId;
        return this;
    }

    /**
     * Get key Vault secret name.
     *
     * @return the keyVaultSecretName value
     */
    public String keyVaultSecretName() {
        return this.keyVaultSecretName;
    }

    /**
     * Set key Vault secret name.
     *
     * @param keyVaultSecretName the keyVaultSecretName value to set
     * @return the AppServiceCertificate object itself.
     */
    public AppServiceCertificate withKeyVaultSecretName(String keyVaultSecretName) {
        this.keyVaultSecretName = keyVaultSecretName;
        return this;
    }

    /**
     * Get status of the Key Vault secret. Possible values include: 'Initialized', 'WaitingOnCertificateOrder', 'Succeeded', 'CertificateOrderFailed', 'OperationNotPermittedOnKeyVault', 'AzureServiceUnauthorizedToAccessKeyVault', 'KeyVaultDoesNotExist', 'KeyVaultSecretDoesNotExist', 'UnknownError', 'ExternalPrivateKey', 'Unknown'.
     *
     * @return the provisioningState value
     */
    public KeyVaultSecretStatus provisioningState() {
        return this.provisioningState;
    }

}