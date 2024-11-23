package org.dnyanyog.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.dnyanyog.dto.VacancyRequest;
import org.dnyanyog.dto.VacancyResponse;
import org.dnyanyog.service.VacancyService;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class VacancyServiceController {

	@Autowired
	private VacancyService addVacancyService;

	@PostMapping(path = "api/user/AddVacancy")
	public VacancyResponse addVacancy(@RequestBody VacancyRequest addVacancyBody) {
		return addVacancyService.addVacancy(addVacancyBody);
	}
	
	@PostMapping(path="api/user/UpdateVacancy/{id}")
		public VacancyResponse updateVacancy(@PathVariable Long id, @RequestBody VacancyRequest updateVacancyBody) {
			return addVacancyService.updateVacancy(id, updateVacancyBody);
		}
	
	@DeleteMapping(path="api/user/DeleteVacancy/{id}")
	public VacancyResponse deleteVacancy(@PathVariable Long id) {
		return addVacancyService.deleteVacancy(id);
	}
	

    @GetMapping(path = "api/user/GetVacancy/{id}")
    public VacancyResponse getVacancyById(@PathVariable Long id) {
        return addVacancyService.searchVacancyByid(id);
    }

    @GetMapping(path = "api/user/GetAllVacancies")
    public VacancyResponse getAllVacancies() {
        return addVacancyService.getAllVacancies();
    }


}
