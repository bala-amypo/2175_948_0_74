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

   @Column(nullable = false)
   






}