package com.example.argriculture.toil.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Table(name = "farm")
@NoArgsConstructor

public class Farm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String territory;

    @Column(nullable = false)
    private String weather;

    @Column(nullable = false)
    private String soil;

    @Column(nullable = false)
    private String crop;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String password;

    @Column
    @Email
    private String email;

    private String address;
    private String bug;



}
