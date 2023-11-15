package com.qlvt.domain.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity()
public class VatTuChiNhanh {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private Integer soLuong;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "VatTu_ID")
  private VatTu  vatTu;

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

  public VatTu getVatTu() {
    return vatTu;
  }

  public void setVatTu(VatTu vatTu) {
    this.vatTu = vatTu;
  }

  public ChiNhanh getChiNhanh() {
    return chiNhanh;
  }

  public void setChiNhanh(ChiNhanh chiNhanh) {
    this.chiNhanh = chiNhanh;
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ChiNhanh_ID")
  private ChiNhanh  chiNhanh;

}
