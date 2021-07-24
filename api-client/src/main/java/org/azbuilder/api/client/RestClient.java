package org.azbuilder.api.client;

import feign.Headers;
import feign.Param;
import feign.RequestLine;
import org.azbuilder.api.client.model.organization.Organization;
import org.azbuilder.api.client.model.organization.job.Job;
import org.azbuilder.api.client.model.organization.job.JobRequest;
import org.azbuilder.api.client.model.organization.module.Module;
import org.azbuilder.api.client.model.organization.provider.version.Version;
import org.azbuilder.api.client.model.organization.provider.version.file.File;
import org.azbuilder.api.client.model.organization.workspace.Workspace;
import org.azbuilder.api.client.model.organization.workspace.environment.Environment;
import org.azbuilder.api.client.model.organization.workspace.secret.Secret;
import org.azbuilder.api.client.model.organization.workspace.variable.Variable;
import org.azbuilder.api.client.model.response.Response;
import org.azbuilder.api.client.model.response.ResponseWithInclude;

import java.util.List;

public interface RestClient {

    @RequestLine("GET /api/v1/organization")
    Response<List<Organization>> getAllOrganizations();

    @RequestLine("GET /api/v1/organization?filter[job]=status=={jobStatus}&include=job")
    ResponseWithInclude<List<Organization>, Job> getAllOrganizationsWithJobStatus(@Param("jobStatus") String jobStatus);

    @RequestLine("GET /api/v1/organization/{organizationId}/workspace/{workspaceId}/secret")
    Response<List<Secret>> getAllSecrets(@Param("organizationId") String organizationId, @Param("workspaceId") String workspaceId);

    @RequestLine("GET /api/v1/organization/{organizationId}/workspace/{workspaceId}/variable")
    Response<List<Variable>> getAllVariables(@Param("organizationId") String organizationId, @Param("workspaceId") String workspaceId);

    @RequestLine("GET /api/v1/organization/{organizationId}/workspace/{workspaceId}/environment")
    Response<List<Environment>> getAllEnvironmentVariables(@Param("organizationId") String organizationId, @Param("workspaceId") String workspaceId);

    @RequestLine("GET /api/v1/organization/{organizationId}/workspace")
    Response<List<Workspace>> getAllWorkspaces(@Param("organizationId") String organizationId);

    @RequestLine("GET /api/v1/organization/{organizationId}/workspace/{workspaceId}")
    Response<Workspace> getWorkspaceById(@Param("organizationId") String organizationId, @Param("workspaceId") String workspaceId);

    @RequestLine("GET /api/v1/organization/{organizationId}/workspace/{workspaceId}?include=variable")
    ResponseWithInclude<Workspace, Variable> getWorkspaceByIdWithVariables(@Param("organizationId") String organizationId, @Param("workspaceId") String workspaceId);

    @RequestLine("GET /api/v1/organization/{organizationId}/workspace/{workspaceId}?include=secret")
    ResponseWithInclude<Workspace, Secret> getWorkspaceByIdWithSecrets(@Param("organizationId") String organizationId, @Param("workspaceId") String workspaceId);

    @RequestLine("GET /api/v1/organization/{organizationId}/workspace/{workspaceId}?include=environment")
    ResponseWithInclude<Workspace, Environment> getWorkspaceByIdWithEnvironmentVariables(@Param("organizationId") String organizationId, @Param("workspaceId") String workspaceId);

    @RequestLine("PATCH /api/v1/organization/{organizationId}/job/{jobId}")
    @Headers("Content-Type: application/vnd.api+json")
    void updateJob(JobRequest jobRequest, @Param("organizationId") String organizationId, @Param("jobId") String jobId);

    @RequestLine("GET /api/v1/organization/{organizationId}/job/{jobId}")
    Response<Job> getJobById(@Param("organizationId") String organizationId, @Param("jobId") String jobId);

    @RequestLine("GET /api/v1/organization?filter[organization]=name=={organizationName}")
    Response<List<Organization>> getOrganizationByName(@Param("organizationName") String organizationName);

    @RequestLine("GET /api/v1/organization/{organizationId}/module?filter[module]=name=={moduleName};provider=={providerName}")
    Response<List<Module>> getModuleByNameAndProvider(@Param("organizationId") String organizationId, @Param("moduleName") String moduleName, @Param("providerName") String providerName);

    @RequestLine("GET /api/v1/organization?filter[organization]=name=={organizationName}&filter[provider]=name=={providerName}")
    Response<List<Organization>> getOrganizationsByNameAndProvider(@Param("organizationName") String organizationName, @Param("providerName") String providerName);

    @RequestLine("GET /api/v1/organization/{organizationId}/provider/{providerId}/version?filter[version]=versionNumber=={versionNumber}")
    Response<List<Version>> getVersionsByVersionNumber(@Param("organizationId") String organizationId, @Param("providerId") String providerId, @Param("versionNumber") String versionNumber);

    @RequestLine("GET /api/v1/organization/{organizationId}/provider/{providerId}/version/{versionId}/file?filter[file]=os=={os};arch=={arch}")
    Response<List<File>> getImplementationsByOsArchVersion(@Param("organizationId") String organizationId, @Param("providerId") String providerId, @Param("versionId") String versionId, @Param("os") String os, @Param("arch") String arch);

}
