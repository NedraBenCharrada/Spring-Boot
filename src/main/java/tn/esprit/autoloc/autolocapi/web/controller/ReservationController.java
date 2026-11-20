package tn.esprit.autoloc.autolocapi.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autolocapi.domain.Reservation;
import tn.esprit.autoloc.autolocapi.service.IReservationService;

import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/Reservation")
public class ReservationController {

    private final IReservationService reservationService;

    @PostMapping("/AddReservation")
    public Reservation addReservation(@RequestBody Reservation r) {
        return reservationService.addReservation(r);
    }

    @GetMapping("/GetReservation")
    public List<Reservation> getReservations() {
        return reservationService.retrieveAllReservations();
    }

    @DeleteMapping("/DeleteReservation/{id}")
    public void deleteReservation(@PathVariable Long id) {
        reservationService.removeReservation(id);
    }

    @PostMapping("/addAllReservation")
    public List<Reservation> addAllReservation(@RequestBody List<Reservation> reservations) {
        return reservationService.addReservations(reservations);
    }


    @GetMapping("/GetReservationDebutApres/{date}")
    public List<Reservation> getReservationsDebutApres(
            @PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        return reservationService.retrieveReservationsDebutApres(date);
    }
}