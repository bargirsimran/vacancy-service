package org.dnyanyog.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.dnyanyog.dto.AddVacancyRequest;
import org.dnyanyog.dto.AddVacancyResponse;
import org.dnyanyog.service.AddVacancyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@RestController
@Component
public class VacancyServiceController {
	
	@Autowired
	private AddVacancyService addVacancyService;
	
	@PostMapping(path="api/user/AddVacancy")
	public AddVacancyResponse addVacancy(@RequestBody AddVacancyRequest addVacancyBody) {
		return addVacancyService.addVacancy(addVacancyBody);
	}
	
	
	
	

}
