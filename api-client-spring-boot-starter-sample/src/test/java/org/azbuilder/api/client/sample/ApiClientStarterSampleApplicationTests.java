package org.azbuilder.api.client.sample;

import org.azbuilder.api.client.model.generic.Resource;
import org.azbuilder.api.client.model.organization.Organization;
import org.azbuilder.api.client.model.organization.OrganizationResponse;
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
		//restClient.getAllOrganizations();
		//OrganizationResponse<List<Organization>, Resource>  organizationResponse = restClient.getOrganizationByName("organization1");

		//System.out.println(organizationResponse.getData().size());
		//System.out.println(organizationResponse.getData().get(0).getId());


		//System.out.println(restClient.getModuleByNameAndProviderWithModuleDefinition(organizationResponse.getData().get(0).getId(),"Azure","azurerm").getIncluded().size());

		//restClient.getModuleByNameAndProviderWithModuleDefinition(organizationResponse.getData().get(0).getId(),"Google","gcp").getIncluded().forEach(k->System.out.println(k.getAttributes().get("terraformVersion")));
	}

}
