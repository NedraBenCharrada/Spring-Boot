package tn.esprit.autoloc.autolocapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import tn.esprit.autoloc.autolocapi.DTO.ClientDto;
import tn.esprit.autoloc.autolocapi.domain.Client;
import tn.esprit.autoloc.autolocapi.repository.ClientRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements IclientService {

    private final ClientRepository clientRepository;
    private final IClientMapper mapper;

    @Override
    public List<ClientDto> retrieveAllClients() {
        return mapper.toDtoList((List<Client>) clientRepository.findAll());
    }

    @Override
    public ClientDto addClient(ClientDto c) {
        Client saved = clientRepository.save(mapper.toEntity(c));
        return mapper.toDto(saved);
    }

    @Override
    public ClientDto updateClient(ClientDto c) {
        Client saved = clientRepository.save(mapper.toEntity(c));
        return mapper.toDto(saved);
    }

    @Override
    public ClientDto retrieveClient(Long idClient) {
        Client client = clientRepository.findById(idClient).orElse(null);
        return mapper.toDto(client);
    }

    @Override
    public void removeClient(Long idClient) {
        clientRepository.deleteById(idClient);
    }

    @Override
    public List<ClientDto> addClients(List<ClientDto> clients) {
        List<Client> saved = (List<Client>) clientRepository.saveAll(mapper.toEntityList(clients));
        return mapper.toDtoList(saved);
    }

    @Override
    public ClientDto retrieveClientDto(Long idClient) {
        Client client = clientRepository.findById(idClient)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Client introuvable : " + idClient));
        return mapper.toDto(client);
    }
}