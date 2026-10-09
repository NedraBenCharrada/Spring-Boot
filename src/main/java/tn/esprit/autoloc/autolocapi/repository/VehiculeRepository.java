package tn.esprit.autoloc.autolocapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.autolocapi.domain.Vehicule;

import java.util.Optional;

@Repository
public interface VehiculeRepository extends CrudRepository<Vehicule, Long> {

}