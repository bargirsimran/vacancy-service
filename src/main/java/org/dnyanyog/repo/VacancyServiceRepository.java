package org.dnyanyog.repo;

import java.util.List;
import java.util.Optional;

import org.dnyanyog.entity.Vacancy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface VacancyServiceRepository extends JpaRepository<Vacancy, Long> {


	List<Vacancy> findByJobId(Long jobId);

	// List<Vacancy> findByVacancyName(String vacancyName);

}
