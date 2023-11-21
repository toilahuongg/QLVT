package com.qlvt.domain.Entities;

import jakarta.persistence.*;

@Entity
@Table(name="VatTu_ChiNhanh", schema = "dbo", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"ChiNhanh_ID", "VatTu_ID"}) })
public class ProductBranch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name="ChiNhanh_ID")
    private Branch branch;
    @ManyToOne
    @JoinColumn(name="VatTu_ID")
    private Product product;
    @Column(name="so_luong")
    private Long quantity;
}

