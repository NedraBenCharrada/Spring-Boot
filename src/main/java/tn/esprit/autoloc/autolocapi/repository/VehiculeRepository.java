package tn.esprit.autoloc.autolocapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.autolocapi.domain.CategorieVehicule;
import tn.esprit.autoloc.autolocapi.domain.StatutVehicule;
import tn.esprit.autoloc.autolocapi.domain.Vehicule;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface VehiculeRepository extends CrudRepository<Vehicule, Long> {

    List<Vehicule> findByMarque(String marque);

    List<Vehicule> findByCategorie(CategorieVehicule categorie);

    List<Vehicule> findByStatut(StatutVehicule statut);

    List<Vehicule> findByMarqueContainingIgnoreCase(String chaine);

    List<Vehicule> findByTarifJournalierGreaterThan(BigDecimal tarif);

    List<Vehicule> findByMarqueAndStatut(String marque, StatutVehicule statut);
}