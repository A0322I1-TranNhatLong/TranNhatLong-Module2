package bai_thi.models;

public class DienThoaiXachTay extends DienThoai{
    public static final String FILE="D:\\CodeGym\\module_2\\src\\bai_thi\\data\\dsdienthoaixachtay.csv";
    private String quocGiaXachTay;
    private String trangThai;

    public DienThoaiXachTay() {
    }

    public DienThoaiXachTay(String idDienThoai, String tenDienThoai, double giaBan, int soLuong, String nhaSanXuat,
                           String quocGiaXachTay, String trangThai) {
        super(idDienThoai, tenDienThoai, giaBan, soLuong, nhaSanXuat);
        this.quocGiaXachTay = quocGiaXachTay;
        this.trangThai = trangThai;
    }

    public String getQuocGiaXachTay() {
        return quocGiaXachTay;
    }

    public void setQuocGiaXachTay(String quocGiaXachTay) {
        this.quocGiaXachTay = quocGiaXachTay;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "Điện thoại xách tay{" +
                "Quốc gia xách tay=" + quocGiaXachTay +
                ", Trạng thái='" + trangThai + '\'' +
                ", id=" + id +
                ", ID điện thoại='" + idDienThoai + '\'' +
                ", Tên điện thoại='" + tenDienThoai + '\'' +
                ", Giá bán=" + giaBan +
                ", Số lượng=" + soLuong +
                ", Nhà sản xuất='" + nhaSanXuat + '\'' +
                '}';
    }
    public String toStringWrite()
    {
        return id+","+
                idDienThoai+","+
                tenDienThoai+","+
                giaBan+","+
                soLuong+","+
                nhaSanXuat+","+
                quocGiaXachTay+","+
                trangThai;
    }
}
