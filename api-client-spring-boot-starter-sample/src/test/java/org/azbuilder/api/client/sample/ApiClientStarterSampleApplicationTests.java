package org.azbuilder.api.client.sample;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.azbuilder.api.client.RestClient;

@SpringBootTest
class ApiClientStarterSampleApplicationTests {

	@Autowired
	RestClient restClient;

	@Test
	void contextLoads() {
		assertNotNull(restClient);
	}

}
