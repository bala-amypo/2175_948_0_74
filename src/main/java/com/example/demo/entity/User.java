package com.example.demo.entity;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY);
    private int id;

    private String name;

    @Column(unique = true, nullable = false)
    private String email;
    private String password;
    private String role;

    public int getId(){
        return id;
    }

    public void setId()

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }

    public String getRole(){
        return role;
    }




}