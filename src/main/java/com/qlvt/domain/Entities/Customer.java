package com.qlvt.domain.Entities;

import jakarta.persistence.*;
@Entity
@Table(name = "[KhachHang]", schema = "[dbo]")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="ten_kh",columnDefinition = "NVARCHAR(MAX) COLLATE SQL_Latin1_General_CP1_CI_AS")
    private String name;
    @Column(name="so_dien_thoai")
    private String phone;
    @Column(name="email")
    private String email;
    @Column(name="dia_chi",columnDefinition = "NVARCHAR(MAX) COLLATE SQL_Latin1_General_CP1_CI_AS")
    private String address;
}
