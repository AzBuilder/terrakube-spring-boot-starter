package org.azbuilder.api.client.sample;

import org.azbuilder.api.client.model.organization.Organization;
import org.azbuilder.api.client.model.organization.provider.version.Version;
import org.azbuilder.api.client.model.organization.provider.version.implementation.Implementation;
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

		/*
		Response<List<Organization>> listResponse =
				restClient.getOrganizationsByNameAndProvider("sampleOrg","sampleProvider");

		System.out.println(listResponse.getData().get(0).getId());
		System.out.println(listResponse.getData().get(0).getRelationships().getProvider().getData().get(0).getId());

		Response<List<Version>> listVersion =
				restClient.getVersionsByOrganizationIdAndProviderIdAndVersionNumber(
						listResponse.getData().get(0).getId(),
						listResponse.getData().get(0).getRelationships().getProvider().getData().get(0).getId(),
						"2.0.0");

		System.out.println(listVersion.getData().get(0).getId());
		Response<List<Implementation>>  files= restClient.getImplementationByOsArchVersion(
				listResponse.getData().get(0).getId(),
				listResponse.getData().get(0).getRelationships().getProvider().getData().get(0).getId(),
				listVersion.getData().get(0).getId(),
				"darwin",
				"amd64");

		System.out.println(files.getData().get(0).getId());
		System.out.println(files.getData().get(0).getAttributes().getFilename());



		System.out.println(restClient.getAllVersionsByProviderWithImplementation(listResponse.getData().get(0).getId(),
				listResponse.getData().get(0).getRelationships().getProvider().getData().get(0).getId()).getIncluded().size());*/

	}
}
