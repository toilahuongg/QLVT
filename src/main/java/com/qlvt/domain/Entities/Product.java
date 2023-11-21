package com.qlvt.domain.Entities;

import jakarta.persistence.*;

@Entity
@Table(name="VatTu", schema = "dbo")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="ten_vat_tu",columnDefinition = "NVARCHAR(MAX) COLLATE SQL_Latin1_General_CP1_CI_AS")
    private String name;
    @Column(name="so_luong_ton")
    private Long quantity;
    @Column(name="gia")
    private Double price;
    @Column(name="mo_ta",columnDefinition = "NVARCHAR(MAX) COLLATE SQL_Latin1_General_CP1_CI_AS")
    private String description;

}
