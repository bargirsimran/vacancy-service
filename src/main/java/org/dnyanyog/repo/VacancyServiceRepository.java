package org.dnyanyog.repo;

import java.util.List;

import org.dnyanyog.entity.Vacancy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component

public interface VacancyServiceRepository extends JpaRepository<Vacancy, Long> {
	
	List<Vacancy> findByVacancyId(Long id);
	List<Vacancy> findByJobId(Long jobId);
	

}
