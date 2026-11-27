package tn.esprit.autoloc.autolocapi.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.autolocapi.domain.Reservation;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {

    List<Reservation> findByDateDebutAfter(LocalDate date);

    @Query("SELECT r FROM Reservation r WHERE r.client.idClient = :idClient")
    List<Reservation> getReservationsByClient(@Param("idClient") Long idClient);

    @Query("SELECT c.idClient, c.nom, c.prenom, COUNT(r) FROM Reservation r JOIN r.client c GROUP BY c.idClient, c.nom, c.prenom")
    List<Object[]> countReservationsByClient();
}