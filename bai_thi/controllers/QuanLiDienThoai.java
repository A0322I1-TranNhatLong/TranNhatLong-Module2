package bai_thi.controllers;

import bai_thi.services.ServicesDienThoai;
import index.services.ServicesSanPham;

import java.util.Scanner;

public class QuanLiDienThoai {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ServicesDienThoai servicesDienThoai=new ServicesDienThoai();
        while (true)
        {
            menu();
            System.out.print("Chọn chức năng: ");
            String goTo=scanner.nextLine();
            switch (goTo)
            {
                case "1":
                    try {
                        servicesDienThoai.addNew();
                    }
                    catch (Exception e)
                    {
                        System.out.println("Tạo mới điện thoại không thành công!");
                    }
                    break;
                case "2":
                    servicesDienThoai.delete();
                    break;
                case "3":
                    servicesDienThoai.disPlay();
                    break;
                case "4":
                    servicesDienThoai.search();
                    break;
                case "5":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui lòng chọn đúng chức năng!");
            }
        }
    }
    private static void menu()
    {
        System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ ĐIỆN THOẠI--");
        System.out.println("Chọn chức năng theo số");
        System.out.println("1.Thêm mới");
        System.out.println("2.Xóa");
        System.out.println("3.Xem danh sách điện thoại");
        System.out.println("4.Tìm kiếm");
        System.out.println("5.Thoát");
    }
}
