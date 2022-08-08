package org.terrakube.client.sample;

import org.terrakube.client.TerrakubeClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.terrakube.client.model.organization.Organization;
import org.terrakube.client.model.organization.ssh.Ssh;
import org.terrakube.client.model.organization.workspace.Workspace;
import org.terrakube.client.model.response.Response;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class ApiClientStarterSampleApplicationTests {

    @Autowired
    TerrakubeClient terrakubeClient;

    @Test
    void contextLoads() {
        assertNotNull(terrakubeClient);
		/**


		 Response<Ssh> sshResponse = terrakubeClient.getSshById("16503793-48a5-4a07-a058-cb38dd1aae53","34b3c9a8-6afc-4446-b8ec-dcd92cc26233");
		 System.out.println(sshResponse.getData().getAttributes().getPrivateKey());
		 System.out.println(sshResponse.getData().getAttributes().getSshType());
		 Response<Workspace> workspaceResponse = terrakubeClient.getWorkspaceById("16503793-48a5-4a07-a058-cb38dd1aae53","bce39846-8e87-468e-95a7-0f6f4f33d41f");
		 System.out.println(workspaceResponse.getData().getRelationships().getSsh().getData().getId());
		 System.out.println(workspaceResponse.getData().getRelationships().getSsh().getData().getType());

		 
		 System.out.println(terrakubeClient.getAllOrganizations().getData().size());
        Response<List<Organization>> organizationResponse = terrakubeClient.getOrganizationByName("hashicorp");

		Module moduleTemp = restClient.getModuleById("0faca394-14b3-40cb-b0d6-0775673259cf", "e63f7e58-d9d1-4033-a85f-4113430f9e19").getData();

        System.out.println(moduleTemp.getAttributes().getDownloadQuantity());

        ModuleRequest moduleRequest = new ModuleRequest();
        ModuleAttributes moduleAttributes = new ModuleAttributes();
        moduleAttributes.setDownloadQuantity(moduleTemp.getAttributes().getDownloadQuantity() + 1);
        moduleTemp.setAttributes(moduleAttributes);
        moduleRequest.setData(moduleTemp);

        restClient.updateModule(moduleRequest, "0faca394-14b3-40cb-b0d6-0775673259cf", "e63f7e58-d9d1-4033-a85f-4113430f9e19");

        String workspaceId = "7afc4a1f-b6cb-430a-bfaa-15ae72c85daa";

        JobRequest jobRequest = new JobRequest();
        Job job= restClient.getJobById("0faca394-14b3-40cb-b0d6-0775673259cf", "1").getData();
        job.getAttributes().setApprovalTeam("");
        jobRequest.setData(job);

        restClient.updateJob(jobRequest,"0faca394-14b3-40cb-b0d6-0775673259cf", "1");


/*
		HistoryRequest historyRequest = new HistoryRequest();
		History newHistory = new History();
		newHistory.setType("history");
		HistoryAttributes historyAttributes = new HistoryAttributes();
		historyAttributes.setOutput("HolaMundo333333");
		newHistory.setAttributes(historyAttributes);
		historyRequest.setData(newHistory);

		restClient.createHistory(historyRequest,"4918ee6f-ffaf-4532-a370-d8c06e45eb4d", "21bb4721-4760-49f0-a7c7-bd6072081be9" );

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

		/*
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
