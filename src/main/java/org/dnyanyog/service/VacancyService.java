package org.dnyanyog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.ResponseCache;
import java.util.List;
import java.util.Optional;

import org.apache.coyote.Response;
import org.dnyanyog.common.ResponseCode;
import org.dnyanyog.dto.VacancyRequest;
import org.dnyanyog.dto.VacancyResponse;
import org.dnyanyog.entity.Vacancy;
import org.dnyanyog.repo.VacancyServiceRepository;

@Service
public class VacancyService {

	@Autowired
	private VacancyServiceRepository vacancyRepo;
	
	@Autowired
	VacancyResponse vacancyResponse;

	public VacancyResponse addVacancy(VacancyRequest request) {
		
		List<Vacancy> optionalVacancy = vacancyRepo.findByJobId(request.getId());
		
		if (!optionalVacancy.isEmpty()) {
			vacancyResponse.setStatus(ResponseCode.VACANCY_FAILED.getStatus());
			vacancyResponse.setMessage(ResponseCode.VACANCY_FAILED.getMessage());
			return vacancyResponse;
		}

		Vacancy vacancy = new Vacancy();
		vacancy.setJobId(request.getJobId());
		vacancy.setVacancyName(request.getVacancyName());
		vacancy.setJobTitle(request.getJobTitle());
		vacancy.setNumberOfPosition(request.getNumberOfPosition());
		vacancy.setCostCenter(request.getCostCenter());
		vacancy.setDescription(request.getDescription());
		vacancy.setHiringManager(request.getHiringManager());
		vacancy.setStatus(request.getStatus());
		vacancy.setTenant(request.getTenant());
		vacancy.setVendorName(request.getVendorName());

		vacancy = vacancyRepo.save(vacancy);
		vacancyResponse.setStatus(ResponseCode.VACANCY_SUCCESS.getStatus());
		vacancyResponse.setMessage(ResponseCode.VACANCY_SUCCESS.getMessage());
		vacancyResponse.setErrorCode(ResponseCode.VACANCY_FAILED.getErrorCode());

		return vacancyResponse;
	}
	public VacancyResponse updateVacancy(Long id, VacancyRequest request) {
	    VacancyResponse vacancyResponse = new VacancyResponse();

	    
	    Optional<Vacancy> optionalVacancy = vacancyRepo.findById(id);

	    if (!optionalVacancy.isPresent()) { 
	        vacancyResponse.setStatus(ResponseCode.VACANCY_NOT_UPDATED.getStatus());
	        vacancyResponse.setMessage("Vacancy not found with ID: " + id);
	        return vacancyResponse;
	    }

	    Vacancy vacancy = optionalVacancy.get();
	    vacancy.setJobId(request.getJobId());
	    vacancy.setVacancyName(request.getVacancyName());
	    vacancy.setJobTitle(request.getJobTitle());
	    vacancy.setNumberOfPosition(request.getNumberOfPosition());
	    vacancy.setCostCenter(request.getCostCenter());
	    vacancy.setDescription(request.getDescription());
	    vacancy.setHiringManager(request.getHiringManager());
	    vacancy.setStatus(request.getStatus());
	    vacancy.setTenant(request.getTenant());
	    vacancy.setVendorName(request.getVendorName());


	    vacancyRepo.save(vacancy);

	    
	    vacancyResponse.setStatus(ResponseCode.VACANCY_UPDATED.getStatus());
	    vacancyResponse.setMessage("Vacancy updated successfully");

	    return vacancyResponse;
	}

	public VacancyResponse deleteVacancy(Long id) {
		
		VacancyResponse vacancyResponse = new VacancyResponse();
	    Optional<Vacancy> optionalVacancy = vacancyRepo.findById(id);
	    
	    if(optionalVacancy.isEmpty()) {
	    	vacancyResponse.setStatus(ResponseCode.NOT_DELETE_VACANCY.getStatus());
	        vacancyResponse.setMessage("Vacancy not found with ID: " + id);
	        return vacancyResponse;
	    }
	 
		vacancyRepo.deleteById(id);
		vacancyResponse.setStatus(ResponseCode.DELETE_VACANCY.getStatus());
	    vacancyResponse.setMessage("Vacancy deleted successfully with ID: " + id);
	    return vacancyResponse;
		
		
	}
}
