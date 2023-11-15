package com.qlvt.domain.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity()
public class VatTu {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String tenVatTu;

  private Integer soLuongTon;

  private Float gia;

  private String moTa;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTenVatTu() {
    return tenVatTu;
  }

  public void setTenVatTu(String tenVatTu) {
    this.tenVatTu = tenVatTu;
  }

  public Integer getSoLuongTon() {
    return soLuongTon;
  }

  public void setSoLuongTon(Integer soLuongTon) {
    this.soLuongTon = soLuongTon;
  }

  public Float getGia() {
    return gia;
  }

  public void setGia(Float gia) {
    this.gia = gia;
  }

  public String getMoTa() {
    return moTa;
  }

  public void setMoTa(String moTa) {
    this.moTa = moTa;
  }

}
