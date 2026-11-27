package tn.esprit.autoloc.autolocapi.service;

import tn.esprit.autoloc.autolocapi.DTO.ClientDto;

import java.util.List;

public interface IclientService {
    List<ClientDto> retrieveAllClients();
    ClientDto addClient(ClientDto c);
    ClientDto updateClient(ClientDto c);
    ClientDto retrieveClient(Long idClient);
    void removeClient(Long idClient);
    List<ClientDto> addClients(List<ClientDto> clients);

    ClientDto retrieveClientDto(Long idClient);
}