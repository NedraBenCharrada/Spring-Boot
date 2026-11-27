package tn.esprit.autoloc.autolocapi.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
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

    @Query("SELECT v FROM Vehicule v WHERE v.agence.idAgence = :idAgence")
    List<Vehicule> getVehiculesByAgence(@Param("idAgence") Long idAgence);

    @Query("SELECT a.idAgence, a.nom, COUNT(v) FROM Vehicule v JOIN v.agence a GROUP BY a.idAgence, a.nom")
    List<Object[]> countVehiculesByAgence();
}