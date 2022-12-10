package bai_thi_md2.models;

public class TaiKhoanNganHang {
    public static int mid=0;
    protected int id;
    protected String idTaiKhoan;
    protected String maTaiKhoan;
    protected String tenChuTaiKhoan;
    protected String ngayTaoTaiKhoan;

    public TaiKhoanNganHang(String idTaiKhoan, String maTaiKhoan, String tenChuTaiKhoan, String ngayTaoTaiKhoan) {
        this.id = ++mid;
        this.idTaiKhoan = idTaiKhoan;
        this.maTaiKhoan = maTaiKhoan;
        this.tenChuTaiKhoan = tenChuTaiKhoan;
        this.ngayTaoTaiKhoan = ngayTaoTaiKhoan;
    }
    public static int getMid() {
        return mid;
    }

    public static void setMid(int mid) {
        TaiKhoanNganHang.mid = mid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdTaiKhoan() {
        return idTaiKhoan;
    }

    public void setIdTaiKhoan(String idTaiKhoan) {
        this.idTaiKhoan = idTaiKhoan;
    }

    public String getMaTaiKhoan() {
        return maTaiKhoan;
    }

    public void setMaTaiKhoan(String maTaiKhoan) {
        this.maTaiKhoan = maTaiKhoan;
    }

    public String getTenChuTaiKhoan() {
        return tenChuTaiKhoan;
    }

    public void setTenChuTaiKhoan(String tenChuTaiKhoan) {
        this.tenChuTaiKhoan = tenChuTaiKhoan;
    }

    public String getNgayTaoTaiKhoan() {
        return ngayTaoTaiKhoan;
    }

    public void setNgayTaoTaiKhoan(String ngayTaoTaiKhoan) {
        this.ngayTaoTaiKhoan = ngayTaoTaiKhoan;
    }
}
