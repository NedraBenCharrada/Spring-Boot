package tn.esprit.autoloc.autolocapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.autolocapi.domain.Equipement;

import java.util.Optional;

@Repository
public interface EquipementRepository extends CrudRepository<Equipement, Long> {

}