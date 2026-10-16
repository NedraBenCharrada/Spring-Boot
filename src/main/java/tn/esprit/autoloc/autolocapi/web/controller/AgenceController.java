package tn.esprit.autoloc.autolocapi.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autolocapi.domain.Agence;
import tn.esprit.autoloc.autolocapi.service.IAgenceService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/Agence")
public class AgenceController {

    private final IAgenceService agenceService;

    @PostMapping("/AddAgence")
    public Agence addAgence(@RequestBody Agence a) {
        return agenceService.addAgence(a);
    }

    @GetMapping("/GetAgence")
    public List<Agence> getAgences() {
        return agenceService.retrieveAllAgences();
    }

    @DeleteMapping("/DeleteAgence/{id}")
    public void deleteAgence(@PathVariable Long id) {
        agenceService.removeAgence(id);
    }

    @PostMapping("/addAllAgence")
    public List<Agence> addAllAgence(@RequestBody List<Agence> agences) {
        return agenceService.addAgences(agences);
    }
}