package org.dnyanyog.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import java.util.*;
import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name = "vacancy")
public class Vacancy {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column
	private long id;

	@Column
	private String vacancyName;

	@Column(name = "job_id")
	private long jobId;

	public long getJobId() {
		return jobId;
	}

	public void setJobId(long jobId) {
		this.jobId = jobId;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	@Column(name = "job_title")
	private String jobTitle;

	@Column
	private String description;

	@Column(name = "hiring_manager")
	private String hiringManager;

	@Column(name = "number_of_position")
	private int numberOfPosition;

	@Column
	private String costCenter;

	@Column
	private String vendorName;

	@Column
	private String status;

	@Column
	private String tenant;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getVacancyName() {
		return vacancyName;
	}

	public void setVacancyName(String vacancyName) {
		this.vacancyName = vacancyName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHiringManager() {
		return hiringManager;
	}

	public void setHiringManager(String hiringManager) {
		this.hiringManager = hiringManager;
	}

	public int getNumberOfPosition() {
		return numberOfPosition;
	}

	public void setNumberOfPosition(int numberOfPosition) {
		this.numberOfPosition = numberOfPosition;
	}

	public String getCostCenter() {
		return costCenter;
	}

	public void setCostCenter(String costCenter) {
		this.costCenter = costCenter;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTenant() {
		return tenant;
	}

	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

}
