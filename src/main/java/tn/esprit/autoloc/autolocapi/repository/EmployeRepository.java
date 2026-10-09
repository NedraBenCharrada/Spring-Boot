package tn.esprit.autoloc.autolocapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.autolocapi.domain.Employe;

import java.util.Optional;

@Repository
public interface EmployeRepository extends CrudRepository<Employe, Long> {

}