package com.qlvt.domain.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity()
public class ChiTietPhieuXuat {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private Integer soLuong;
  private Float giaXuat;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "VatTu_ID")
  private VatTu vatTu;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "PhieuXuat_ID")
  private PhieuXuat phieuXuat;

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

  public Float getGiaXuat() {
    return giaXuat;
  }

  public void setGiaXuat(Float giaXuat) {
    this.giaXuat = giaXuat;
  }

  public VatTu getVatTu() {
    return vatTu;
  }

  public void setVatTu(VatTu vatTu) {
    this.vatTu = vatTu;
  }

  public PhieuXuat getPhieuXuat() {
    return phieuXuat;
  }

  public void setPhieuXuat(PhieuXuat phieuXuat) {
    this.phieuXuat = phieuXuat;
  }

}
