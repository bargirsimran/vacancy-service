package org.dnyanyog.dto;

import org.springframework.stereotype.Component;

@Component
public class AddVacancyResponse {

	private String status;
	private String message;
	private String errorCode;
	private long vacancy_id;
	
	private AddVacancyRequest addVacancyRequest;
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

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

	public long getVacancy_id() {
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
