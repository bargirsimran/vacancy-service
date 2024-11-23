package org.dnyanyog.common;

public enum ResponseCode {
	VACANCY_FAILED("FAIL", "Vacancy creation failed", "ERR001"),
	VACANCY_SUCCESS("SUCCESS", "Vacancy created successfully", "SUCCESS");

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
