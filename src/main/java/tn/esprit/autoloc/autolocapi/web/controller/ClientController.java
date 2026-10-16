package tn.esprit.autoloc.autolocapi.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autolocapi.domain.Client;
import tn.esprit.autoloc.autolocapi.service.IclientService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/Client")
public class ClientController {

    final IclientService iclient;

    @PostMapping("/AddClient")
    public Client AddClient (@RequestBody Client c){return iclient.addClient(c);}

    @GetMapping("/GetClient")
    public List<Client> getclients(){
        return iclient.retrieveAllClients();
    }
    @DeleteMapping ("/DeleteClient/{id}")
    public void DeleteClient(@PathVariable long id){
        iclient.removeClient(id);
    }
    @PostMapping("/addAllClient")
    public List<Client> addAllClient(@RequestBody List<Client> ListeClient){
        return iclient.addClients(ListeClient);
    }
}