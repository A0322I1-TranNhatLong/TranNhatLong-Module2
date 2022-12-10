package bai_thi_md2.controllers;

import bai_thi_md2.services.ServicesTaiKhoanNganHang;

import java.util.Scanner;

public class QuanLiTaiKhoanNganHang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ServicesTaiKhoanNganHang servicesTaiKhoanNganHang = new ServicesTaiKhoanNganHang();
        while (true)
        {
            menu();
            System.out.print("Chọn chức năng : ");
            String goTo = scanner.nextLine();
            switch (goTo)
            {
                case "1":
                    try {
                        servicesTaiKhoanNganHang.addNew();
                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                        System.out.println("Tạo mới tài khoản ngân hàng thành công ! ");
                    }
                    break;
                case "2":
                    servicesTaiKhoanNganHang.delete();
                    break;
                case "3":
                    servicesTaiKhoanNganHang.disPlay();
                case "4":
                    servicesTaiKhoanNganHang.search();
                    break;
                default:
                    System.out.println("Vui lòng chọn chức năng : ");
                    }

            }
        }
        private static void menu()
        {
            System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ TÀI KHOẢN NGÂN HÀNG--");
            System.out.println("Chọn chức năng theo số : ");
            System.out.println("1.Thêm mới");
            System.out.println("2.Xóa");
            System.out.println("3.Xem danh sách các tài khoản ngân hàng");
            System.out.println("4.Tìm kiếm");
            System.out.println("5.Thoát");
    }
}
