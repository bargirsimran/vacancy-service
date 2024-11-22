package org.dnyanyog.dto;

public class AddVacancyResponse {

	private String message;
	private String errorCode;
	private Integer vacancy_id;
	
	private AddVacancyRequest addVacancyRequest;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Integer getVacancy_id() {
		return vacancy_id;
	}

	public void setVacancy_id(Integer vacancy_id) {
		this.vacancy_id = vacancy_id;
	}

	public AddVacancyRequest getAddVacancyRequest() {
		return addVacancyRequest;
	}

	public void setAddVacancyRequest(AddVacancyRequest addVacancyRequest) {
		this.addVacancyRequest = addVacancyRequest;
	}
	
	
	
}
