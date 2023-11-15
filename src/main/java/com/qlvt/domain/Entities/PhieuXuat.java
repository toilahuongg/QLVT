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
public class PhieuXuat {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private Date ngayXuat;

  private String moTa;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "NhanVien_ID")
  private TaiKhoan nhanVien;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "KhachHang_ID")
  private KhachHang khachHang;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Date getNgayXuat() {
    return ngayXuat;
  }

  public void setNgayXuat(Date ngayXuat) {
    this.ngayXuat = ngayXuat;
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

  public KhachHang getKhachHang() {
    return khachHang;
  }

  public void setKhachHang(KhachHang khachHang) {
    this.khachHang = khachHang;
  }
}
