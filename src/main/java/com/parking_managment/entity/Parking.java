package com.parking_managment.entity;

import jakarta.persistence.*;

@Entity
public class Parking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long parkingId;
    @Column(name = "nombre_place")
    private int nombrePlace;

    public Parking() {
    }

    public Parking(Long parkingId, int nombrePlace) {
        this.parkingId = parkingId;
        this.nombrePlace = nombrePlace;
    }

    public Long getParkingId() {
        return parkingId;
    }

    public void setParkingId(Long parkingId) {
        this.parkingId = parkingId;
    }

    public int getNombrePlace() {
        return nombrePlace;
    }

    public void setNombrePlace(int nombrePlace) {
        this.nombrePlace = nombrePlace;
    }
}
