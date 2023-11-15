package com.qlvt.domain.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity()
public class NhaCungCap {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String tenNhaCungCap;

  private String soDienThoai;

  private String email;

  private String diaChi;

  public void setId(Long id) {
    this.id = id;
  }

  public String getTenNhaCungCap() {
    return tenNhaCungCap;
  }

  public void setTenNhaCungCap(String tenNhaCungCap) {
    this.tenNhaCungCap = tenNhaCungCap;
  }

  public String getSoDienThoai() {
    return soDienThoai;
  }

  public void setSoDienThoai(String soDienThoai) {
    this.soDienThoai = soDienThoai;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getDiaChi() {
    return diaChi;
  }

  public void setDiaChi(String diaChi) {
    this.diaChi = diaChi;
  }

  public Long getId() {
    return id;
  }
}
