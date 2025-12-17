package com.example.demo.entity;

@Entity
@Table(name = "vehicle")
public class Vehicle {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @ManyToOne
   @JoinColumn(name = "id" , nullable = false)
   private User user;

   @Column(name="vehicle_number",nullable = false, unique = true)
   private String vehicleNumber;

   @Column(nullable=false)
   private Double capacityKg;

   @Column(nullable = false)
   private Double fuelEfficiency;

   public Vehicle() {}

   public Vehicle(User user, String vehicleNumber, Double capacityKg, Double fuelEfficiency){
    this.user = user;
    this.vehicleNumber = vehicleNumber;
    this.capacityKg = capacityKg;
    this.fuelEfficiency = fuelEfficiency;
   }

   public Long getId(){
    return id;
   }

   public void setId(Long id){
    this.id = id;
   }

   public User getUser(){
    return user;
   }

   public void setUser(User user){
    this.user = user;
   }

   public String getVehicleNumber(){
    return vehicleNumber;
   }

   public void setVehicleNumber(String vehicleNumber){
    this.vehicleNumber = vehicleNumber;
   }

   public Double getCapacityKg(){
    return capacityKg;
   }

   public void setCapacityKg(Double capacityKg){
    this.capacityKg = capacityKg;
   }

   public get

   








}