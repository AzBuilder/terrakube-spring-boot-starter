package org.azbuilder.api.client;

import feign.Headers;
import feign.Param;
import feign.RequestLine;
import org.azbuilder.api.client.model.generic.Resource;
import org.azbuilder.api.client.model.organization.Organization;
import org.azbuilder.api.client.model.organization.OrganizationResponse;
import org.azbuilder.api.client.model.organization.job.Job;
import org.azbuilder.api.client.model.organization.job.JobRequest;
import org.azbuilder.api.client.model.organization.job.JobResponse;
import org.azbuilder.api.client.model.organization.module.ModuleResponse;
import org.azbuilder.api.client.model.organization.module.definition.Definition;
import org.azbuilder.api.client.model.organization.module.definition.parameter.Parameter;
import org.azbuilder.api.client.model.organization.module.definition.parameter.ParameterResponse;
import org.azbuilder.api.client.model.organization.workspace.Workspace;
import org.azbuilder.api.client.model.organization.workspace.WorkspaceResponse;
import org.azbuilder.api.client.model.organization.workspace.environment.Environment;
import org.azbuilder.api.client.model.organization.workspace.environment.EnvironmentResponse;
import org.azbuilder.api.client.model.organization.workspace.secret.Secret;
import org.azbuilder.api.client.model.organization.workspace.secret.SecretResponse;
import org.azbuilder.api.client.model.organization.workspace.variable.Variable;
import org.azbuilder.api.client.model.organization.workspace.variable.VariableResponse;

import java.util.List;

public interface RestClient {

    @RequestLine("GET /api/v1/organization")
    OrganizationResponse<List<Organization>, Resource> getAllOrganizations();

    @RequestLine("GET /api/v1/organization?filter[job]=status=={jobStatus}&include=job")
    OrganizationResponse<List<Organization>, Job> getAllOrganizationsWithJobStatus(@Param("jobStatus") String jobStatus);

    @RequestLine("GET /api/v1/organization/{organizationId}/module/{moduleId}/definition/{definitionId}/parameter")
    ParameterResponse<List<Parameter>> getAllParameters(@Param("organizationId") String organizationId, @Param("moduleId") String moduleId, @Param("definitionId") String definitionId);

    @RequestLine("GET /api/v1/organization/{organizationId}/workspace/{workspaceId}/secret")
    SecretResponse<List<Secret>> getAllSecrets(@Param("organizationId") String organizationId, @Param("workspaceId") String workspaceId);

    @RequestLine("GET /api/v1/organization/{organizationId}/workspace/{workspaceId}/variable")
    VariableResponse<List<Variable>> getAllVariables(@Param("organizationId") String organizationId, @Param("workspaceId") String workspaceId);

    @RequestLine("GET /api/v1/organization/{organizationId}/workspace/{workspaceId}/environment")
    EnvironmentResponse<List<Environment>> getAllEnvironmentVariables(@Param("organizationId") String organizationId, @Param("workspaceId") String workspaceId);

    @RequestLine("GET /api/v1/organization/{organizationId}/workspace")
    WorkspaceResponse<List<Workspace>, Resource> getAllWorkspaces(@Param("organizationId") String organizationId);

    @RequestLine("GET /api/v1/organization/{organizationId}/workspace/{workspaceId}?include=definition")
    WorkspaceResponse<Workspace, Definition> getWorkspaceByIdWithModuleDefinition(@Param("organizationId") String organizationId, @Param("workspaceId") String workspaceId);

    @RequestLine("GET /api/v1/organization/{organizationId}/workspace/{workspaceId}?include=variable")
    WorkspaceResponse<Workspace, Variable> getWorkspaceByIdWithVariables(@Param("organizationId") String organizationId, @Param("workspaceId") String workspaceId);

    @RequestLine("GET /api/v1/organization/{organizationId}/workspace/{workspaceId}?include=secret")
    WorkspaceResponse<Workspace, Secret> getWorkspaceByIdWithSecrets(@Param("organizationId") String organizationId, @Param("workspaceId") String workspaceId);

    @RequestLine("GET /api/v1/organization/{organizationId}/workspace/{workspaceId}?include=environment")
    WorkspaceResponse<Workspace, Environment> getWorkspaceByIdWithEnvironmentVariables(@Param("organizationId") String organizationId, @Param("workspaceId") String workspaceId);

    @RequestLine("PATCH /api/v1/organization/{organizationId}/job/{jobId}")
    @Headers("Content-Type: application/vnd.api+json")
    void updateJob(JobRequest jobRequest, @Param("organizationId") String organizationId, @Param("jobId") String jobId);

    @RequestLine("GET /api/v1/organization/{organizationId}/job/{jobId}")
    JobResponse getJobById(@Param("organizationId") String organizationId, @Param("jobId") String jobId);

    @RequestLine("GET /api/v1/organization?filter[organization]=name=={organizationName}")
    OrganizationResponse<List<Organization>, Resource> getOrganizationByName(@Param("organizationName") String organizationName);

    @RequestLine("GET /api/v1/organization/{organizationId}/module?include=definition&filter[module]=name=={moduleName};provider=={providerName}")
    ModuleResponse<List<Organization>, Definition> getModuleByNameAndProviderWithModuleDefinition(@Param("organizationId") String organizationId, @Param("moduleName") String moduleName, @Param("providerName") String providerName);

}
