package tn.esprit.autoloc.autolocapi.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autolocapi.domain.CategorieVehicule;
import tn.esprit.autoloc.autolocapi.domain.Vehicule;
import tn.esprit.autoloc.autolocapi.service.IVehiculeService;

import java.math.BigDecimal;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/Vehicule")
public class VehiculeController {

    private final IVehiculeService vehiculeService;

    @PostMapping("/AddVehicule")
    public Vehicule addVehicule(@RequestBody Vehicule v) {
        return vehiculeService.addVehicule(v);
    }

    @GetMapping("/GetVehicule")
    public List<Vehicule> getVehicules() {
        return vehiculeService.retrieveAllVehicules();
    }

    @DeleteMapping("/DeleteVehicule/{id}")
    public void deleteVehicule(@PathVariable Long id) {
        vehiculeService.removeVehicule(id);
    }

    @PostMapping("/addAllVehicule")
    public List<Vehicule> addAllVehicule(@RequestBody List<Vehicule> vehicules) {
        return vehiculeService.addVehicules(vehicules);
    }

    @PutMapping("/affecterVehicule/{idVehicule}/{idAgence}")
    public Vehicule affecterVehicule(@PathVariable Long idVehicule, @PathVariable Long idAgence) {
        return vehiculeService.affecterVehicule(idVehicule, idAgence);
    }

    @PutMapping("/affecterEquipement/{idVehicule}/{idEquipement}")
    public Vehicule affecterEquipement(@PathVariable Long idVehicule, @PathVariable Long idEquipement) {
        return vehiculeService.affecterEquipement(idVehicule, idEquipement);
    }

    @PutMapping("/desaffecterEquipement/{idVehicule}/{idEquipement}")
    public Vehicule desaffecterEquipement(@PathVariable Long idVehicule, @PathVariable Long idEquipement) {
        return vehiculeService.desaffecterEquipement(idVehicule, idEquipement);
    }

    @GetMapping("/GetVehiculeByMarque/{marque}")
    public List<Vehicule> getVehiculesByMarque(@PathVariable String marque) {
        return vehiculeService.retrieveVehiculesByMarque(marque);
    }

    @GetMapping("/GetVehiculeByCategorie/{categorie}")
    public List<Vehicule> getVehiculesByCategorie(@PathVariable CategorieVehicule categorie) {
        return vehiculeService.retrieveVehiculesByCategorie(categorie);
    }

    @GetMapping("/GetVehiculeDisponible")
    public List<Vehicule> getVehiculesDisponibles() {
        return vehiculeService.retrieveVehiculesDisponibles();
    }

    @GetMapping("/GetVehiculeByMarqueContaining/{chaine}")
    public List<Vehicule> getVehiculesByMarqueContaining(@PathVariable String chaine) {
        return vehiculeService.retrieveVehiculesByMarqueContaining(chaine);
    }

    @GetMapping("/GetVehiculeTarifSuperieur/{tarif}")
    public List<Vehicule> getVehiculesTarifSuperieur(@PathVariable BigDecimal tarif) {
        return vehiculeService.retrieveVehiculesTarifSuperieur(tarif);
    }

    @GetMapping("/GetVehiculeDisponibleByMarque/{marque}")
    public List<Vehicule> getVehiculesDisponiblesByMarque(@PathVariable String marque) {
        return vehiculeService.retrieveVehiculesDisponiblesByMarque(marque);
    }

    @GetMapping("/GetVehiculeByAgence/{idAgence}")
    public List<Vehicule> getVehiculesByAgence(@PathVariable Long idAgence) {
        return vehiculeService.getVehiculesByAgence(idAgence);
    }

    @GetMapping("/CountVehiculeByAgence")
    public List<Object[]> countVehiculesByAgence() {
        return vehiculeService.countVehiculesByAgence();
    }
}