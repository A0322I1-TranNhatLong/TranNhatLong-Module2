package bai_thi_md2.models;

public class TaiKhoanTietKiem extends TaiKhoanNganHang {
    public static final String FILE ="D:\\CodeGym\\module_2\\src\\bai_thi_md2\\data\\dstaikhoantietkiem.csv";
    private String soTienGuiTietKiem;
    private String ngayGuiTietKiem;
    private String laiSuat;
    private String kiHan;

    public TaiKhoanTietKiem( String idTaiKhoan, String maTaiKhoan, String tenChuTaiKhoan, String ngayTaoTaiKhoan, String soTienGuiTietKiem, String ngayGuiTietKiem, String laiSuat, String kiHan) {
        super(idTaiKhoan, maTaiKhoan, tenChuTaiKhoan, ngayTaoTaiKhoan);
        this.soTienGuiTietKiem = soTienGuiTietKiem;
        this.ngayGuiTietKiem = ngayGuiTietKiem;
        this.laiSuat = laiSuat;
        this.kiHan = kiHan;
    }

    public void setSoTienGuiTietKiem(String soTienGuiTietKiem) {
        this.soTienGuiTietKiem = soTienGuiTietKiem;
    }

    public void setNgayGuiTietKiem(String ngayGuiTietKiem) {
        this.ngayGuiTietKiem = ngayGuiTietKiem;
    }

    public void setLaiSuat(String laiSuat) {
        this.laiSuat = laiSuat;
    }

    public void setKiHan(String kiHan) {
        this.kiHan = kiHan;
    }

    @Override
    public String toString() {
        return "Tài khoản tiết kiệm {" +
                "Số tiền gửi tiết kiệm =" + soTienGuiTietKiem +
                ", Ngày gửi tiết kiệm ='" + ngayGuiTietKiem + '\'' +
                ", Lãi suất ='" + laiSuat + '\'' +
                ", Kì hạn ='" + kiHan + '\'' +
                ", Id =" + id +
                ", ID tài khoản ='" + idTaiKhoan + '\'' +
                ", Mã tài khoản ='" + maTaiKhoan + '\'' +
                ", Tên chủ tài khoản ='" + tenChuTaiKhoan + '\'' +
                ", Ngày tạo tài khoản ='" + ngayTaoTaiKhoan + '\'' +
                '}';
    }
    public String toStringWrite(){
        return id+" , "+
                idTaiKhoan+" , "+
                maTaiKhoan+" , "+
                tenChuTaiKhoan+" , "+
                ngayTaoTaiKhoan+" , "+
                soTienGuiTietKiem+" , "+
                ngayGuiTietKiem+" , "+
                laiSuat+" , "+
                kiHan;
    }
}
