package com.GreenConnect.GreenConnect;
import jakarta.persistence.*;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private Double quantity;
    private Double pricePerUnit;
    private String unit;

    @ManyToOne
    private User owner;

    private String location;

    // Getters and setters
}

