package thi_cuoi_module2.services;

import thi_cuoi_module2.models.BenhAnThuong;
import thi_cuoi_module2.models.BenhAnVip;
import thi_cuoi_module2.utils.WriteReadFile;

import java.util.ArrayList;
import java.util.Scanner;

public class ServicesBenhAn {
    private Scanner scanner = new Scanner(System.in);
    public ArrayList<BenhAnThuong> arrayThuong = new ArrayList<>();
    public ArrayList<BenhAnVip> arrayVip = new ArrayList<>();

    public void addNew() {
        System.out.println("1.Thêm bệnh án thường");
        System.out.println("2.Thêm bệnh án VIP");
        System.out.println("Thoát");
        String goTo = scanner.nextLine();
        switch (goTo) {
            case "1":
                addNewThuong();
                WriteReadFile.writeToFiles(BenhAnThuong.FILE, arrayThuong);
                System.out.println("Thêm thành công !");
                break;
            case "2":
                addNewVip();
                WriteReadFile.writeToFile(BenhAnVip.FILE, arrayVip);
                System.out.println("Thêm thành công !");
                break;
            default:
                return;
        }
    }

    public void addNewThuong() {
        System.out.println("Thêm mới bệnh án thường : ");
        System.out.println("Mã bệnh nhân : ");
        String maBenhNhan = scanner.nextLine();
        System.out.println("Tên bệnh nhân : ");
        String tenBenhNhan = scanner.nextLine();
        System.out.println("Ngày nhập viện : ");
        String ngayNhapVien = scanner.nextLine();
        System.out.println("Ngày ra viện : ");
        String ngayRaVien = scanner.nextLine();
        System.out.println("Lý do nhập viện : ");
        String lyDoNhapVien = scanner.nextLine();
        System.out.println("Phí nằm viện : ");
        String phiNamVien = scanner.nextLine();
        BenhAnThuong benhAnThuong = new BenhAnThuong(maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien, phiNamVien);
        arrayThuong.add(benhAnThuong);
    }

    public void addNewVip() {
        System.out.println("Thêm mới bệnh án VIP : ");
        System.out.println("Mã bệnh nhân : ");
        String maBenhNhan = scanner.nextLine();
        System.out.println("Tên bệnh nhân : ");
        String tenBenhNhan = scanner.nextLine();
        System.out.println("Ngày nhập viện : ");
        String ngayNhapVien = scanner.nextLine();
        System.out.println("Ngày ra viện : ");
        String ngayRaVien = scanner.nextLine();
        System.out.println("Lý do nhập viện : ");
        String lyDoNhapVien = scanner.nextLine();
        System.out.println("Loại VIP : ");
        String loaiVip = scanner.nextLine();
        System.out.println("Thời hạn VIP : ");
        String thoiHanVip = scanner.nextLine();
        BenhAnVip benhAnVip = new BenhAnVip(maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien, loaiVip, thoiHanVip);
        arrayVip.add(benhAnVip);
    }

    public void disPlay() {
        if (arrayThuong.size() == 0 && arrayVip.size() == 0) {
            System.out.println("Danh sách bệnh án trống ! ");
        } else {
            System.out.println("Danh sách bệnh án : ");
            for (BenhAnThuong benhAnThuong : arrayThuong) {
                System.out.println(benhAnThuong.toString());
            }
            for (BenhAnVip benhAnVip : arrayVip) {
                System.out.println(benhAnVip.toString());
            }
        }
    }

    public void delete() {
        System.out.println("Xóa bệnh án");
        System.out.print("Nhập mã bệnh nhân : ");
        String maBenhNhan = scanner.nextLine();
        for (BenhAnThuong benhAnThuong : arrayThuong) {
            if (benhAnThuong.getMaBenhNhan().equals(maBenhNhan)) {
                while (true) {
                    System.out.println("1.Yes   2.No");
                    System.out.print("Chọn : ");
                    String goTo = scanner.nextLine();
                    if (goTo.equals("1")) {
                        arrayThuong.remove(benhAnThuong);
                        WriteReadFile.writeToFiles(BenhAnThuong.FILE, arrayThuong);
                        System.out.println("Xóa thành công !");
                        return;
                    }
                    if (goTo.equals("2")) {
                        return;
                    }
                }
            }
        }
        for (BenhAnVip benhAnVip : arrayVip) {
            if (benhAnVip.getMaBenhNhan().equals(maBenhNhan)) {
                while (true) {
                    System.out.println("1.Yes   2.No");
                    System.out.print("Chọn : ");
                    String goTo = scanner.nextLine();
                    if (goTo.equals("1")) {
                        arrayVip.remove(benhAnVip);
                        WriteReadFile.writeToFile(BenhAnVip.FILE, arrayVip);
                        System.out.println("Xóa thành công !");
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
