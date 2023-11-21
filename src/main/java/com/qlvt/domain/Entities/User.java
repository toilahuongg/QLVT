package com.qlvt.domain.Entities;

import jakarta.persistence.*;
import java.sql.Date;

@Entity
@Table(name="[NhanVien]", schema = "[dbo]")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="ho_ten",columnDefinition = "NVARCHAR(MAX) COLLATE SQL_Latin1_General_CP1_CI_AS")
    private String name;
    @Column(name="so_dien_thoai")
    private String phone;
    @Column(name="tai_khoan", unique = true)
    private String username;
    @Column(name="mat_khau")
    private String password;
    @Column(name="dia_chi",columnDefinition = "NVARCHAR(MAX) COLLATE SQL_Latin1_General_CP1_CI_AS")
    private String address;
    @Column(name="ngay_sinh")
    private Date born;
    @Column(name="trang_thai")
    private Boolean status = Boolean.TRUE;
    @Column(name="chuc_vu")
    @Enumerated(EnumType.STRING)
    private Role role;
    @ManyToOne
    @JoinColumn(name="ChiNhanh_ID")
    private Branch branch;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Date getBorn() {
        return born;
    }
    public void setBorn(Date born) {
        this.born = born;
    }
    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }
    public Role getRole() {
        return role;
    }
    public void setRole(Role role) {
        this.role = role;
    }
    public Branch getBranch() {
        return branch;
    }
    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    
}
