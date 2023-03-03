package Quan_Li_Tai_Khoan_Ngan_Hang.controllers;

import Quan_Li_Tai_Khoan_Ngan_Hang.services.QuanLiTaiKhoan;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static QuanLiTaiKhoan quanLiTaiKhoan = new QuanLiTaiKhoan();

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int choose;
        String input;
        String chon;
        do {
            System.out.println("---CHƯƠNG TRÌNH QUẢN LÍ TÀI KHOẢN NGÂN HÀNG---");
            System.out.println("1. Thêm mới ");
            System.out.println("2. Xóa");
            System.out.println("3. Xem danh sách");
            System.out.println("4. Tìm kiếm ");
            System.out.println("5. Thoát");
            System.out.print("Vui lòng chọn : ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Thêm mới");
                    System.out.println("Chọn 1 : Thêm mới tài khoản tiết kiệm");
                    System.out.println("Chọn 2 : Thêm mới tài khoản thanh toán");
                    input = scanner.nextLine();
                    switch (input) {
                        case "1":
                            quanLiTaiKhoan.addTaiKhoanTietKiem();
                            break;
                        case "2":
                            quanLiTaiKhoan.addTaiKhoanThanhToan();
                            break;
                    }
                    break;

                case 2:
                    System.out.println("Xóa");
                    System.out.println("Chọn 1 : Xóa tài khoản tiết kiệm");
                    System.out.println("Chọn 2 : Xóa tài khoản thanh toán");
                    input = scanner.nextLine();
                    switch (input) {
                        case "1":{
                            System.out.println("Chọn yes or no");
                            chon = scanner.nextLine();
                            switch (chon) {
                                case "yes":
                                    quanLiTaiKhoan.xoaTietKiem();
                                    break;
                                case "no":
                                    quanLiTaiKhoan.displayTietKiem();
                                    break;
                            }
                            break;
                    }
                case "2":
                    System.out.println("Chọn yes or no");
                    chon = scanner.nextLine();
                    switch (chon) {
                        case "yes":
                            quanLiTaiKhoan.xoaThanhToan();
                            break;
                        case "no":
                           quanLiTaiKhoan.displayThanhToan();
                            break;
                    }
                    break;
                    }
                    break;
                case 3:
                    System.out.println("Hiển Thị");
                    System.out.println("Chọn 1 : Hiển thị tài khoản tiết kiệm");
                    System.out.println("Chọn 2 : Hiển thị tài khoản thanh toán");
                    input = scanner.nextLine();
                    switch (input){
                        case "1":
                            quanLiTaiKhoan.displayTietKiem();
                            break;
                        case "2":
                            quanLiTaiKhoan.displayThanhToan();
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Tìm kiếm");
                    System.out.println("1. Tìm kiếm tài khoản tiết kiệm");
                    System.out.println("2. Tìm kiếm tài khoản thanh toán");
                    input = scanner.nextLine();
                    switch (input){
                        case "1":
                            quanLiTaiKhoan.timKiemTietKiem();
                            break;
                        case "2":
                            quanLiTaiKhoan.timKiemThanhToan();
                            break;
                    }
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Chọn sai");
                    break;
                    }
            }
        while (true);
        }
    }




