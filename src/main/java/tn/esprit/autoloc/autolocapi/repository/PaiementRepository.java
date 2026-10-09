package tn.esprit.autoloc.autolocapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.autolocapi.domain.Paiement;

import java.util.Optional;

@Repository
public interface PaiementRepository extends CrudRepository<Paiement, Long> {

}