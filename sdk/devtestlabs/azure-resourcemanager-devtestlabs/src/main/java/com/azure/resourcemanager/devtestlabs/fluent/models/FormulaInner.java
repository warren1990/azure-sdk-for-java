// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.devtestlabs.models.FormulaPropertiesFromVm;
import com.azure.resourcemanager.devtestlabs.models.LabVirtualMachineCreationParameter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** A formula for creating a VM, specifying an image base and other parameters. */
@JsonFlatten
@Fluent
public class FormulaInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FormulaInner.class);

    /*
     * The description of the formula.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /*
     * The author of the formula.
     */
    @JsonProperty(value = "properties.author", access = JsonProperty.Access.WRITE_ONLY)
    private String author;

    /*
     * The OS type of the formula.
     */
    @JsonProperty(value = "properties.osType")
    private String osType;

    /*
     * The creation date of the formula.
     */
    @JsonProperty(value = "properties.creationDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime creationDate;

    /*
     * The content of the formula.
     */
    @JsonProperty(value = "properties.formulaContent")
    private LabVirtualMachineCreationParameter formulaContent;

    /*
     * Information about a VM from which a formula is to be created.
     */
    @JsonProperty(value = "properties.vm")
    private FormulaPropertiesFromVm vm;

    /*
     * The provisioning status of the resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The unique immutable identifier of a resource (Guid).
     */
    @JsonProperty(value = "properties.uniqueIdentifier", access = JsonProperty.Access.WRITE_ONLY)
    private String uniqueIdentifier;

    /**
     * Get the description property: The description of the formula.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of the formula.
     *
     * @param description the description value to set.
     * @return the FormulaInner object itself.
     */
    public FormulaInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the author property: The author of the formula.
     *
     * @return the author value.
     */
    public String author() {
        return this.author;
    }

    /**
     * Get the osType property: The OS type of the formula.
     *
     * @return the osType value.
     */
    public String osType() {
        return this.osType;
    }

    /**
     * Set the osType property: The OS type of the formula.
     *
     * @param osType the osType value to set.
     * @return the FormulaInner object itself.
     */
    public FormulaInner withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the creationDate property: The creation date of the formula.
     *
     * @return the creationDate value.
     */
    public OffsetDateTime creationDate() {
        return this.creationDate;
    }

    /**
     * Get the formulaContent property: The content of the formula.
     *
     * @return the formulaContent value.
     */
    public LabVirtualMachineCreationParameter formulaContent() {
        return this.formulaContent;
    }

    /**
     * Set the formulaContent property: The content of the formula.
     *
     * @param formulaContent the formulaContent value to set.
     * @return the FormulaInner object itself.
     */
    public FormulaInner withFormulaContent(LabVirtualMachineCreationParameter formulaContent) {
        this.formulaContent = formulaContent;
        return this;
    }

    /**
     * Get the vm property: Information about a VM from which a formula is to be created.
     *
     * @return the vm value.
     */
    public FormulaPropertiesFromVm vm() {
        return this.vm;
    }

    /**
     * Set the vm property: Information about a VM from which a formula is to be created.
     *
     * @param vm the vm value to set.
     * @return the FormulaInner object itself.
     */
    public FormulaInner withVm(FormulaPropertiesFromVm vm) {
        this.vm = vm;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning status of the resource.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the uniqueIdentifier property: The unique immutable identifier of a resource (Guid).
     *
     * @return the uniqueIdentifier value.
     */
    public String uniqueIdentifier() {
        return this.uniqueIdentifier;
    }

    /** {@inheritDoc} */
    @Override
    public FormulaInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FormulaInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (formulaContent() != null) {
            formulaContent().validate();
        }
        if (vm() != null) {
            vm().validate();
        }
    }
}