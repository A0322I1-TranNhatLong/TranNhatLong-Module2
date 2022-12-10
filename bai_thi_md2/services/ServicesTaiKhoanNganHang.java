package bai_thi_md2.services;

import bai_thi_md2.models.TaiKhoanThanhToan;
import bai_thi_md2.models.TaiKhoanTietKiem;
import bai_thi_md2.utils.WriteReadFile;

import java.util.ArrayList;
import java.util.Scanner;

public class ServicesTaiKhoanNganHang {
    private Scanner scanner = new Scanner(System.in);
    public ArrayList<TaiKhoanTietKiem> arrayTietKiem = new ArrayList<>();
    public ArrayList<TaiKhoanThanhToan> arrayThanhToan = new ArrayList<>();

    public void addNew() {
        System.out.println("1.Thêm tài khoản tiết kiệm");
        System.out.println("2.Thêm tài khoản thanh toán");
        System.out.println("Thoát");
        String goTo = scanner.nextLine();
        switch (goTo) {
            case "1":
                addNewTietKiem();
                WriteReadFile.writeToFile(TaiKhoanTietKiem.FILE, arrayTietKiem);
                System.out.println("Thêm thành công");
                break;
            case "2":
                addNewThanhToan();
                WriteReadFile.writeToFiles(TaiKhoanThanhToan.FILE, arrayThanhToan);
                System.out.println("Thêm thành công");
                break;
            default:
                return;
        }
    }

    public void addNewTietKiem() {
        System.out.println("Thêm mới tài khoản tiết kiệm");
        System.out.print("Id tài khoản: ");
        String idTaiKhoan = scanner.nextLine();
        System.out.println("Mã tài khoản :");
        String maTaiKhoan = scanner.nextLine();
        System.out.println("Tên chủ tài khoản: ");
        String tenChuTaiKhoan = scanner.nextLine();
        System.out.println("Ngày tạo tài khoản: ");
        String ngayTaoTaiKhoan = scanner.nextLine();
        System.out.println("Số tiền gửi tiết kiệm: ");
        String soTienGuiTietKiem = scanner.nextLine();
        System.out.println("Ngày gửi tiết kiệm: ");
        String ngayGuiTietKiem = scanner.nextLine();
        System.out.println("Lãi suất: ");
        String laiSuat = scanner.nextLine();
        System.out.println("Kì hạn: ");
        String kiHan = scanner.nextLine();
        TaiKhoanTietKiem taiKhoanTietKiem = new TaiKhoanTietKiem(idTaiKhoan, maTaiKhoan, tenChuTaiKhoan, ngayTaoTaiKhoan, soTienGuiTietKiem, ngayGuiTietKiem, laiSuat, kiHan);
        arrayTietKiem.add(taiKhoanTietKiem);
    }

    public void addNewThanhToan() {
        System.out.println("Thêm mới tài khoản thanh toán");
        System.out.print("Id tài khoản: ");
        String idTaiKhoan = scanner.nextLine();
        System.out.println("Mã tài khoản :");
        String maTaiKhoan = scanner.nextLine();
        System.out.println("Tên chủ tài khoản: ");
        String tenChuTaiKhoan = scanner.nextLine();
        System.out.println("Ngày tạo tài khoản: ");
        String ngayTaoTaiKhoan = scanner.nextLine();
        System.out.println("Số thẻ: ");
        String soThe = scanner.nextLine();
        System.out.println("Số tiền trong tài khoản: ");
        String soTienTrongTaiKhoan = scanner.nextLine();
        TaiKhoanThanhToan taiKhoanThanhToan = new TaiKhoanThanhToan(idTaiKhoan, maTaiKhoan, tenChuTaiKhoan, ngayTaoTaiKhoan, soThe, soTienTrongTaiKhoan);
        arrayThanhToan.add(taiKhoanThanhToan);
    }

    public void disPlay() {
        if (arrayTietKiem.size() == 0 && arrayThanhToan.size() == 0) {
            System.out.println("Danh sách tài khoản trống !");
        } else {
            System.out.println("Danh sách tài khoản: ");
            for (TaiKhoanThanhToan taiKhoanThanhToan : arrayThanhToan) {
                System.out.println(taiKhoanThanhToan.toString());
            }
            for (TaiKhoanTietKiem taiKhoanTietKiem : arrayTietKiem) {
                System.out.println(taiKhoanTietKiem.toString());
            }
        }
    }

