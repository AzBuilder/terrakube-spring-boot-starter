package org.azbuilder.api.client.sample;

import org.azbuilder.api.client.model.organization.Organization;
import org.azbuilder.api.client.model.organization.job.Job;
import org.azbuilder.api.client.model.organization.job.JobRequest;
import org.azbuilder.api.client.model.organization.workspace.Workspace;
import org.azbuilder.api.client.model.response.Response;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.azbuilder.api.client.RestClient;

import java.util.List;

@SpringBootTest
class ApiClientStarterSampleApplicationTests {

	@Autowired
	RestClient restClient;

	@Test
	void contextLoads() {
		assertNotNull(restClient);
		/*
		restClient.getAllOrganizations().getData().size();
		Response<List<Organization>> organizationResponse = restClient.getOrganizationByName("organization1");

		System.out.println("Organization");
		System.out.println(organizationResponse.getData().size());
		String organizationId = organizationResponse.getData().get(0).getId();
		System.out.println(organizationId);
		System.out.println("workspace");
		System.out.println(restClient.getAllWorkspaces(organizationResponse.getData().get(0).getId()).getData().size());
		Workspace workspaceData = restClient.getAllWorkspaces(organizationResponse.getData().get(0).getId()).getData().get(0);

		System.out.println(workspaceData.getAttributes().getBranch());
		System.out.println(workspaceData.getAttributes().getName());
		System.out.println(workspaceData.getAttributes().getSource());
		System.out.println(workspaceData.getAttributes().getTerraformVersion());

		System.out.println(workspaceData.getId());
		System.out.println(restClient.getAllVariables(organizationId, workspaceData.getId()).getData().size());
		System.out.println(restClient.getAllEnvironmentVariables(organizationId,  workspaceData.getId()).getData().size());
		System.out.println(restClient.getAllSecrets(organizationId,  workspaceData.getId()).getData().size());

		System.out.println("pending");
		System.out.println(restClient.getAllOrganizationsWithJobStatus("pending").getIncluded().size());

		restClient.getWorkspaceByIdWithEnvironmentVariables(organizationId, workspaceData.getId());
		restClient.getWorkspaceByIdWithVariables(organizationId, workspaceData.getId());
		restClient.getWorkspaceByIdWithSecrets(organizationId, workspaceData.getId());

		Job job = restClient.getJobById(organizationId, "1").getData();
		job.getAttributes().setStatus("completed");

		JobRequest jobRequest = new JobRequest();
		jobRequest.setData(job);

		restClient.updateJob(jobRequest, job.getRelationships().getOrganization().getData().getId(), job.getId());

		restClient.updateJob(jobRequest,organizationId, "1");

		System.out.println(restClient.getModuleByNameAndProvider(organizationId, "azure","azurerm").getData().get(0).getAttributes().getSource());
		*/

	}
}
