package Quan_Li_Tai_Khoan_Ngan_Hang.model;

import java.time.LocalDate;

public class TaiKhoanThanhToan extends TaiKhoanNganHang{
    private String soThe;
    private double soTienTrongTaiKhoan;

    public TaiKhoanThanhToan(){

    }

    public TaiKhoanThanhToan(String soThe, double soTienTrongTaiKhoan) {
        this.soThe = soThe;
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }

    public TaiKhoanThanhToan(int id, String maTaiKhoan, String tenChuTaiKhoan, String ngayTaoTaiKhoan, String soThe, double soTienTrongTaiKhoan) {
        super(id, maTaiKhoan, tenChuTaiKhoan, ngayTaoTaiKhoan);
        this.soThe = soThe;
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }

    public String getSoThe() {
        return soThe;
    }

    public void setSoThe(String soThe) {
        this.soThe = soThe;
    }

    public double getSoTienTrongTaiKhoan() {
        return soTienTrongTaiKhoan;
    }

    public void setSoTienTrongTaiKhoan(double soTienTrongTaiKhoan) {
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }

    @Override
    public String toString() {
        return super.toString()+
                "TaiKhoanThanhToan{" +
                "soThe='" + soThe + '\'' +
                ", soTienTrongTaiKhoan=" + soTienTrongTaiKhoan +
                '}';
    }

    @Override
    public String getToCv() {
        return this.getId()+","+this.getMaTaiKhoan()+","+this.getTenChuTaiKhoan()+","+this.getNgayTaoTaiKhoan()+","+this.getSoThe()+","+this.soTienTrongTaiKhoan;
    }
}
