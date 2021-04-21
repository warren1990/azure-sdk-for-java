// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The FileSystemTokenStore model. */
@JsonFlatten
@Fluent
public class FileSystemTokenStore extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FileSystemTokenStore.class);

    /*
     * The directory property.
     */
    @JsonProperty(value = "properties.directory")
    private String directory;

    /**
     * Get the directory property: The directory property.
     *
     * @return the directory value.
     */
    public String directory() {
        return this.directory;
    }

    /**
     * Set the directory property: The directory property.
     *
     * @param directory the directory value to set.
     * @return the FileSystemTokenStore object itself.
     */
    public FileSystemTokenStore withDirectory(String directory) {
        this.directory = directory;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FileSystemTokenStore withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}