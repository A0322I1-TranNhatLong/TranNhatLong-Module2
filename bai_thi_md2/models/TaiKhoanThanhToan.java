package bai_thi_md2.models;

import java.io.File;

public class TaiKhoanThanhToan extends TaiKhoanNganHang{
    public static final String FILE = "D:\\CodeGym\\module_2\\src\\bai_thi_md2\\data\\dstaikhoanthanhtoan.csv";
    private String soThe;
    private String soTienTrongTaiKhoan;

    public TaiKhoanThanhToan(String idTaiKhoan, String maTaiKhoan, String tenChuTaiKhoan, String ngayTaoTaiKhoan, String soThe, String soTienTrongTaiKhoan) {
        super(idTaiKhoan, maTaiKhoan, tenChuTaiKhoan, ngayTaoTaiKhoan);
        this.soThe = soThe;
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }

    public void setSoThe(String soThe) {
        this.soThe = soThe;
    }

    public void setSoTienTrongTaiKhoan(String soTienTrongTaiKhoan) {
        this.soTienTrongTaiKhoan = soTienTrongTaiKhoan;
    }

    @Override
    public String toString() {
        return "Tài khoản thanh toán {" +
                "Số thẻ ='" + soThe + '\'' +
                ", Số tiền trong tài khoản ='" + soTienTrongTaiKhoan + '\'' +
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
                soThe+" , "+
                soTienTrongTaiKhoan;
    }
}