    public void search() {
        System.out.println("1.Tìm kiếm theo id tài khoản");
        System.out.println("2.Tìm kiếm theo tên chủ tài khoản");
        System.out.println("3. Thoát");
        String goTo = scanner.nextLine();
        switch (goTo) {
            case "1":
                System.out.print("Nhập id tài khoản: ");
                String idTaiKhoan = scanner.nextLine();
                searchIdTaiKhoan(idTaiKhoan);
                break;
            case "2":
                System.out.print("Nhập tên chủ tài khoản: ");
                String tenChuTaiKhoan = scanner.nextLine();
                searchTenChuTaiKhoan(tenChuTaiKhoan);
                break;
            default:
                return;
        }
    }

    private void searchIdTaiKhoan(String idTaiKhoan) {
        System.out.println("Tài khoản cần tìm: ");
        for (TaiKhoanThanhToan taiKhoanThanhToan : arrayThanhToan) {
            if (taiKhoanThanhToan.getIdTaiKhoan().equalsIgnoreCase(idTaiKhoan) || taiKhoanThanhToan.getIdTaiKhoan().indexOf(idTaiKhoan) != -1) {
                System.out.println(taiKhoanThanhToan.toString());
            }
        }
        for (TaiKhoanTietKiem taiKhoanTietKiem : arrayTietKiem) {
            if (taiKhoanTietKiem.getIdTaiKhoan().equalsIgnoreCase(idTaiKhoan) || taiKhoanTietKiem.getIdTaiKhoan().indexOf(idTaiKhoan) != -1) {
                System.out.println(taiKhoanTietKiem.toString());
            }
        }
    }
    private void searchTenChuTaiKhoan(String tenChuTaiKhoan){
        int check = 0;
        System.out.println("Tài khoản cần tìm: ");
        for (TaiKhoanThanhToan taiKhoanThanhToan:arrayThanhToan){
            if (taiKhoanThanhToan.getTenChuTaiKhoan().equalsIgnoreCase(tenChuTaiKhoan) || taiKhoanThanhToan.getTenChuTaiKhoan().indexOf(tenChuTaiKhoan) != -1) {
            System.out.println(taiKhoanThanhToan.toString());
            check++;
            }
        }
        for (TaiKhoanTietKiem taiKhoanTietKiem : arrayTietKiem){
            if (taiKhoanTietKiem.getTenChuTaiKhoan().equalsIgnoreCase(tenChuTaiKhoan) || taiKhoanTietKiem.getTenChuTaiKhoan().indexOf(tenChuTaiKhoan) !=-1){
                System.out.println(taiKhoanTietKiem.toString());
                check++;
            }
        }
        if (check==0){
            System.out.println("Không tìm thấy !");
        }
    }
    public void delete(){
        System.out.println("Xóa tài khoản");
        System.out.print("Nhập id tài khoản: ");
        String idTaiKhoan = scanner.nextLine();
        for (TaiKhoanThanhToan taiKhoanThanhToan : arrayThanhToan){
            if (taiKhoanThanhToan.getIdTaiKhoan().equals(idTaiKhoan)){
                while (true){
                    System.out.println("1.Yes  2.No");
                    System.out.print("Chọn: ");
                    String goTo = scanner.nextLine();
                    if (goTo.equals("1")){
                        arrayThanhToan.remove(taiKhoanThanhToan);
                        WriteReadFile.writeToFiles(TaiKhoanThanhToan.FILE,arrayThanhToan);
                        System.out.println("Xóa thành công !");
                        return;
                    }
                    if (goTo.equals("2")){
                        return;
                    }
                }
            }
        }
        for (TaiKhoanTietKiem taiKhoanTietKiem :arrayTietKiem){
            if (taiKhoanTietKiem.getIdTaiKhoan().equals(idTaiKhoan)){
                while (true){
                    System.out.println("1.Yes  2.No");
                    System.out.print("Chọn: ");
                    String goTo  = scanner.nextLine();
                    if (goTo.equals("1")){
                        arrayTietKiem.remove(taiKhoanTietKiem);
                        WriteReadFile.writeToFile(TaiKhoanTietKiem.FILE,arrayTietKiem);
                        System.out.println("Xóa thành công ! ");
                        return;
                    }
                    if (goTo.equals("2")){
                        return;
                    }
                }
            }
        }
    }
}

