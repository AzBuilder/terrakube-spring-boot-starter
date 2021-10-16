package org.azbuilder.api.client.sample;

import org.azbuilder.api.client.TerrakubeClient;
import org.azbuilder.api.client.model.organization.Organization;
import org.azbuilder.api.client.model.organization.job.Job;
import org.azbuilder.api.client.model.organization.job.JobRequest;
import org.azbuilder.api.client.model.organization.job.step.Step;
import org.azbuilder.api.client.model.organization.job.step.StepAttributes;
import org.azbuilder.api.client.model.organization.job.step.StepRequest;
import org.azbuilder.api.client.model.organization.provider.version.Version;
import org.azbuilder.api.client.model.organization.provider.version.implementation.Implementation;
import org.azbuilder.api.client.model.organization.vcs.Vcs;
import org.azbuilder.api.client.model.organization.workspace.Workspace;
import org.azbuilder.api.client.model.organization.workspace.variable.Variable;
import org.azbuilder.api.client.model.response.Response;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

@SpringBootTest
class ApiClientStarterSampleApplicationTests {

	@Autowired
	TerrakubeClient restClient;

	@Test
	void contextLoads() {
		assertNotNull(restClient);

/*
		restClient.getAllOrganizations().getData().size();
		Response<List<Organization>> organizationResponse = restClient.getOrganizationByName("hashicorp");

		System.out.println("Organization");
		System.out.println(organizationResponse.getData().size());
		String organizationId = organizationResponse.getData().get(0).getId();
		System.out.println(organizationId);
		System.out.println("workspace");
		System.out.println(restClient.getAllWorkspaces(organizationResponse.getData().get(0).getId()).getData().size());
		Workspace workspaceData = restClient.getAllWorkspaces(organizationResponse.getData().get(0).getId()).getData().get(0);

		//System.out.println(workspaceData.getAttributes().getBranch());
		//System.out.println(workspaceData.getAttributes().getName());
		//System.out.println(workspaceData.getAttributes().getSource());
		//System.out.println(workspaceData.getAttributes().getTerraformVersion());

		System.out.println(workspaceData.getId());

		//VCS INFORMATION
		//System.out.println(workspaceData.getRelationships().getVcs().getData());
		//System.out.println(workspaceData.getRelationships().getVcs().getData().getId());
		//System.out.println(organizationResponse.getData().get(0).getRelationships().getVcs().getData());
		//System.out.println(organizationResponse.getData().get(0).getRelationships().getVcs().getData().get(0).getId());

		//Vcs vcs = restClient.getVcsById(organizationId, workspaceData.getRelationships().getVcs().getData().getId()).getData();
		//System.out.println(vcs.getAttributes().getClientId());
		//System.out.println(vcs.getAttributes().getClientSecret());
		//System.out.println(vcs.getAttributes().getAccessToken());
		//System.out.println(vcs.getAttributes().getName());
		//System.out.println(vcs.getAttributes().getDescription());
		//System.out.println(restClient.getAllVariables(organizationId, workspaceData.getId()).getData().size());
		//System.out.println(restClient.getAllEnvironmentVariables(organizationId,  workspaceData.getId()).getData().size());
		//System.out.println(restClient.getAllSecrets(organizationId,  workspaceData.getId()).getData().size());

		//System.out.println("pending");
		//System.out.println(restClient.getAllOrganizationsWithJobStatus("pending").getIncluded().size());

		//for (Variable variable : restClient.getWorkspaceByIdWithVariables(organizationId, workspaceData.getId()).getIncluded()) {
		//	System.out.println(variable.getAttributes().getCategory());
		//	System.out.println(variable.getAttributes().getValue());
		//}


		Job job = restClient.getJobById(organizationId, "1").getData();

		job.getAttributes().setStatus("completed");
		System.out.println(job.getAttributes().getTcl());
		System.out.println("Step Count");
		System.out.println(restClient.getJobById(organizationId, "1").getIncluded().size());

		JobRequest jobRequest = new JobRequest();
		jobRequest.setData(job);

		restClient.updateJob(jobRequest, job.getRelationships().getOrganization().getData().getId(), job.getId());

		restClient.updateJob(jobRequest,organizationId, "1");

		Step step = restClient.getJobById(organizationId, "1").getIncluded().get(0);
		StepRequest stepRequest = new StepRequest();
		step.getAttributes().setStatus("completed");
		stepRequest.setData(step);
		restClient.updateStep(stepRequest, organizationId, "1", step.getId());

		StepRequest stepRequest1 = new StepRequest();
		Step newStep = new Step();
		newStep.setType("step");
		StepAttributes stepAttributes = new StepAttributes();
		stepAttributes.setStepNumber("6");
		stepAttributes.setOutput("HolaMundo");
		stepAttributes.setStatus("completed");
		newStep.setAttributes(stepAttributes);
		stepRequest1.setData(newStep);

		restClient.createStep(stepRequest1,organizationId, "1" );

		/*
		System.out.println(restClient.getModuleByNameAndProvider(organizationId, "azure","azurerm").getData().get(0).getAttributes().getSource());

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
