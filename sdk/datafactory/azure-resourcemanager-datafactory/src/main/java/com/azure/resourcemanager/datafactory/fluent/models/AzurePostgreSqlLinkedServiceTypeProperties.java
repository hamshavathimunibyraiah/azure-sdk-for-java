// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datafactory.models.AzureKeyVaultSecretReference;
import java.io.IOException;

/**
 * Azure PostgreSQL linked service properties.
 */
@Fluent
public final class AzurePostgreSqlLinkedServiceTypeProperties
    implements JsonSerializable<AzurePostgreSqlLinkedServiceTypeProperties> {
    /*
     * An ODBC connection string. Type: string, SecureString or AzureKeyVaultSecretReference.
     */
    private Object connectionString;

    /*
     * The Azure key vault secret reference of password in connection string.
     */
    private AzureKeyVaultSecretReference password;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string.
     */
    private String encryptedCredential;

    /**
     * Creates an instance of AzurePostgreSqlLinkedServiceTypeProperties class.
     */
    public AzurePostgreSqlLinkedServiceTypeProperties() {
    }

    /**
     * Get the connectionString property: An ODBC connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     * 
     * @return the connectionString value.
     */
    public Object connectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: An ODBC connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     * 
     * @param connectionString the connectionString value to set.
     * @return the AzurePostgreSqlLinkedServiceTypeProperties object itself.
     */
    public AzurePostgreSqlLinkedServiceTypeProperties withConnectionString(Object connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the password property: The Azure key vault secret reference of password in connection string.
     * 
     * @return the password value.
     */
    public AzureKeyVaultSecretReference password() {
        return this.password;
    }

    /**
     * Set the password property: The Azure key vault secret reference of password in connection string.
     * 
     * @param password the password value to set.
     * @return the AzurePostgreSqlLinkedServiceTypeProperties object itself.
     */
    public AzurePostgreSqlLinkedServiceTypeProperties withPassword(AzureKeyVaultSecretReference password) {
        this.password = password;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     * 
     * @return the encryptedCredential value.
     */
    public String encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     * 
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the AzurePostgreSqlLinkedServiceTypeProperties object itself.
     */
    public AzurePostgreSqlLinkedServiceTypeProperties withEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (password() != null) {
            password().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeUntypedField("connectionString", this.connectionString);
        jsonWriter.writeJsonField("password", this.password);
        jsonWriter.writeStringField("encryptedCredential", this.encryptedCredential);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzurePostgreSqlLinkedServiceTypeProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzurePostgreSqlLinkedServiceTypeProperties if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AzurePostgreSqlLinkedServiceTypeProperties.
     */
    public static AzurePostgreSqlLinkedServiceTypeProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzurePostgreSqlLinkedServiceTypeProperties deserializedAzurePostgreSqlLinkedServiceTypeProperties
                = new AzurePostgreSqlLinkedServiceTypeProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("connectionString".equals(fieldName)) {
                    deserializedAzurePostgreSqlLinkedServiceTypeProperties.connectionString = reader.readUntyped();
                } else if ("password".equals(fieldName)) {
                    deserializedAzurePostgreSqlLinkedServiceTypeProperties.password
                        = AzureKeyVaultSecretReference.fromJson(reader);
                } else if ("encryptedCredential".equals(fieldName)) {
                    deserializedAzurePostgreSqlLinkedServiceTypeProperties.encryptedCredential = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzurePostgreSqlLinkedServiceTypeProperties;
        });
    }
}
