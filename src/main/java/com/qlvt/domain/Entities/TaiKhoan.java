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
public class TaiKhoan {
  enum TrangThai {
    ACTIVE,
    BLOCKED
  }

  enum ChucVu {
    NhanVien,
    QuanLy
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String taiKhoan;

  private String matKhau;

  private String hoTen;

  private String soDienThoai;

  private String diaChi;

  private Date ngaySinh;

  private TrangThai trangThai;

  private ChucVu chucVu;
  
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "ChiNhanh_ID")
  private ChiNhanh  chiNhanh;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTaiKhoan() {
    return taiKhoan;
  }

  public void setTaiKhoan(String taiKhoan) {
    this.taiKhoan = taiKhoan;
  }

  public String getMatKhau() {
    return matKhau;
  }

  public void setMatKhau(String matKhau) {
    this.matKhau = matKhau;
  }

  public String getHoTen() {
    return hoTen;
  }

  public void setHoTen(String hoTen) {
    this.hoTen = hoTen;
  }

  public String getSoDienThoai() {
    return soDienThoai;
  }

  public void setSoDienThoai(String soDienThoai) {
    this.soDienThoai = soDienThoai;
  }

  public String getDiaChi() {
    return diaChi;
  }

  public void setDiaChi(String diaChi) {
    this.diaChi = diaChi;
  }

  public Date getNgaySinh() {
    return ngaySinh;
  }

  public void setNgaySinh(Date ngaySinh) {
    this.ngaySinh = ngaySinh;
  }

  public TrangThai getTrangThai() {
    return trangThai;
  }

  public void setTrangThai(TrangThai trangThai) {
    this.trangThai = trangThai;
  }

  public ChucVu getChucVu() {
    return chucVu;
  }

  public void setChucVu(ChucVu chucVu) {
    this.chucVu = chucVu;
  }

  public ChiNhanh getChiNhanh() {
    return chiNhanh;
  }

  public void setChiNhanh(ChiNhanh chiNhanh) {
    this.chiNhanh = chiNhanh;
  }

  
}
