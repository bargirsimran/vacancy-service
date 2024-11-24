package org.dnyanyog.controller;

import java.io.ObjectInputFilter.Status;

import javax.xml.xpath.XPathExpressionException;

import org.dnyanyog.VacancyServiceMain;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
@ContextConfiguration(classes=VacancyServiceMain.class)
public class VacancyServiceTestController {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	@Order(1)
	public void VacancyAddSucess() throws XPathExpressionException, Exception {
		
		MockHttpServletRequestBuilder requestBuilder=MockMvcRequestBuilders.post("api/user/AddVacancy").content("{\r\n"
				+ "  \"vacancyName\": \"Software Tester\",\r\n"
				+ "  \"jobTitle\": \"SDET\",\r\n"
				+ "  \"description\": \"Develop and Test Java Applications\",\r\n"
				+ "  \"hiringManager\": \"John\",\r\n"
				+ "  \"numberOfPosition\": 10,\r\n"
				+ "  \"costCenter\": \"CC12342\",\r\n"
				+ "  \"vendorName\": \"XYZ\",\r\n"
				+ "  \"status\": \"Open\",\r\n"
				+ "  \"tenant\": \"TenantA\",\r\n"
				+ "  \"jobId\":40\r\n"
				+ "}\r\n"
				+ "").contentType(MediaType.APPLICATION_JSON_VALUE)
				.accept(MediaType.APPLICATION_JSON_VALUE);
		
		mockMvc
		.perform(requestBuilder)
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.jsonPath("$.status").value("Success"))
		.andExpect(MockMvcResultMatchers.jsonPath("$.message").value("Vacancy added successfully"))
		.andReturn();
	}
	
	@Test
	@Order(2)
	public void VacancyAddFailed() throws XPathExpressionException, Exception {
		MockHttpServletRequestBuilder requestBuilder=MockMvcRequestBuilders.post("api/user/AddVacancy").content("{\r\n"
				+ "  \"vacancyName\": \"Software Tester\",\r\n"
				+ "  \"jobTitle\": \"SDET\",\r\n"
				+ "  \"description\": \"Develop and Test Java Applications\",\r\n"
				+ "  \"hiringManager\": \"John\",\r\n"
				+ "  \"numberOfPosition\": 10,\r\n"
				+ "  \"costCenter\": \"CC12342\",\r\n"
				+ "  \"vendorName\": \"XYZ\",\r\n"
				+ "  \"status\": \"Open\",\r\n"
				+ "  \"tenant\": \"TenantA\",\r\n"
				+ "  \"jobId\":40\r\n"
				+ "}").contentType(MediaType.APPLICATION_JSON_VALUE).accept(MediaType.APPLICATION_JSON_VALUE);
		
		mockMvc
		.perform(requestBuilder)
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.jsonPath("$.status").value("Failed"))
		.andExpect(MockMvcResultMatchers.jsonPath("$.message").value("Vacancy added Failed"))
		.andReturn();
	}
	
	@Test
	@Order(3)
	public void VacancyUpdateSuccess() throws XPathExpressionException, Exception {
		
		MockHttpServletRequestBuilder requestBuilder=MockMvcRequestBuilders.post("api/user/UpdateVacancy").content("{\r\n"
				+ "  \"vacancyName\": \"Software Tester\",\r\n"
				+ "  \"jobTitle\": \"SDET\",\r\n"
				+ "  \"description\": \"Develop and Test Java Applications\",\r\n"
				+ "  \"hiringManager\": \"John\",\r\n"
				+ "  \"numberOfPosition\": 10,\r\n"
				+ "  \"costCenter\": \"CC12342\",\r\n"
				+ "  \"vendorName\": \"XYZ\",\r\n"
				+ "  \"status\": \"Open\",\r\n"
				+ "  \"tenant\": \"TenantA\",\r\n"
				+ "  \"jobId\":40\r\n"
				+ "}").contentType(MediaType.APPLICATION_JSON_VALUE).accept(MediaType.APPLICATION_JSON_VALUE);
		
		mockMvc
		.perform(requestBuilder)
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.jsonPath("$.status").value("Success"))
		.andExpect(MockMvcResultMatchers.jsonPath("$.message").value("Vacancy updated successfully!"))	
		.andReturn();
	}
	
	@Test
	@Order(4)
	public void VacancyUpdateFailed() throws XPathExpressionException, Exception {
		
		MockHttpServletRequestBuilder requestBuilder=MockMvcRequestBuilders.post("api/user/UpdateVacancy").content("{\r\n"
				+ "  \"vacancyName\": \"Software Tester\",\r\n"
				+ "  \"jobTitle\": \"SDET\",\r\n"
				+ "  \"description\": \"Develop and Test Java Applications\",\r\n"
				+ "  \"hiringManager\": \"John\",\r\n"
				+ "  \"numberOfPosition\": 10,\r\n"
				+ "  \"costCenter\": \"CC12342\",\r\n"
				+ "  \"vendorName\": \"XYZ\",\r\n"
				+ "  \"status\": \"Open\",\r\n"
				+ "  \"tenant\": \"TenantA\",\r\n"
				+ "  \"jobId\":40\r\n"
				+ "}").contentType(MediaType.APPLICATION_JSON_VALUE).accept(MediaType.APPLICATION_JSON_VALUE);
		
		mockMvc
		.perform(requestBuilder)
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.jsonPath("$.status").value("Fail"))
		.andExpect(MockMvcResultMatchers.jsonPath("$.message").value("Vacancy not found or invalid request!"))
		.andReturn();
	}
	
	@Test
	@Order(5)
	public void VacancyDeleteSuccess() throws XPathExpressionException, Exception {
		
		MockHttpServletRequestBuilder requestBuilder=MockMvcRequestBuilders.post("api/user/DeleteVacancy/{id}").content("{\r\n"
				+ "  \"vacancyName\": \"Software Tester\",\r\n"
				+ "  \"jobTitle\": \"SDET\",\r\n"
				+ "  \"description\": \"Develop and Test Java Applications\",\r\n"
				+ "  \"hiringManager\": \"John\",\r\n"
				+ "  \"numberOfPosition\": 10,\r\n"
				+ "  \"costCenter\": \"CC12342\",\r\n"
				+ "  \"vendorName\": \"XYZ\",\r\n"
				+ "  \"status\": \"Open\",\r\n"
				+ "  \"tenant\": \"TenantA\",\r\n"
				+ "  \"jobId\":40\r\n"
				+ "}").contentType(MediaType.APPLICATION_JSON_VALUE).accept(MediaType.APPLICATION_JSON_VALUE);
		
		mockMvc
		.perform(requestBuilder)
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.jsonPath("$.status").value("Success"))
		.andExpect(MockMvcResultMatchers.jsonPath("$.message").value("Vacancy deleted successfully !"))
		.andReturn();
	}
	@Test
	@Order(6)
	public void VacancyDeleteFailed() throws XPathExpressionException, Exception {
		
		MockHttpServletRequestBuilder requestBuilder=MockMvcRequestBuilders.post("api/user/GetVacancy/{id}").content("{\r\n"
				+ "  \"vacancyName\": \"Software Tester\",\r\n"
				+ "  \"jobTitle\": \"SDET\",\r\n"
				+ "  \"description\": \"Develop and Test Java Applications\",\r\n"
				+ "  \"hiringManager\": \"John\",\r\n"
				+ "  \"numberOfPosition\": 10,\r\n"
				+ "  \"costCenter\": \"CC12342\",\r\n"
				+ "  \"vendorName\": \"XYZ\",\r\n"
				+ "  \"status\": \"Open\",\r\n"
				+ "  \"tenant\": \"TenantA\",\r\n"
				+ "  \"jobId\":40\r\n"
				+ "}").contentType(MediaType.APPLICATION_JSON_VALUE).accept(MediaType.APPLICATION_JSON_VALUE);
		
		mockMvc
		.perform(requestBuilder)
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.jsonPath("$.status").value("Fail"))
		.andExpect(MockMvcResultMatchers.jsonPath("$.message").value("Vacancy not deleted !"))
		.andReturn();
	}
	@Test
	@Order(7)
	public void VacancySearchFailed() throws XPathExpressionException, Exception {
		
		MockHttpServletRequestBuilder requestBuilder=MockMvcRequestBuilders.post("api/user/GetVacancy/{id}").content("{\r\n"
				+ "  \"vacancyName\": \"Software Tester\",\r\n"
				+ "  \"jobTitle\": \"SDET\",\r\n"
				+ "  \"description\": \"Develop and Test Java Applications\",\r\n"
				+ "  \"hiringManager\": \"John\",\r\n"
				+ "  \"numberOfPosition\": 10,\r\n"
				+ "  \"costCenter\": \"CC12342\",\r\n"
				+ "  \"vendorName\": \"XYZ\",\r\n"
				+ "  \"status\": \"Open\",\r\n"
				+ "  \"tenant\": \"TenantA\",\r\n"
				+ "  \"jobId\":40\r\n"
				+ "}").contentType(MediaType.APPLICATION_JSON_VALUE).accept(MediaType.APPLICATION_JSON_VALUE);
		
		mockMvc
		.perform(requestBuilder)
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.jsonPath("$.status").value("Fail"))
		.andExpect(MockMvcResultMatchers.jsonPath("$.message").value("Vacancy not found or invalid request!"))
		.andReturn();
	}
	@Test
	@Order(8)
	public void VacancySearchSuccess() throws XPathExpressionException, Exception {
		
		MockHttpServletRequestBuilder requestBuilder=MockMvcRequestBuilders.post("api/user/GetVacancy/{id}").content("{\r\n"
				+ "  \"vacancyName\": \"Software Tester\",\r\n"
				+ "  \"jobTitle\": \"SDET\",\r\n"
				+ "  \"description\": \"Develop and Test Java Applications\",\r\n"
				+ "  \"hiringManager\": \"John\",\r\n"
				+ "  \"numberOfPosition\": 10,\r\n"
				+ "  \"costCenter\": \"CC12342\",\r\n"
				+ "  \"vendorName\": \"XYZ\",\r\n"
				+ "  \"status\": \"Open\",\r\n"
				+ "  \"tenant\": \"TenantA\",\r\n"
				+ "  \"jobId\":40\r\n"
				+ "}").contentType(MediaType.APPLICATION_JSON_VALUE).accept(MediaType.APPLICATION_JSON_VALUE);
		
		mockMvc
		.perform(requestBuilder)
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.jsonPath("$.status").value("Success"))
		.andExpect(MockMvcResultMatchers.jsonPath("$.message").value("Vacancy found successfully!"))
		.andReturn();
	}

	
}
