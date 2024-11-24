package org.dnyanyog.service;

import org.dnyanyog.dto.VacancyRequest;
import org.dnyanyog.dto.VacancyResponse;

public interface VacancyService {
	
	public VacancyResponse addVacancy(VacancyRequest request) throws Exception;
	
	public VacancyResponse updateVacancy(Long id, VacancyRequest request);
	
	public VacancyResponse deleteVacancy(Long id);
	
	public VacancyResponse searchVacancyByid(Long id);
	
	public  VacancyResponse getAllVacancies();

}
