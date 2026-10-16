package tn.esprit.autoloc.autolocapi.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "client")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;

    @Column(nullable = false, length = 50)
    private String nom;

    @Column(nullable = false, length = 50)
    private String prenom;

    @Column(nullable = false, unique = true, length = 100)
    private String email;

    @Column(length = 20)
    private String telephone;

    @Column(nullable = false, unique = true, length = 30)
    private String numPermis;

    @Column(nullable = false)
    private LocalDate dateInscription;

    @OneToMany(mappedBy = "client")
    private List<Reservation> reservations = new ArrayList<>();

    public Long getIdClient() {
        return idClient;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getNumPermis() {
        return numPermis;
    }

    public LocalDate getDateInscription() {
        return dateInscription;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumPermis(String numPermis) {
        this.numPermis = numPermis;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setDateInscription(LocalDate dateInscription) {
        this.dateInscription = dateInscription;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}