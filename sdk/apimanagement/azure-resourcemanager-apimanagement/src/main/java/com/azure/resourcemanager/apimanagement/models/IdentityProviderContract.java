// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.IdentityProviderContractInner;
import java.util.List;

/** An immutable client-side representation of IdentityProviderContract. */
public interface IdentityProviderContract {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the typePropertiesType property: Identity Provider Type identifier.
     *
     * @return the typePropertiesType value.
     */
    IdentityProviderType typePropertiesType();

    /**
     * Gets the signinTenant property: The TenantId to use instead of Common when logging into Active Directory.
     *
     * @return the signinTenant value.
     */
    String signinTenant();

    /**
     * Gets the allowedTenants property: List of Allowed Tenants when configuring Azure Active Directory login.
     *
     * @return the allowedTenants value.
     */
    List<String> allowedTenants();

    /**
     * Gets the authority property: OpenID Connect discovery endpoint hostname for AAD or AAD B2C.
     *
     * @return the authority value.
     */
    String authority();

    /**
     * Gets the signupPolicyName property: Signup Policy Name. Only applies to AAD B2C Identity Provider.
     *
     * @return the signupPolicyName value.
     */
    String signupPolicyName();

    /**
     * Gets the signinPolicyName property: Signin Policy Name. Only applies to AAD B2C Identity Provider.
     *
     * @return the signinPolicyName value.
     */
    String signinPolicyName();

    /**
     * Gets the profileEditingPolicyName property: Profile Editing Policy Name. Only applies to AAD B2C Identity
     * Provider.
     *
     * @return the profileEditingPolicyName value.
     */
    String profileEditingPolicyName();

    /**
     * Gets the passwordResetPolicyName property: Password Reset Policy Name. Only applies to AAD B2C Identity Provider.
     *
     * @return the passwordResetPolicyName value.
     */
    String passwordResetPolicyName();

    /**
     * Gets the clientId property: Client Id of the Application in the external Identity Provider. It is App ID for
     * Facebook login, Client ID for Google login, App ID for Microsoft.
     *
     * @return the clientId value.
     */
    String clientId();

    /**
     * Gets the clientSecret property: Client secret of the Application in external Identity Provider, used to
     * authenticate login request. For example, it is App Secret for Facebook login, API Key for Google login, Public
     * Key for Microsoft. This property will not be filled on 'GET' operations! Use '/listSecrets' POST request to get
     * the value.
     *
     * @return the clientSecret value.
     */
    String clientSecret();

    /**
     * Gets the inner com.azure.resourcemanager.apimanagement.fluent.models.IdentityProviderContractInner object.
     *
     * @return the inner object.
     */
    IdentityProviderContractInner innerModel();

