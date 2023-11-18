/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import java.util.Date;

/**
 *
 * @author My MSI
 */
public class nhanVien {
    private String maNV;
    private String tenNV ;
    private boolean gioiTinh ;
    private String chuVu ;
    private Date ngayVaoLam ;
    private String diaChi ;
    private String soDT ;
    private boolean phanQuyen ;
    private String matKhau ;

    public nhanVien() {
    }

    public nhanVien(String maNV, String tenNV, boolean gioiTinh, String chuVu, Date ngayVaoLam, String diaChi, String soDT, boolean phanQuyen, String matKhau) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.gioiTinh = gioiTinh;
        this.chuVu = chuVu;
        this.ngayVaoLam = ngayVaoLam;
        this.diaChi = diaChi;
        this.soDT = soDT;
        this.phanQuyen = phanQuyen;
        this.matKhau = matKhau;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getChuVu() {
        return chuVu;
    }

    public void setChuVu(String chuVu) {
        this.chuVu = chuVu;
    }

    public Date getNgayVaoLam() {
        return ngayVaoLam;
    }

    public void setNgayVaoLam(Date ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public boolean isPhanQuyen() {
        return phanQuyen;
    }

    public void setPhanQuyen(boolean phanQuyen) {
        this.phanQuyen = phanQuyen;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
    
    
}
