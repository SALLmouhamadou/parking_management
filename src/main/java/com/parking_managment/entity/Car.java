package com.parking_managment.entity;

import jakarta.persistence.*;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "card_id")
    private Long carId;
    private String immatriculation;
    private String marque;
    private String modele;
    @ManyToOne
    private Person person;
    public Car(){

    }
    public Car(Long carId, String immatriculation, String marque, String modele) {
        this.carId = carId;
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.modele = modele;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }
}
