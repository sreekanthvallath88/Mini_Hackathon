package com.fintech.riskmanagementservic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fintech.riskmanagementservic.controller.RiskManagementController;
import com.fintech.riskmanagementservic.exception.ValidationException;
import com.fintech.riskmanagementservic.model.Company;
import com.fintech.riskmanagementservic.response.CreditScoreResponse;
import com.fintech.riskmanagementservic.service.RiskManagement;
import com.fintech.riskmanagementservic.service.impl.RiskManagementImpl;

@SpringBootTest
class RiskmanagementservicApplicationTests {

	@Mock
	private RiskManagement riskManagement;
	
	@InjectMocks
	private RiskManagementImpl riskAssessmentImpl;

    @InjectMocks
    private RiskManagementController riskManagementController;

    private Company company;

    @BeforeEach
    public void setUp() {
        company = new Company();
        company.setCompanyName("Test Company");
        company.setCompanyStatus("Active");
        //company.setIncorporationDate(LocalDate.now());
        company.setCompanyType("Limited");    
    }

    @Test
    public void testCalculateRiskScore_Success() throws JsonMappingException, JsonProcessingException {
        int mockScore = 85;
        String mockRiskLevel = "Low Risk";
        
        when(riskManagement.riskCalculation(company)).thenReturn(mockScore);
        when(riskManagement.riskLevel(mockScore)).thenReturn(mockRiskLevel);

        CreditScoreResponse response = riskManagementController.calculateCreditScore(company);

        assertNotNull(response);
        assertEquals(85, response.getScore());
        assertEquals("Low Risk", response.getRiskLevel());

        verify(riskManagement, times(1)).riskCalculation(company);
        verify(riskManagement, times(1)).riskLevel(mockScore);
    }

    
    @Test
    void shouldThrowValidationExceptionWhenCompanyNameIsEmpty() {
        company.setCompanyName(""); 

        ValidationException exception = assertThrows(ValidationException.class, () -> {
        	riskAssessmentImpl.validation(company) ;
        });

        assertEquals("Company name is required.", exception.getMessage());  
    }


}
