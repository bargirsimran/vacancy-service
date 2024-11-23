package org.dnyanyog.common;

public enum ResponseCode {
	VACANCY_FAILED("FAIL", "Vacancy add failed", "ERR001"),
	VACANCY_SUCCESS("SUCCESS", "Vacancy added successfully", "SUCCESS"),
	 VACANCY_NOT_UPDATED("Fail", " Vacancy not found or invalid request!","ERR001"),
	 VACANCY_UPDATED("Success", "Vacancy updated successfully!",  "SUCCESS"),
	 SEARCH_VACANCY("Success", "Vacancy found successfully!",  "SUCCESS"),
	 SEARCH_VACANCY_FAILED("Fail", "Patient not found or invalid request!", "ERR001"),
	 NOT_DELETE_VACANCY("Fail", "Patient not deleted !", "ERR001"),
	 DELETE_VACANCY("Success", "Patient deleted successfully !", "SUCCESS" );
	
	private final String status;
	private final String message;
	private final String errorCode;

	ResponseCode(String status, String message, String errorCode) {
		this.status = status;
		this.message = message;
		this.errorCode = errorCode;
	}

	public String getStatus() {
		return status;
	}

	public String getMessage() {
		return message;
	}

	public String getErrorCode() {
		return errorCode;
	}
}
