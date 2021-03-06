// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ExpressRouteConnectionId model. */
@Immutable
public final class ExpressRouteConnectionId {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExpressRouteConnectionId.class);

    /*
     * The ID of the ExpressRouteConnection.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Get the id property: The ID of the ExpressRouteConnection.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