    /** The entirety of the IdentityProviderContract definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The IdentityProviderContract definition stages. */
    interface DefinitionStages {
        /** The first stage of the IdentityProviderContract definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the IdentityProviderContract definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, serviceName.
             *
             * @param resourceGroupName The name of the resource group.
             * @param serviceName The name of the API Management service.
             * @return the next definition stage.
             */
            WithCreate withExistingService(String resourceGroupName, String serviceName);
        }
        /**
         * The stage of the IdentityProviderContract definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTypePropertiesType,
                DefinitionStages.WithSigninTenant,
                DefinitionStages.WithAllowedTenants,
                DefinitionStages.WithAuthority,
                DefinitionStages.WithSignupPolicyName,
                DefinitionStages.WithSigninPolicyName,
                DefinitionStages.WithProfileEditingPolicyName,
                DefinitionStages.WithPasswordResetPolicyName,
                DefinitionStages.WithClientId,
                DefinitionStages.WithClientSecret,
                DefinitionStages.WithIfMatch {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            IdentityProviderContract create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            IdentityProviderContract create(Context context);
        }
        /** The stage of the IdentityProviderContract definition allowing to specify typePropertiesType. */
        interface WithTypePropertiesType {
            /**
             * Specifies the typePropertiesType property: Identity Provider Type identifier..
             *
             * @param typePropertiesType Identity Provider Type identifier.
             * @return the next definition stage.
             */
            WithCreate withTypePropertiesType(IdentityProviderType typePropertiesType);
        }
        /** The stage of the IdentityProviderContract definition allowing to specify signinTenant. */
        interface WithSigninTenant {
            /**
             * Specifies the signinTenant property: The TenantId to use instead of Common when logging into Active
             * Directory.
             *
             * @param signinTenant The TenantId to use instead of Common when logging into Active Directory.
             * @return the next definition stage.
             */
            WithCreate withSigninTenant(String signinTenant);
        }
        /** The stage of the IdentityProviderContract definition allowing to specify allowedTenants. */
        interface WithAllowedTenants {
            /**
             * Specifies the allowedTenants property: List of Allowed Tenants when configuring Azure Active Directory
             * login..
             *
             * @param allowedTenants List of Allowed Tenants when configuring Azure Active Directory login.
             * @return the next definition stage.
             */
            WithCreate withAllowedTenants(List<String> allowedTenants);
        }
        /** The stage of the IdentityProviderContract definition allowing to specify authority. */
        interface WithAuthority {
            /**
             * Specifies the authority property: OpenID Connect discovery endpoint hostname for AAD or AAD B2C..
             *
             * @param authority OpenID Connect discovery endpoint hostname for AAD or AAD B2C.
             * @return the next definition stage.
             */
            WithCreate withAuthority(String authority);
        }
        /** The stage of the IdentityProviderContract definition allowing to specify signupPolicyName. */
        interface WithSignupPolicyName {
            /**
             * Specifies the signupPolicyName property: Signup Policy Name. Only applies to AAD B2C Identity Provider..
             *
             * @param signupPolicyName Signup Policy Name. Only applies to AAD B2C Identity Provider.
             * @return the next definition stage.
             */
            WithCreate withSignupPolicyName(String signupPolicyName);
        }
        /** The stage of the IdentityProviderContract definition allowing to specify signinPolicyName. */
        interface WithSigninPolicyName {
            /**
             * Specifies the signinPolicyName property: Signin Policy Name. Only applies to AAD B2C Identity Provider..
             *
             * @param signinPolicyName Signin Policy Name. Only applies to AAD B2C Identity Provider.
             * @return the next definition stage.
             */
            WithCreate withSigninPolicyName(String signinPolicyName);
        }
        /** The stage of the IdentityProviderContract definition allowing to specify profileEditingPolicyName. */
        interface WithProfileEditingPolicyName {
            /**
             * Specifies the profileEditingPolicyName property: Profile Editing Policy Name. Only applies to AAD B2C
             * Identity Provider..
             *
             * @param profileEditingPolicyName Profile Editing Policy Name. Only applies to AAD B2C Identity Provider.
             * @return the next definition stage.
             */
            WithCreate withProfileEditingPolicyName(String profileEditingPolicyName);
        }
        /** The stage of the IdentityProviderContract definition allowing to specify passwordResetPolicyName. */
        interface WithPasswordResetPolicyName {
            /**
             * Specifies the passwordResetPolicyName property: Password Reset Policy Name. Only applies to AAD B2C
             * Identity Provider..
             *
             * @param passwordResetPolicyName Password Reset Policy Name. Only applies to AAD B2C Identity Provider.
             * @return the next definition stage.
             */
            WithCreate withPasswordResetPolicyName(String passwordResetPolicyName);
        }
        /** The stage of the IdentityProviderContract definition allowing to specify clientId. */
        interface WithClientId {
            /**
             * Specifies the clientId property: Client Id of the Application in the external Identity Provider. It is
             * App ID for Facebook login, Client ID for Google login, App ID for Microsoft..
             *
             * @param clientId Client Id of the Application in the external Identity Provider. It is App ID for Facebook
             *     login, Client ID for Google login, App ID for Microsoft.
             * @return the next definition stage.
             */
            WithCreate withClientId(String clientId);
        }
        /** The stage of the IdentityProviderContract definition allowing to specify clientSecret. */
        interface WithClientSecret {
            /**
             * Specifies the clientSecret property: Client secret of the Application in external Identity Provider, used
             * to authenticate login request. For example, it is App Secret for Facebook login, API Key for Google
             * login, Public Key for Microsoft. This property will not be filled on 'GET' operations! Use '/listSecrets'
             * POST request to get the value..
             *
             * @param clientSecret Client secret of the Application in external Identity Provider, used to authenticate
             *     login request. For example, it is App Secret for Facebook login, API Key for Google login, Public Key
             *     for Microsoft. This property will not be filled on 'GET' operations! Use '/listSecrets' POST request
             *     to get the value.
             * @return the next definition stage.
             */
            WithCreate withClientSecret(String clientSecret);
        }
        /** The stage of the IdentityProviderContract definition allowing to specify ifMatch. */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: ETag of the Entity. Not required when creating an entity, but required
             * when updating an entity..
             *
             * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an
             *     entity.
             * @return the next definition stage.
             */
            WithCreate withIfMatch(String ifMatch);
        }
    }
    /**
     * Begins update for the IdentityProviderContract resource.
     *
     * @return the stage of resource update.
     */
    IdentityProviderContract.Update update();

    /** The template for IdentityProviderContract update. */
    interface Update
        extends UpdateStages.WithType,
            UpdateStages.WithSigninTenant,
            UpdateStages.WithAllowedTenants,
            UpdateStages.WithAuthority,
            UpdateStages.WithSignupPolicyName,
            UpdateStages.WithSigninPolicyName,
            UpdateStages.WithProfileEditingPolicyName,
            UpdateStages.WithPasswordResetPolicyName,
            UpdateStages.WithClientId,
            UpdateStages.WithClientSecret,
            UpdateStages.WithIfMatch {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        IdentityProviderContract apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        IdentityProviderContract apply(Context context);
    }
    /** The IdentityProviderContract update stages. */
    interface UpdateStages {
        /** The stage of the IdentityProviderContract update allowing to specify type. */
        interface WithType {
            /**
             * Specifies the type property: Identity Provider Type identifier..
             *
             * @param type Identity Provider Type identifier.
             * @return the next definition stage.
             */
            Update withType(IdentityProviderType type);
        }
        /** The stage of the IdentityProviderContract update allowing to specify signinTenant. */
        interface WithSigninTenant {
            /**
             * Specifies the signinTenant property: The TenantId to use instead of Common when logging into Active
             * Directory.
             *
             * @param signinTenant The TenantId to use instead of Common when logging into Active Directory.
             * @return the next definition stage.
             */
            Update withSigninTenant(String signinTenant);
        }
        /** The stage of the IdentityProviderContract update allowing to specify allowedTenants. */
        interface WithAllowedTenants {
            /**
             * Specifies the allowedTenants property: List of Allowed Tenants when configuring Azure Active Directory
             * login..
             *
             * @param allowedTenants List of Allowed Tenants when configuring Azure Active Directory login.
             * @return the next definition stage.
             */
            Update withAllowedTenants(List<String> allowedTenants);
        }
        /** The stage of the IdentityProviderContract update allowing to specify authority. */
        interface WithAuthority {
            /**
             * Specifies the authority property: OpenID Connect discovery endpoint hostname for AAD or AAD B2C..
             *
             * @param authority OpenID Connect discovery endpoint hostname for AAD or AAD B2C.
             * @return the next definition stage.
             */
            Update withAuthority(String authority);
        }
        /** The stage of the IdentityProviderContract update allowing to specify signupPolicyName. */
        interface WithSignupPolicyName {
            /**
             * Specifies the signupPolicyName property: Signup Policy Name. Only applies to AAD B2C Identity Provider..
             *
             * @param signupPolicyName Signup Policy Name. Only applies to AAD B2C Identity Provider.
             * @return the next definition stage.
             */
            Update withSignupPolicyName(String signupPolicyName);
        }
        /** The stage of the IdentityProviderContract update allowing to specify signinPolicyName. */
        interface WithSigninPolicyName {
            /**
             * Specifies the signinPolicyName property: Signin Policy Name. Only applies to AAD B2C Identity Provider..
             *
             * @param signinPolicyName Signin Policy Name. Only applies to AAD B2C Identity Provider.
             * @return the next definition stage.
             */
            Update withSigninPolicyName(String signinPolicyName);
        }
        /** The stage of the IdentityProviderContract update allowing to specify profileEditingPolicyName. */
        interface WithProfileEditingPolicyName {
            /**
             * Specifies the profileEditingPolicyName property: Profile Editing Policy Name. Only applies to AAD B2C
             * Identity Provider..
             *
             * @param profileEditingPolicyName Profile Editing Policy Name. Only applies to AAD B2C Identity Provider.
             * @return the next definition stage.
             */
            Update withProfileEditingPolicyName(String profileEditingPolicyName);
        }
        /** The stage of the IdentityProviderContract update allowing to specify passwordResetPolicyName. */
        interface WithPasswordResetPolicyName {
            /**
             * Specifies the passwordResetPolicyName property: Password Reset Policy Name. Only applies to AAD B2C
             * Identity Provider..
             *
             * @param passwordResetPolicyName Password Reset Policy Name. Only applies to AAD B2C Identity Provider.
             * @return the next definition stage.
             */
            Update withPasswordResetPolicyName(String passwordResetPolicyName);
        }
        /** The stage of the IdentityProviderContract update allowing to specify clientId. */
        interface WithClientId {
            /**
             * Specifies the clientId property: Client Id of the Application in the external Identity Provider. It is
             * App ID for Facebook login, Client ID for Google login, App ID for Microsoft..
             *
             * @param clientId Client Id of the Application in the external Identity Provider. It is App ID for Facebook
             *     login, Client ID for Google login, App ID for Microsoft.
             * @return the next definition stage.
             */
            Update withClientId(String clientId);
        }
        /** The stage of the IdentityProviderContract update allowing to specify clientSecret. */
        interface WithClientSecret {
            /**
             * Specifies the clientSecret property: Client secret of the Application in external Identity Provider, used
             * to authenticate login request. For example, it is App Secret for Facebook login, API Key for Google
             * login, Public Key for Microsoft..
             *
             * @param clientSecret Client secret of the Application in external Identity Provider, used to authenticate
             *     login request. For example, it is App Secret for Facebook login, API Key for Google login, Public Key
             *     for Microsoft.
             * @return the next definition stage.
             */
            Update withClientSecret(String clientSecret);
        }
        /** The stage of the IdentityProviderContract update allowing to specify ifMatch. */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: ETag of the Entity. ETag should match the current entity state from the
             * header response of the GET request or it should be * for unconditional update..
             *
             * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of
             *     the GET request or it should be * for unconditional update.
             * @return the next definition stage.
             */
            Update withIfMatch(String ifMatch);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    IdentityProviderContract refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    IdentityProviderContract refresh(Context context);

    /**
     * Gets the client secret details of the Identity Provider.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the client secret details of the Identity Provider.
     */
    ClientSecretContract listSecrets();

    /**
     * Gets the client secret details of the Identity Provider.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the client secret details of the Identity Provider.
     */
    Response<ClientSecretContract> listSecretsWithResponse(Context context);
}
