package com.parking_managment.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long personId;
    private String genre;
    private String nom;
    private String prenom;
    @OneToMany
    private List<Car> cars= new ArrayList<Car>();
    @OneToOne(cascade = CascadeType.ALL)
    private Card card;
    public Person() {
    }

    public Person(Long personId, String genre, String nom, String prenom, List<Car> cars, Card card) {
        this.personId = personId;
        this.genre = genre;
        this.nom = nom;
        this.prenom = prenom;
        this.cars = cars;
        this.card = card;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
