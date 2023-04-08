package com.GreenConnect.GreenConnect;
import jakarta.persistence.*;

@Entity
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Item item;

    @ManyToOne
    private User requester;

    @Enumerated(EnumType.STRING)
    private RequestStatus status;

    // Getters and setters
}

