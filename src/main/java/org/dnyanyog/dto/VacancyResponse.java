package org.dnyanyog.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VacancyResponse {

	private String status;
	private String message;

	@Autowired
	private VacancyData VacancyData;

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

	public VacancyData getVacancyData() {
		return VacancyData;
	}

	public void setVacancyData(VacancyData vacancyData) {
		VacancyData = vacancyData;
	}

}
