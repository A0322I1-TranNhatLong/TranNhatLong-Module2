package thi_cuoi_module2.models;

public class BenhAnThuong extends BenhAn {
    public static final String FILE = "D:\\CodeGym\\module_2\\src\\thi_cuoi_module2\\data\\dsbenhanthuong.csv";
    private String phiNamVien;

    public BenhAnThuong(String maBenhNhan, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien, String phiNamVien) {
        super(maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.phiNamVien = phiNamVien;
    }

    public void setPhiNamVien(String phiNamVien) {
        this.phiNamVien = phiNamVien;
    }

    @Override
    public String toString() {
        return "BenhAnThuong{" +
                "phiNamVien='" + phiNamVien + '\'' +
                ", id=" + id +
                ", maBenhNhan='" + maBenhNhan + '\'' +
                ", tenBenhNhan='" + tenBenhNhan + '\'' +
                ", ngayNhapVien='" + ngayNhapVien + '\'' +
                ", ngayRaVien='" + ngayRaVien + '\'' +
                ", lyDoNhapVien='" + lyDoNhapVien + '\'' +
                '}';
    }
    public String toStringWrite(){
        return id+" , "+
                maBenhNhan+" , "+
                tenBenhNhan+" , "+
                ngayNhapVien+" , "+
                ngayRaVien+" , "+
               lyDoNhapVien+" , "+
               phiNamVien;
    }
}
