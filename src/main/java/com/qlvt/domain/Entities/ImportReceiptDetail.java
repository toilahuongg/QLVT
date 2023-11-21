package com.qlvt.domain.Entities;

import jakarta.persistence.*;

@Entity
@Table(name="ChiTietPhieuNhap", schema = "dbo")
public class ImportReceiptDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name="VatTu_ID")
    private Product product;
    @ManyToOne
    @JoinColumn(name="PhieuNhap_ID")
    private ImportReceipt importReceipt;
    @Column(name="so_luong")
    private Long quantity;
    @Column(name="gia_nhap")
    private Double price;
}
