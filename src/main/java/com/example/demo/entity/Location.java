package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "locations")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Double latitude;

    @Column(nullable = false)
    private Double longtitude;

    public Location() {}

    public Location(String name, Double latitude , Double longtitude ){
        this.name = name;
        this.latitude = latitude;
        this.longtitude = longtitude;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Double getLat(){
        return latitude;
    }

    public void setLat(Double latitude){
        this.latitude = latitude;
    }

    public Double getLon(){
        return longtitude;
    }

    public void setLon(Double longtitude){
        this.longtitude = longtitude;
    }

}