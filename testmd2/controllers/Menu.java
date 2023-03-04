package testmd2.controllers;

import testmd2.services.DanhBa;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static void main(String[]args) throws IOException {
        DanhBa danhBa = new DanhBa();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("---CHƯƠNG TRÌNH QUẢN LÍ DANH BẠ---");
            System.out.println("Chọn chức năng theo số (để tiếp tục) : ");
            System.out.println( "1. Xem danh sách");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xóa");
            System.out.println("5. Tìm kiếm");
            System.out.println("6. Đọc từ file");
            System.out.println("7. Ghi vào file");
            System.out.println("Chọn chức năng: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) {
                danhBa.displayLienHe();
            } else if (choice == 2) {
                danhBa.addLienHe();
            } else if (choice == 3) {
                danhBa.editLienHe();
            } else if (choice == 4) {
                danhBa.deleteLienHe();
            } else if (choice == 5) {
                System.out.println(danhBa.findLienHe());
            } else if (choice == 6) {
               danhBa.importFile();
            } else if (choice == 7) {

                danhBa.exportFile();


            }
        } while (choice!=8);
    }
}
