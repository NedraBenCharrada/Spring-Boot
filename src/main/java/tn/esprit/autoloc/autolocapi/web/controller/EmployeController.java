package tn.esprit.autoloc.autolocapi.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autolocapi.domain.Employe;
import tn.esprit.autoloc.autolocapi.service.IEmployeService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/Employe")
public class EmployeController {

    private final IEmployeService employeService;

    @PostMapping("/AddEmploye")
    public Employe addEmploye(@RequestBody Employe e) {
        return employeService.addEmploye(e);
    }

    @GetMapping("/GetEmploye")
    public List<Employe> getEmployes() {
        return employeService.retrieveAllEmployes();
    }

    @DeleteMapping("/DeleteEmploye/{id}")
    public void deleteEmploye(@PathVariable Long id) {
        employeService.removeEmploye(id);
    }

    @PostMapping("/addAllEmploye")
    public List<Employe> addAllEmploye(@RequestBody List<Employe> employes) {
        return employeService.addEmployes(employes);
    }

    @PutMapping("/desaffecterEmploye/{idEmploye}")
    public Employe desaffecterEmploye(@PathVariable Long idEmploye) {
        return employeService.desaffecterEmploye(idEmploye);
    }

    @PutMapping("/affecterEmploye/{idEmploye}/{idAgence}")
    public Employe affecterEmploye(@PathVariable Long idEmploye, @PathVariable Long idAgence) {
        return employeService.affecterEmploye(idEmploye, idAgence);
    }
}