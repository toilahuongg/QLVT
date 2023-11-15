package com.qlvt.domain.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity()
public class ChiTietPhieuNhap {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private Integer soLuong;
  private Float giaNhap;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "VatTu_ID")
  private VatTu vatTu;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "PhieuNhap_ID")
  private PhieuNhap phieuNhap;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Integer getSoLuong() {
    return soLuong;
  }

  public void setSoLuong(Integer soLuong) {
    this.soLuong = soLuong;
  }

  public Float getGiaNhap() {
    return giaNhap;
  }

  public void setGiaNhap(Float giaNhap) {
    this.giaNhap = giaNhap;
  }

  public VatTu getVatTu() {
    return vatTu;
  }

  public void setVatTu(VatTu vatTu) {
    this.vatTu = vatTu;
  }

  public PhieuNhap getPhieuNhap() {
    return phieuNhap;
  }

  public void setPhieuNhap(PhieuNhap phieuNhap) {
    this.phieuNhap = phieuNhap;
  }
}
