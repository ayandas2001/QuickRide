package com.springboot.project.uber.QuickRide.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Wallet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double balance;
    @OneToOne(fetch = FetchType.LAZY)
    private User user;

    @OneToOne(mappedBy = "wallet",fetch = FetchType.LAZY)
    private List<WalletTransaction> transactions;


}
