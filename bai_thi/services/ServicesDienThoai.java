package bai_thi.services;

import bai_thi.models.DienThoaiChinhHang;
import bai_thi.models.DienThoaiXachTay;
import bai_thi.utils.WriteReadFile;

import java.util.ArrayList;
import java.util.Scanner;

public class ServicesDienThoai {
    private Scanner scanner = new Scanner(System.in);
    public ArrayList<DienThoaiChinhHang> arrayChinhHang = new ArrayList<>();
    public ArrayList<DienThoaiXachTay> arrayXachTay = new ArrayList<>();

    public void addNew() {
        System.out.println("1.Thêm điện thoại chính hãng");
        System.out.println("2.Thêm điện thoại xách tay");
        System.out.println("Thoát");
        String goTo = scanner.nextLine();
        switch (goTo) {
            case "1":
                addNewChinhHang();
                WriteReadFile.writeToFile(DienThoaiChinhHang.FILE,arrayChinhHang);
                System.out.println("Thêm thành công");
                break;
            case "2":
                addNewXachTay();
                 WriteReadFile.writeToFiles(DienThoaiXachTay.FILE,arrayXachTay);
                System.out.println("Thêm thành công");
                break;
            default:
                return;
        }
    }

    public void addNewChinhHang() {
        System.out.println("Thêm mới điện thoại chính hãng");
        System.out.print("Id điện thoại: ");
        String idDienThoai = scanner.nextLine();
        System.out.print("Tên điện thoại: ");
        String tenDienThoai = scanner.nextLine();
        System.out.print("Giá bán: ");
        double giaBan = Double.parseDouble(scanner.nextLine());
        System.out.print("Số lượng: ");
        int soLuong = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhà sản xuất: ");
        String nhaSanXuat = scanner.nextLine();
        System.out.print("Thời gian bảo hành: ");
        double thoiGianBaoHanh = Double.parseDouble(scanner.nextLine());
        System.out.print("Phạm vi bảo hành: ");
        String phamViBaoHanh = scanner.nextLine();
        DienThoaiChinhHang dienThoaiChinhHang = new DienThoaiChinhHang(idDienThoai, tenDienThoai, giaBan, soLuong, nhaSanXuat, thoiGianBaoHanh,
                phamViBaoHanh);
        arrayChinhHang.add(dienThoaiChinhHang);

    }
    public void addNewXachTay() {
        System.out.println("Thêm mới điện thoại xách tay: ");
        System.out.print("Id điện thoại: ");
        String idDienThoai = scanner.nextLine();
        System.out.print("Tên điện thoại: ");
        String tenDienThoai = scanner.nextLine();
        System.out.print("Giá bán: ");
        double giaBan = Double.parseDouble(scanner.nextLine());
        System.out.print("Số lượng: ");
        int soLuong = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhà sản xuất: ");
        String nhaSanXuat = scanner.nextLine();
        System.out.print("Quốc gia xách tay: ");
        String quocGiaXachTay = scanner.nextLine();
        System.out.print("Trạng thái: ");
        String trangThai = scanner.nextLine();
        DienThoaiXachTay dienThoaiXachTay = new DienThoaiXachTay(idDienThoai, tenDienThoai, giaBan, soLuong, nhaSanXuat, quocGiaXachTay, trangThai);
        arrayXachTay.add(dienThoaiXachTay);

    }

    public void disPlay() {
        if (arrayChinhHang.size() == 0 && arrayXachTay.size() == 0) {
            System.out.println("Danh sách điện thoại trống!");
        } else {
            System.out.println("Danh sách điện thoại: ");
            for (DienThoaiXachTay dienThoaiXachTay : arrayXachTay) {
                System.out.println(dienThoaiXachTay.toString());
            }

            for (DienThoaiChinhHang dienThoaiChinhHang : arrayChinhHang) {
                System.out.println(dienThoaiChinhHang.toString());
            }
        }

    }

