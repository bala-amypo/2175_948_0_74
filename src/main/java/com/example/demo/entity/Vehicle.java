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
    this
   }








}