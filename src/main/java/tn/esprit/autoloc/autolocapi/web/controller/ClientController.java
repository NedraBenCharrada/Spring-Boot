package tn.esprit.autoloc.autolocapi.web.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autolocapi.DTO.ClientDto;
import tn.esprit.autoloc.autolocapi.service.IclientService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/Client")
public class ClientController {

    private final IclientService clientService;

    @PostMapping("/AddClient")
    public ClientDto addClient(@Valid @RequestBody ClientDto c) {
        return clientService.addClient(c);
    }

    @GetMapping("/GetClient")
    public List<ClientDto> getClients() {
        return clientService.retrieveAllClients();
    }

    @GetMapping("/GetClient/{id}")
    public ClientDto getClient(@PathVariable Long id) {
        return clientService.retrieveClient(id);
    }

    @GetMapping("/GetClientDto/{id}")
    public ClientDto getClientDto(@PathVariable Long id) {
        return clientService.retrieveClientDto(id);
    }

    @DeleteMapping("/DeleteClient/{id}")
    public void deleteClient(@PathVariable Long id) {
        clientService.removeClient(id);
    }

    @PostMapping("/addAllClient")
    public List<ClientDto> addAllClient(@Valid @RequestBody List<ClientDto> clients) {
        return clientService.addClients(clients);
    }
}