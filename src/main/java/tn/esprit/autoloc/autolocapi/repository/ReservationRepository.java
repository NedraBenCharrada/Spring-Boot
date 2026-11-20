package tn.esprit.autoloc.autolocapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.autolocapi.domain.Reservation;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {

    List<Reservation> findByDateDebutAfter(LocalDate date);
}