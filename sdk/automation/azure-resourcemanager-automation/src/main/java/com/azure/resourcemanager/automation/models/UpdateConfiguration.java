// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;
import java.util.List;

/** Update specific properties of the software update configuration. */
@Fluent
public final class UpdateConfiguration {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UpdateConfiguration.class);

    /*
     * operating system of target machines
     */
    @JsonProperty(value = "operatingSystem", required = true)
    private OperatingSystemType operatingSystem;

    /*
     * Windows specific update configuration.
     */
    @JsonProperty(value = "windows")
    private WindowsProperties windows;

    /*
     * Linux specific update configuration.
     */
    @JsonProperty(value = "linux")
    private LinuxProperties linux;

    /*
     * Maximum time allowed for the software update configuration run. Duration
     * needs to be specified using the format PT[n]H[n]M[n]S as per ISO8601
     */
    @JsonProperty(value = "duration")
    private Duration duration;

    /*
     * List of azure resource Ids for azure virtual machines targeted by the
     * software update configuration.
     */
    @JsonProperty(value = "azureVirtualMachines")
    private List<String> azureVirtualMachines;

    /*
     * List of names of non-azure machines targeted by the software update
     * configuration.
     */
    @JsonProperty(value = "nonAzureComputerNames")
    private List<String> nonAzureComputerNames;

    /*
     * Group targets for the software update configuration.
     */
    @JsonProperty(value = "targets")
    private TargetProperties targets;

    /**
     * Get the operatingSystem property: operating system of target machines.
     *
     * @return the operatingSystem value.
     */
    public OperatingSystemType operatingSystem() {
        return this.operatingSystem;
    }

    /**
     * Set the operatingSystem property: operating system of target machines.
     *
     * @param operatingSystem the operatingSystem value to set.
     * @return the UpdateConfiguration object itself.
     */
    public UpdateConfiguration withOperatingSystem(OperatingSystemType operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    /**
     * Get the windows property: Windows specific update configuration.
     *
     * @return the windows value.
     */
    public WindowsProperties windows() {
        return this.windows;
    }

    /**
     * Set the windows property: Windows specific update configuration.
     *
     * @param windows the windows value to set.
     * @return the UpdateConfiguration object itself.
     */
    public UpdateConfiguration withWindows(WindowsProperties windows) {
        this.windows = windows;
        return this;
    }

    /**
     * Get the linux property: Linux specific update configuration.
     *
     * @return the linux value.
     */
    public LinuxProperties linux() {
        return this.linux;
    }

    /**
     * Set the linux property: Linux specific update configuration.
     *
     * @param linux the linux value to set.
     * @return the UpdateConfiguration object itself.
     */
    public UpdateConfiguration withLinux(LinuxProperties linux) {
        this.linux = linux;
        return this;
    }

    /**
     * Get the duration property: Maximum time allowed for the software update configuration run. Duration needs to be
     * specified using the format PT[n]H[n]M[n]S as per ISO8601.
     *
     * @return the duration value.
     */
    public Duration duration() {
        return this.duration;
    }

    /**
     * Set the duration property: Maximum time allowed for the software update configuration run. Duration needs to be
     * specified using the format PT[n]H[n]M[n]S as per ISO8601.
     *
     * @param duration the duration value to set.
     * @return the UpdateConfiguration object itself.
     */
    public UpdateConfiguration withDuration(Duration duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Get the azureVirtualMachines property: List of azure resource Ids for azure virtual machines targeted by the
     * software update configuration.
     *
     * @return the azureVirtualMachines value.
     */
    public List<String> azureVirtualMachines() {
        return this.azureVirtualMachines;
    }

    /**
     * Set the azureVirtualMachines property: List of azure resource Ids for azure virtual machines targeted by the
     * software update configuration.
     *
     * @param azureVirtualMachines the azureVirtualMachines value to set.
     * @return the UpdateConfiguration object itself.
     */
    public UpdateConfiguration withAzureVirtualMachines(List<String> azureVirtualMachines) {
        this.azureVirtualMachines = azureVirtualMachines;
        return this;
    }

    /**
     * Get the nonAzureComputerNames property: List of names of non-azure machines targeted by the software update
     * configuration.
     *
     * @return the nonAzureComputerNames value.
     */
    public List<String> nonAzureComputerNames() {
        return this.nonAzureComputerNames;
    }

    /**
     * Set the nonAzureComputerNames property: List of names of non-azure machines targeted by the software update
     * configuration.
     *
     * @param nonAzureComputerNames the nonAzureComputerNames value to set.
     * @return the UpdateConfiguration object itself.
     */
    public UpdateConfiguration withNonAzureComputerNames(List<String> nonAzureComputerNames) {
        this.nonAzureComputerNames = nonAzureComputerNames;
        return this;
    }

    /**
     * Get the targets property: Group targets for the software update configuration.
     *
     * @return the targets value.
     */
    public TargetProperties targets() {
        return this.targets;
    }

    /**
     * Set the targets property: Group targets for the software update configuration.
     *
     * @param targets the targets value to set.
     * @return the UpdateConfiguration object itself.
     */
    public UpdateConfiguration withTargets(TargetProperties targets) {
        this.targets = targets;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (operatingSystem() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property operatingSystem in model UpdateConfiguration"));
        }
        if (windows() != null) {
            windows().validate();
        }
        if (linux() != null) {
            linux().validate();
        }
        if (targets() != null) {
            targets().validate();
        }
    }
}