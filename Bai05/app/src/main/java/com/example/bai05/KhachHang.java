package com.example.bai05;

public class KhachHang {
    private String tenKhachHang;
    private int soLuongSach;
    private boolean khachHangVIP;
    private double soTien;


    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public int getSoLuongSach() {
        return soLuongSach;
    }

    public void setSoLuongSach(int soLuongSach) {
        this.soLuongSach = soLuongSach;
    }

    public boolean isKhachHangVIP() {
        return khachHangVIP;
    }

    public void setKhachHangVIP(boolean khachHangVIP) {
        this.khachHangVIP = khachHangVIP;
    }

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

    public KhachHang(int soLuongSach) {
        this.soLuongSach = soLuongSach;
    }

    public KhachHang(String tenKhachHang, int soLuongSach, boolean khachHangVIP, double soTien) {
        this.tenKhachHang = tenKhachHang;
        this.soLuongSach = soLuongSach;
        this.khachHangVIP = khachHangVIP;
        this.soTien = soTien;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "tenKhachHang='" + tenKhachHang + '\'' +
                ", soLuongSach=" + soLuongSach +
                ", khachHangVIP=" + khachHangVIP +
                ", soTien=" + soTien +
                '}';
    }

}
