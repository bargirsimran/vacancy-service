package org.dnyanyog.service;

import org.dnyanyog.dto.AddVacancyRequest;
import org.dnyanyog.dto.AddVacancyResponse;
import org.springframework.stereotype.Component;

@Component
public interface AddVacancyService {

	public AddVacancyResponse addVacancy(AddVacancyRequest addVacancyBody);
		

}
