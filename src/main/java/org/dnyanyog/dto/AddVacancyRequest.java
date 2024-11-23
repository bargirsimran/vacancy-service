package org.dnyanyog.dto;

import org.springframework.stereotype.Component;

@Component
public class AddVacancyRequest {
	
		private long id;
		private String vacancyName;
	 	private long jobId;
		private String jobTitle;
	    private String description;
	    private String hiringManager;
	    private int numberOfPosition;
	    private String costCenter;
	    private String vendorName;
	    private String status;
	    private String tenant;
	    
		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}
	    
	   
		public long getJobId() {
			return jobId;
		}

		public void setJobId(long jobId) {
			this.jobId = jobId;
		}

		public String getVacancyName() {
			return vacancyName;
		}
		public void setVacancyName(String vacancyName) {
			this.vacancyName = vacancyName;
		}
		public String getJobTitle() {
			return jobTitle;
		}
		public void setJobTitle(String jobTitle) {
			this.jobTitle = jobTitle;
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
