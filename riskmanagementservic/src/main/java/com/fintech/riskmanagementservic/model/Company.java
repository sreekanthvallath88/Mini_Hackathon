package com.fintech.riskmanagementservic.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Company {

    @JsonProperty("company_name")
    private String companyName;

    @JsonProperty("company_number")
    private String companyNumber;

    @JsonProperty("company_status")
    private String companyStatus;
    
    private String companyType;
    
    private String confirmationStatment;
    
    private String industrySector;
    
    private String natureOfBusiness;
    
    private String registrationNumber;
    
    private int registredDirectors;
    
    private int statementOfCapital;
    
    private String companyWebDomain;

    @JsonProperty("date_of_creation")
    private String dateOfCreation;

    @JsonProperty("has_been_liquidated")
    private boolean hasBeenLiquidated;

    @JsonProperty("has_charges")
    private boolean hasCharges;

    @JsonProperty("has_insolvency_history")
    private boolean hasInsolvencyHistory;

    @JsonProperty("jurisdiction")
    private String jurisdiction;

    @JsonProperty("last_full_members_list_date")
    private String lastFullMembersListDate;

    @JsonProperty("type")
    private String type;

    @JsonProperty("undeliverable_registered_office_address")
    private boolean undeliverableRegisteredOfficeAddress;

    @JsonProperty("has_super_secure_pscs")
    private boolean hasSuperSecurePscs;

    @JsonProperty("can_file")
    private boolean canFile;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyNumber() {
		return companyNumber;
	}

	public void setCompanyNumber(String companyNumber) {
		this.companyNumber = companyNumber;
	}

	public String getCompanyStatus() {
		return companyStatus;
	}

	public void setCompanyStatus(String companyStatus) {
		this.companyStatus = companyStatus;
	}

	public String getDateOfCreation() {
		return dateOfCreation;
	}

	public void setDateOfCreation(String dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}

	public boolean isHasBeenLiquidated() {
		return hasBeenLiquidated;
	}

	public void setHasBeenLiquidated(boolean hasBeenLiquidated) {
		this.hasBeenLiquidated = hasBeenLiquidated;
	}

	public boolean isHasCharges() {
		return hasCharges;
	}

	public void setHasCharges(boolean hasCharges) {
		this.hasCharges = hasCharges;
	}

	public boolean isHasInsolvencyHistory() {
		return hasInsolvencyHistory;
	}

	public void setHasInsolvencyHistory(boolean hasInsolvencyHistory) {
		this.hasInsolvencyHistory = hasInsolvencyHistory;
	}

	public String getJurisdiction() {
		return jurisdiction;
	}

	public void setJurisdiction(String jurisdiction) {
		this.jurisdiction = jurisdiction;
	}

	public String getLastFullMembersListDate() {
		return lastFullMembersListDate;
	}

	public void setLastFullMembersListDate(String lastFullMembersListDate) {
		this.lastFullMembersListDate = lastFullMembersListDate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isUndeliverableRegisteredOfficeAddress() {
		return undeliverableRegisteredOfficeAddress;
	}

	public void setUndeliverableRegisteredOfficeAddress(boolean undeliverableRegisteredOfficeAddress) {
		this.undeliverableRegisteredOfficeAddress = undeliverableRegisteredOfficeAddress;
	}

	public boolean isHasSuperSecurePscs() {
		return hasSuperSecurePscs;
	}

	public void setHasSuperSecurePscs(boolean hasSuperSecurePscs) {
		this.hasSuperSecurePscs = hasSuperSecurePscs;
	}

	public boolean isCanFile() {
		return canFile;
	}

	public void setCanFile(boolean canFile) {
		this.canFile = canFile;
	}

	public String getCompanyType() {
		return companyType;
	}

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public String getConfirmationStatment() {
		return confirmationStatment;
	}

	public void setConfirmationStatment(String confirmationStatment) {
		this.confirmationStatment = confirmationStatment;
	}

	public String getNatureOfBusiness() {
		return natureOfBusiness;
	}

	public void setNatureOfBusiness(String natureOfBusiness) {
		this.natureOfBusiness = natureOfBusiness;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getCompanyWebDomain() {
		return companyWebDomain;
	}

	public void setCompanyWebDomain(String companyWebDomain) {
		this.companyWebDomain = companyWebDomain;
	}

	public String getIndustrySector() {
		return industrySector;
	}

	public void setIndustrySectorRule(String industrySector) {
		this.industrySector = industrySector;
	}

	public int getRegistredDirectors() {
		return registredDirectors;
	}

	public void setRegistredDirectors(int registredDirectors) {
		this.registredDirectors = registredDirectors;
	}

	public int getStatementOfCapital() {
		return statementOfCapital;
	}

	public void setStatementOfCapital(int statementOfCapital) {
		this.statementOfCapital = statementOfCapital;
	}
	

}
