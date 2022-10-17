package bai_thi.models;

public class DienThoaiChinhHang extends DienThoai{
    public static final String FILE="D:\\CodeGym\\module_2\\src\\bai_thi\\data\\dsdienthoai.csv";
    private double thoiGianBaoHanh;
    private String phamViBaoHanh;

    public DienThoaiChinhHang() {
    }

    public DienThoaiChinhHang(String idDienThoai, String tenDienThoai, double giaBan, int soLuong, String nhaSanXuat,
                           double thoiGianBaoHanh, String phamViBaoHanh) {
        super(idDienThoai, tenDienThoai, giaBan, soLuong, nhaSanXuat);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.phamViBaoHanh = phamViBaoHanh;
    }

    public double getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(double thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public String getPhamViBaoHanh() {
        return phamViBaoHanh;
    }

    public void setPhamViBaoHanh(String phamViBaoHanh) {
        this.phamViBaoHanh = phamViBaoHanh;
    }


    @Override
    public String toString() {
        return "Điện thoại chính hãng {" +
                "Thời gian bảo hành =" + thoiGianBaoHanh +
                ", Phạm vi bảo hành ='" + phamViBaoHanh + '\'' +
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
                thoiGianBaoHanh+","+
                phamViBaoHanh;
    }
}
