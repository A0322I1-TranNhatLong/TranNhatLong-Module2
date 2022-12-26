package thi_cuoi_module2.controllers;

import thi_cuoi_module2.services.ServicesBenhAn;

import java.util.Scanner;

public class QuanLiBenhAn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ServicesBenhAn serviceBenhAn = new ServicesBenhAn();
        while (true){
            menu();
            System.out.print("Chọn chức năng : ");
            String goTo = scanner.nextLine();
            switch (goTo){
                case "1":
                    try {
                        serviceBenhAn.addNew();
                    }
                    catch (Exception e){
                        e.printStackTrace();
                        System.out.println("Tạo mới thông tin thành công !  ");
                    }
                    break;
                case "2":
                    serviceBenhAn.delete();
                    break;
                case "3":
                    serviceBenhAn.disPlay();
                    break;
                default:
                    System.out.println("Vui lòng chọn chức năng : ");
            }
        }
    }
    private static void menu(){
        System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ BỆNH ÁN--");
        System.out.println("Chọn chức năng theo số : ");
        System.out.println("1.Thêm mới");
        System.out.println("2.Xóa");
        System.out.println("3.Xem danh sách các bệnh án");
        System.out.println("4.Thoát");
    }
}