    public void search() {
        System.out.println("1.Tìm kiếm theo id điện thoại");
        System.out.println("2.Tìm kiếm theo tên điện thoại");
        System.out.println("Thoát");
        String goTo = scanner.nextLine();
        switch (goTo) {
            case "1":
                System.out.print("Nhập id điện thoại: ");
                String idDienThoai = scanner.nextLine();
                searchIdDienThoai(idDienThoai);
                break;
            case "2":
                System.out.print("Nhập tên điện thoại: ");
                String tenDienThoai = scanner.nextLine();
                searchTenDienThoai(tenDienThoai);
                break;
            default:
                return;
        }
    }

    private void searchIdDienThoai(String idDienThoai) {
        System.out.println("Điện thoại cần tìm: ");
        for (DienThoaiXachTay dienThoaiXachTay : arrayXachTay) {
            if (dienThoaiXachTay.getIdDienThoai().equalsIgnoreCase(idDienThoai) || dienThoaiXachTay.getIdDienThoai().indexOf(idDienThoai) != -1) {
                System.out.println(dienThoaiXachTay.toString());
            }
        }

        for (DienThoaiChinhHang dienThoaiChinhHang : arrayChinhHang) {
            if (dienThoaiChinhHang.getIdDienThoai().equalsIgnoreCase(idDienThoai) || dienThoaiChinhHang.getIdDienThoai().indexOf(idDienThoai) != -1) {
                System.out.println(dienThoaiChinhHang.toString());
            }
        }
    }

    private void searchTenDienThoai(String tenDienThoai) {
        int check = 0;
        System.out.println("Điện thoại cần tìm: ");
        for (DienThoaiXachTay dienThoaiXachTay : arrayXachTay) {
            if (dienThoaiXachTay.getTenDienThoai().equalsIgnoreCase(tenDienThoai) || dienThoaiXachTay.getIdDienThoai().indexOf(tenDienThoai) != -1) {
                System.out.println(dienThoaiXachTay.toString());
                check++;
            }
        }
        for (DienThoaiChinhHang dienThoaiChinhHang : arrayChinhHang) {
            if (dienThoaiChinhHang.getTenDienThoai().equalsIgnoreCase(tenDienThoai) || dienThoaiChinhHang.getTenDienThoai().indexOf(tenDienThoai) != -1) {
                System.out.println(dienThoaiChinhHang.toString());
                check++;
            }
        }
        if (check == 0) {
            System.out.println("Không tìm thấy! ");
        }

    }

    public void delete() {
        System.out.println("Xóa điện thoại");
        System.out.print("Nhập id điện thoại:");
        String idDienThoai = scanner.nextLine();
        for (DienThoaiXachTay dienThoaiXachTay : arrayXachTay) {
            if (dienThoaiXachTay.getIdDienThoai().equals(idDienThoai)) {
                while (true) {
                    System.out.println("1.Yes  2.No");
                    System.out.print("Chọn: ");
                    String goTo = scanner.nextLine();
                    if (goTo.equals("1")) {
                        arrayXachTay.remove(dienThoaiXachTay);
                         WriteReadFile.writeToFiles(DienThoaiXachTay.FILE,arrayXachTay);
                        System.out.println("Xóa thành công!");
                        return;
                    }
                    if (goTo.equals("2")) {
                        return;
                    }
                }
            }
        }
        for (DienThoaiChinhHang dienThoaiChinhHang : arrayChinhHang) {
            if (dienThoaiChinhHang.getIdDienThoai().equals(idDienThoai)) {
                while (true) {
                    System.out.println("1.Yes  2.No");
                    System.out.print("Chọn: ");
                    String goTo = scanner.nextLine();
                    if (goTo.equals("1")) {
                        arrayChinhHang.remove(dienThoaiChinhHang);
                        WriteReadFile.writeToFile(DienThoaiChinhHang.FILE,arrayChinhHang);
                        System.out.println("Xóa thành công!");
                        return;
                    }
                    if (goTo.equals("2")) {
                        return;
                    }
                }
            }
        }
    }
}
