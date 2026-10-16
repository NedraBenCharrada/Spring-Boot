package tn.esprit.autoloc.autolocapi.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autolocapi.domain.Vehicule;
import tn.esprit.autoloc.autolocapi.service.IVehiculeService;

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
}