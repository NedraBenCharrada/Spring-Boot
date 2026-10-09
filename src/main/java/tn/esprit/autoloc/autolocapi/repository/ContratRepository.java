package tn.esprit.autoloc.autolocapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.autolocapi.domain.Contrat;

import java.util.Optional;

@Repository
public interface ContratRepository extends CrudRepository<Contrat, Long> {

}