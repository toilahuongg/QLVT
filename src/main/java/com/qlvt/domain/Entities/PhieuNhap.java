package com.qlvt.domain.Entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity()
public class PhieuNhap {
    @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private Date ngayNhap;

  private String moTa;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "NhanVien_ID")
  private TaiKhoan nhanVien;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "NhaCungCap_ID")
  private NhaCungCap nhaCungCap;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Date getNgayNhap() {
    return ngayNhap;
  }

  public void setNgayNhap(Date ngayNhap) {
    this.ngayNhap = ngayNhap;
  }

  public String getMoTa() {
    return moTa;
  }

  public void setMoTa(String moTa) {
    this.moTa = moTa;
  }

  public TaiKhoan getNhanVien() {
    return nhanVien;
  }

  public void setNhanVien(TaiKhoan nhanVien) {
    this.nhanVien = nhanVien;
  }

  public NhaCungCap getNhaCungCap() {
    return nhaCungCap;
  }

  public void setNhaCungCap(NhaCungCap nhaCungCap) {
    this.nhaCungCap = nhaCungCap;
  }

  
}
