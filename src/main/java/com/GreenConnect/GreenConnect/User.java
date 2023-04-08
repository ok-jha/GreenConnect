package com.GreenConnect.GreenConnect;

import jakarta.persistence.*;
import java.util.List;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false, unique = true, length = 100)
    private String email;

    @Column(nullable = false)
    private String password;

//    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Item> items;
//
//    @OneToMany(mappedBy = "consumer", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Request> requests;

    @Column(nullable = false, length = 15)
    private String phoneNumber;

    @Column(nullable = false, length = 255)
    private String address;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserRole role;

    @Column(nullable = false)
    private LocalDateTime creationDate;

    @Column(nullable = false)
    private LocalDateTime lastModifiedDate;

    // constructors, getters, and setters
}

