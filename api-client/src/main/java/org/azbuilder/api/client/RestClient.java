package org.azbuilder.api.client;

import feign.Headers;
import feign.Param;
import feign.RequestLine;
import org.azbuilder.api.client.model.organization.OrganizationResponse;
import org.azbuilder.api.client.model.organization.job.Job;
import org.azbuilder.api.client.model.organization.module.definition.parameter.ParameterResponse;
import org.azbuilder.api.client.model.organization.workspace.WorkspaceResponse;
import org.azbuilder.api.client.model.organization.workspace.secret.SecretResponse;
import org.azbuilder.api.client.model.organization.workspace.variable.VariableResponse;

public interface RestClient{

    @RequestLine("GET /api/v1/organization")
    OrganizationResponse<Void> getAllOrganizations();

    @RequestLine("GET /api/v1/organization?filter[job]=status=={jobStatus}&include=job")
    OrganizationResponse<Job> getAllOrganizationsWithJobStatus(@Param("jobStatus") String jobStatus);

    @RequestLine("GET /api/v1/organization/{organizationId}/module/{moduleId}/definition/{definitionId}/parameter")
    ParameterResponse getAllDefinitions(@Param("organizationId") String organizationId, @Param("moduleId") String moduleId, @Param("definitionId") String definitionId);

    @RequestLine("GET /api/v1/organization/{organizationId}/workspace/{workspaceId}/secret")
    SecretResponse getAllSecrets(@Param("organizationId") String organizationId, @Param("workspaceId") String workspaceId);

    @RequestLine("GET /api/v1/organization/{organizationId}/workspace/{workspaceId}/variable")
    VariableResponse getAllVariables(@Param("organizationId") String organizationId, @Param("workspaceId") String workspaceId);

    @RequestLine("GET /api/v1/organization/{organizationId}/workspace")
    WorkspaceResponse getAllWorkspaces(@Param("organizationId") String organizationId);

}
