package com.parking_managment.dto;

import com.parking_managment.entity.Car;
import com.parking_managment.entity.Card;
import java.util.ArrayList;
import java.util.List;

public class Person {
    private Long personId;
    private String genre;
    private String nom;
    private String prenom;
    private List<Car> cars= new ArrayList<Car>();
    private Card card;

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
