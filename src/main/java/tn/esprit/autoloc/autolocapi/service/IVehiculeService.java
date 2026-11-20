package tn.esprit.autoloc.autolocapi.service;

import tn.esprit.autoloc.autolocapi.domain.CategorieVehicule;
import tn.esprit.autoloc.autolocapi.domain.Vehicule;

import java.math.BigDecimal;
import java.util.List;

public interface IVehiculeService {
    List<Vehicule> retrieveAllVehicules();
    Vehicule addVehicule(Vehicule v);
    Vehicule updateVehicule(Vehicule v);
    Vehicule retrieveVehicule(Long idVehicule);
    void removeVehicule(Long idVehicule);
    List<Vehicule> addVehicules(List<Vehicule> vehicules);

    Vehicule affecterVehicule(Long idVehicule, Long idAgence);
    Vehicule affecterEquipement(Long idVehicule, Long idEquipement);
    Vehicule desaffecterEquipement(Long idVehicule, Long idEquipement);

    List<Vehicule> retrieveVehiculesByMarque(String marque);
    List<Vehicule> retrieveVehiculesByCategorie(CategorieVehicule categorie);
    List<Vehicule> retrieveVehiculesDisponibles();
    List<Vehicule> retrieveVehiculesByMarqueContaining(String chaine);
    List<Vehicule> retrieveVehiculesTarifSuperieur(BigDecimal tarif);
    List<Vehicule> retrieveVehiculesDisponiblesByMarque(String marque);
}