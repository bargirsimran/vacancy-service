package org.dnyanyog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import org.apache.coyote.Response;
import org.dnyanyog.common.ResponseCode;
import org.dnyanyog.dto.AddVacancyRequest;
import org.dnyanyog.dto.AddVacancyResponse;
import org.dnyanyog.entity.Vacancy;
import org.dnyanyog.repo.VacancyServiceRepository;

@Service
public class AddVacancyService {

	@Autowired
	private VacancyServiceRepository vacancyRepo;

//	@Autowired
//	private AddVacancyResponse vacancyResponse;
//	

	public AddVacancyResponse addVacancy(AddVacancyRequest request) {
		// Service logic for adding vacancy

		AddVacancyResponse vacancyResponse = new AddVacancyResponse();
		// Optional<Vacancy> optionalVacancy = vacancyRepo.findById(request.getId());
//    	List<Vacancy> optionalVacancy= vacancyRepo.findById(request.getId());
//    	List<Vacancy> optionalVacancy1=vacancyRepo.findByJobId(request.getJobId());
		List<Vacancy> optionalVacancy = vacancyRepo.findByJobId(request.getId());
		// List<Vacancy>
		// optionalVacancy=vacancyRepo.findByVacancyName(request.getVacancyName());

		if (!optionalVacancy.isEmpty()) {
			vacancyResponse.setStatus(ResponseCode.VACANCY_FAILED.getStatus());
			vacancyResponse.setMessage(ResponseCode.VACANCY_FAILED.getMessage());
			return vacancyResponse;
		}

		Vacancy vacancy = new Vacancy();
//		vacancy.setId(request.getId());
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
}
