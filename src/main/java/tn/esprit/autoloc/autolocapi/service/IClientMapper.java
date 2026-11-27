package tn.esprit.autoloc.autolocapi.service;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import tn.esprit.autoloc.autolocapi.DTO.ClientDto;
import tn.esprit.autoloc.autolocapi.domain.Client;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IClientMapper {

    ClientDto toDto(Client client);

    @Mapping(target = "idClient", ignore = true)
    @Mapping(target = "telephone", ignore = true)
    @Mapping(target = "numPermis", ignore = true)
    @Mapping(target = "reservations", ignore = true)
    Client toEntity(ClientDto dto);

    List<ClientDto> toDtoList(List<Client> clients);

    List<Client> toEntityList(List<ClientDto> dtos);
    // MapStruct génère automatiquement l'implémentation !
}