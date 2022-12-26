package thi_cuoi_module2.models;

public class BenhAnVip extends BenhAn{
    public static final String FILE = "D:\\CodeGym\\module_2\\src\\thi_cuoi_module2\\data\\dsbenhanvip.csv";
    private String loaiVip;
    private String thoiHanVip;

    public BenhAnVip( String maBenhNhan, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien, String loaiVip, String thoiHanVip) {
        super(maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.loaiVip = loaiVip;
        this.thoiHanVip = thoiHanVip;
    }

    public void setLoaiVip(String loaiVip) {
        this.loaiVip = loaiVip;
    }

    public void setThoiHanVip(String thoiHanVip) {
        this.thoiHanVip = thoiHanVip;
    }

    @Override
    public String toString() {
        return "BenhAnVip{" +
                "loaiVip='" + loaiVip + '\'' +
                ", thoiHanVip='" + thoiHanVip + '\'' +
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
                loaiVip+" , "+
                thoiHanVip;
    }
}
