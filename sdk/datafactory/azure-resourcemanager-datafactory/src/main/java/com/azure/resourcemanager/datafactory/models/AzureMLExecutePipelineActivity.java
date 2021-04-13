// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Azure ML Execute Pipeline activity. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureMLExecutePipeline")
@JsonFlatten
@Fluent
public class AzureMLExecutePipelineActivity extends ExecutionActivity {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureMLExecutePipelineActivity.class);

    /*
     * ID of the published Azure ML pipeline. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.mlPipelineId")
    private Object mlPipelineId;

    /*
     * ID of the published Azure ML pipeline endpoint. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.mlPipelineEndpointId")
    private Object mlPipelineEndpointId;

    /*
     * Version of the published Azure ML pipeline endpoint. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.version")
    private Object version;

    /*
     * Run history experiment name of the pipeline run. This information will
     * be passed in the ExperimentName property of the published pipeline
     * execution request. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.experimentName")
    private Object experimentName;

    /*
     * Key,Value pairs to be passed to the published Azure ML pipeline
     * endpoint. Keys must match the names of pipeline parameters defined in
     * the published pipeline. Values will be passed in the
     * ParameterAssignments property of the published pipeline execution
     * request. Type: object with key value pairs (or Expression with
     * resultType object).
     */
    @JsonProperty(value = "typeProperties.mlPipelineParameters")
    private Object mlPipelineParameters;

    /*
     * Dictionary used for changing data path assignments without retraining.
     * Values will be passed in the dataPathAssignments property of the
     * published pipeline execution request. Type: object with key value pairs
     * (or Expression with resultType object).
     */
    @JsonProperty(value = "typeProperties.dataPathAssignments")
    private Object dataPathAssignments;

    /*
     * The parent Azure ML Service pipeline run id. This information will be
     * passed in the ParentRunId property of the published pipeline execution
     * request. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.mlParentRunId")
    private Object mlParentRunId;

    /*
     * Whether to continue execution of other steps in the PipelineRun if a
     * step fails. This information will be passed in the continueOnStepFailure
     * property of the published pipeline execution request. Type: boolean (or
     * Expression with resultType boolean).
     */
    @JsonProperty(value = "typeProperties.continueOnStepFailure")
    private Object continueOnStepFailure;

    /**
     * Get the mlPipelineId property: ID of the published Azure ML pipeline. Type: string (or Expression with resultType
     * string).
     *
     * @return the mlPipelineId value.
     */
    public Object mlPipelineId() {
        return this.mlPipelineId;
    }

    /**
     * Set the mlPipelineId property: ID of the published Azure ML pipeline. Type: string (or Expression with resultType
     * string).
     *
     * @param mlPipelineId the mlPipelineId value to set.
     * @return the AzureMLExecutePipelineActivity object itself.
     */
    public AzureMLExecutePipelineActivity withMlPipelineId(Object mlPipelineId) {
        this.mlPipelineId = mlPipelineId;
        return this;
    }

    /**
     * Get the mlPipelineEndpointId property: ID of the published Azure ML pipeline endpoint. Type: string (or
     * Expression with resultType string).
     *
     * @return the mlPipelineEndpointId value.
     */
    public Object mlPipelineEndpointId() {
        return this.mlPipelineEndpointId;
    }

    /**
     * Set the mlPipelineEndpointId property: ID of the published Azure ML pipeline endpoint. Type: string (or
     * Expression with resultType string).
     *
     * @param mlPipelineEndpointId the mlPipelineEndpointId value to set.
     * @return the AzureMLExecutePipelineActivity object itself.
     */
    public AzureMLExecutePipelineActivity withMlPipelineEndpointId(Object mlPipelineEndpointId) {
        this.mlPipelineEndpointId = mlPipelineEndpointId;
        return this;
    }

    /**
     * Get the version property: Version of the published Azure ML pipeline endpoint. Type: string (or Expression with
     * resultType string).
     *
     * @return the version value.
     */
    public Object version() {
        return this.version;
    }

    /**
     * Set the version property: Version of the published Azure ML pipeline endpoint. Type: string (or Expression with
     * resultType string).
     *
     * @param version the version value to set.
     * @return the AzureMLExecutePipelineActivity object itself.
     */
    public AzureMLExecutePipelineActivity withVersion(Object version) {
        this.version = version;
        return this;
    }

    /**
     * Get the experimentName property: Run history experiment name of the pipeline run. This information will be passed
     * in the ExperimentName property of the published pipeline execution request. Type: string (or Expression with
     * resultType string).
     *
     * @return the experimentName value.
     */
    public Object experimentName() {
        return this.experimentName;
    }

    /**
     * Set the experimentName property: Run history experiment name of the pipeline run. This information will be passed
     * in the ExperimentName property of the published pipeline execution request. Type: string (or Expression with
     * resultType string).
     *
     * @param experimentName the experimentName value to set.
     * @return the AzureMLExecutePipelineActivity object itself.
     */
    public AzureMLExecutePipelineActivity withExperimentName(Object experimentName) {
        this.experimentName = experimentName;
        return this;
    }

    /**
     * Get the mlPipelineParameters property: Key,Value pairs to be passed to the published Azure ML pipeline endpoint.
     * Keys must match the names of pipeline parameters defined in the published pipeline. Values will be passed in the
     * ParameterAssignments property of the published pipeline execution request. Type: object with key value pairs (or
     * Expression with resultType object).
     *
     * @return the mlPipelineParameters value.
     */
    public Object mlPipelineParameters() {
        return this.mlPipelineParameters;
    }

    /**
     * Set the mlPipelineParameters property: Key,Value pairs to be passed to the published Azure ML pipeline endpoint.
     * Keys must match the names of pipeline parameters defined in the published pipeline. Values will be passed in the
     * ParameterAssignments property of the published pipeline execution request. Type: object with key value pairs (or
     * Expression with resultType object).
     *
     * @param mlPipelineParameters the mlPipelineParameters value to set.
     * @return the AzureMLExecutePipelineActivity object itself.
     */
    public AzureMLExecutePipelineActivity withMlPipelineParameters(Object mlPipelineParameters) {
        this.mlPipelineParameters = mlPipelineParameters;
        return this;
    }

    /**
     * Get the dataPathAssignments property: Dictionary used for changing data path assignments without retraining.
     * Values will be passed in the dataPathAssignments property of the published pipeline execution request. Type:
     * object with key value pairs (or Expression with resultType object).
     *
     * @return the dataPathAssignments value.
     */
    public Object dataPathAssignments() {
        return this.dataPathAssignments;
    }

    /**
     * Set the dataPathAssignments property: Dictionary used for changing data path assignments without retraining.
     * Values will be passed in the dataPathAssignments property of the published pipeline execution request. Type:
     * object with key value pairs (or Expression with resultType object).
     *
     * @param dataPathAssignments the dataPathAssignments value to set.
     * @return the AzureMLExecutePipelineActivity object itself.
     */
    public AzureMLExecutePipelineActivity withDataPathAssignments(Object dataPathAssignments) {
        this.dataPathAssignments = dataPathAssignments;
        return this;
    }

    /**
     * Get the mlParentRunId property: The parent Azure ML Service pipeline run id. This information will be passed in
     * the ParentRunId property of the published pipeline execution request. Type: string (or Expression with resultType
     * string).
     *
     * @return the mlParentRunId value.
     */
    public Object mlParentRunId() {
        return this.mlParentRunId;
    }

    /**
     * Set the mlParentRunId property: The parent Azure ML Service pipeline run id. This information will be passed in
     * the ParentRunId property of the published pipeline execution request. Type: string (or Expression with resultType
     * string).
     *
     * @param mlParentRunId the mlParentRunId value to set.
     * @return the AzureMLExecutePipelineActivity object itself.
     */
    public AzureMLExecutePipelineActivity withMlParentRunId(Object mlParentRunId) {
        this.mlParentRunId = mlParentRunId;
        return this;
    }

    /**
     * Get the continueOnStepFailure property: Whether to continue execution of other steps in the PipelineRun if a step
     * fails. This information will be passed in the continueOnStepFailure property of the published pipeline execution
     * request. Type: boolean (or Expression with resultType boolean).
     *
     * @return the continueOnStepFailure value.
     */
    public Object continueOnStepFailure() {
        return this.continueOnStepFailure;
    }

    /**
     * Set the continueOnStepFailure property: Whether to continue execution of other steps in the PipelineRun if a step
     * fails. This information will be passed in the continueOnStepFailure property of the published pipeline execution
     * request. Type: boolean (or Expression with resultType boolean).
     *
     * @param continueOnStepFailure the continueOnStepFailure value to set.
     * @return the AzureMLExecutePipelineActivity object itself.
     */
    public AzureMLExecutePipelineActivity withContinueOnStepFailure(Object continueOnStepFailure) {
        this.continueOnStepFailure = continueOnStepFailure;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureMLExecutePipelineActivity withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureMLExecutePipelineActivity withPolicy(ActivityPolicy policy) {
        super.withPolicy(policy);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureMLExecutePipelineActivity withName(String name) {
        super.withName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureMLExecutePipelineActivity withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureMLExecutePipelineActivity withDependsOn(List<ActivityDependency> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureMLExecutePipelineActivity withUserProperties(List<UserProperty> userProperties) {
        super.withUserProperties(userProperties);
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