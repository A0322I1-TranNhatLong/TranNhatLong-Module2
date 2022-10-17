package bai_thi.models;

import index.models.SanPham;

public class DienThoai {
    public static int mid=0;
    protected int id;
    protected String idDienThoai;
    protected String tenDienThoai;
    protected double giaBan;
    protected int soLuong;
    protected String nhaSanXuat;

    public DienThoai(String idDienThoai, String tenDienThoai, double giaBan, int soLuong, String nhaSanXuat) {
        this.id = ++mid;
        this.idDienThoai = idDienThoai;
        this.tenDienThoai = tenDienThoai;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.nhaSanXuat = nhaSanXuat;
    }

    public DienThoai() {
    }

    public static int getMid() {
        return mid;
    }

    public static void setMid(int mid) {
        DienThoai.mid = mid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdDienThoai() {
        return idDienThoai;
    }

    public void setIdDienThoai(String idDienThoai) {
        this.idDienThoai = idDienThoai;
    }

    public String getTenDienThoai() {
        return tenDienThoai;
    }

    public void setTenDienThoai(String tenDienThoai) {
        this.tenDienThoai = tenDienThoai;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }
    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public String getNhaSanXuat() {
        return nhaSanXuat;
    }
    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }
}
