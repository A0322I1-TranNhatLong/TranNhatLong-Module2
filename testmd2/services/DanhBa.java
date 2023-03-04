package testmd2.services;

import testmd2.models.Lienhe;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class DanhBa {
    Scanner scanner = new Scanner(System.in);
    int choice;
    LinkedList<Lienhe> lienheList ;
    Lienhe newLienHe;
    public DanhBa(){
        lienheList = new LinkedList<>();
    }
    public void addLienHe(){
        String soDienThoai, nhom = "", hoTen, gioiTinh = "", diaChi, ngaySinh, email;
        do {
            System.out.println("Nhập số điện thoại");
            soDienThoai = scanner.nextLine();
            if (!Validate.validateSodienthoai(soDienThoai)) {
                System.out.println("Số điện thọai phải từ 10-11 số");
            }
        } while (!Validate.validateSodienthoai(soDienThoai));

        System.out.println("Nhập họ và tên");
        hoTen = scanner.nextLine();

        do {
            System.out.println("Người này thuộc nhóm:\n"
                    + "1. Nguời nhà\n"
                    + "2. Bạn bè\n"
                    + "3. Đồng nghiệp\n"
                    + "4. Đối tác\n");
            choice = scanner.nextInt();
            if (choice == 1) {
                nhom = "nguoiNha";
                break;
            } else if (choice == 2) {
                nhom = "banBe";
                break;
            } else if (choice == 3) {
                nhom = "dongNghiep";
                break;
            } else if (choice == 4) {
                nhom = "doiTac";
                break;
            }
            System.out.println("Không đúng, nhập lại");
        } while (true);

        do {
            System.out.println("Giới tính:\n"
                    + "1. Nam\n" + "2. Nữ\n");
            choice = scanner.nextInt();
            if (choice == 1) {
                gioiTinh = "Nam";
                break;
            } else if (choice == 2) {
                gioiTinh = "Nữ";
                break;
            }
            System.out.println("Không đúng, nhập lại");
        } while (true);
        scanner.nextLine();
        System.out.println("Nhập địa chỉ");
        diaChi = scanner.nextLine();
        System.out.println("Nhập ngày sinh");
        ngaySinh = scanner.nextLine();
        do {
            System.out.println("Nhập email");
            email = scanner.nextLine();
            if (!Validate.validateEmail(email)) {
                System.out.println("Định dạng email đúng: ki_tu_bat_ki@ten_mien_dung.com");
            }
        } while (!Validate.validateEmail(email));

        newLienHe = new Lienhe(soDienThoai, nhom, hoTen, gioiTinh, diaChi, ngaySinh, email);
        lienheList.add(newLienHe);
        System.out.println("Thêm danh bạ thành công");
    }

    public void editLienHe() {
        String soDienThoai, nhom = "", hoTen, gioiTinh = "", diaChi, ngaySinh, email;
        Lienhe lienhe = findLienHe();
        if (lienhe == null) {
            System.out.println("Không tìm thấy");
        } else {
            do {
                System.out.println(lienhe);
                System.out.println("Bạn muon sửa gì: \n"
                        + "1.Nhóm danh bạ\n"
                        + "2.Họ tên\n"
                        + "3.Giới tính\n"
                        + "4.Địa chỉ\n"
                        + "5.Ngày sinh\n"
                        + "6.Email\n"
                        + "7. Hủy");
                choice = scanner.nextInt();
                scanner.nextLine();
                if (choice == 1) {
                    do {
                        System.out.println("Người này thuộc nhóm:\n"
                                + "1. Nguời nhà\n"
                                + "2. Bạn bè\n"
                                + "3. Đồng nghiệp\n"
                                + "4. Đối tác\n");
                        choice = scanner.nextInt();
                        if (choice == 1) {
                            nhom = "nguoiNha";
                            break;
                        } else if (choice == 2) {
                            nhom = "banBe";
                            break;
                        } else if (choice == 3) {
                            nhom = "dongNghiep";
                            break;
                        } else if (choice == 4) {
                            nhom = "doiTac";
                            break;
                        }
                        System.out.println("Không đúng, nhập lại");
                    } while (true);
                   lienhe.setNhom(nhom);
                    System.out.println("Thay doi thành công");
                } else if (choice == 2) {
                    System.out.println("Nhập họ và tên");
                    hoTen = scanner.nextLine();
                    lienhe.setHoTen(hoTen);
                    System.out.println("Thay doi thành công");
                } else if (choice == 3) {
                    do {
                        System.out.println("Giới tính:\n"
                                + "1. Nam\n" + "2. Nữ\n");
                        choice = scanner.nextInt();
                        if (choice == 1) {
                            gioiTinh = "Nam";
                            break;
                        } else if (choice == 2) {
                            gioiTinh = "Nữ";
                            break;
                        }
                        System.out.println("Không đúng, nhập lại");
                    } while (true);
                    lienhe.setGioiTinh(gioiTinh);
                    System.out.println("Thay doi thành công");
                } else if (choice == 4) {
                    System.out.println("Nhập địa chỉ");
                    diaChi = scanner.nextLine();
                    lienhe.setDiaChi(diaChi);
                    System.out.println("Thay doi thành công");


                } else if (choice == 5) {
                    System.out.println("Nhập ngày sinh");
                    ngaySinh = scanner.nextLine();
                    lienhe.setNgaySinh(ngaySinh);
                    System.out.println("Thay doi thành công");
                } else if (choice == 6) {
                    do {
                        System.out.println("Nhập email");
                        email = scanner.nextLine();
                        if (!Validate.validateEmail(email)) {
                            System.out.println("Định dạng email đúng: ki_tu_bat_ki@ten_mien_dung.com");
                        }
                    } while (!Validate.validateEmail(email));
                   lienhe.setEmail(email);
                    System.out.println("Thay doi thành công");
                }
            } while (choice != 7);

        }

    }

    public void deleteLienHe() {
        String accept;
        Lienhe lienhe = findLienHe();
        if (lienhe == null) {
            System.out.println("Không tìm thấy");
           scanner.nextLine();
        } else {
            do {
                System.out.println(lienhe);
                System.out.println("Bạn có muốn xóa không? nhấn 'y' để xác nhận, nhấn phím bất kì đê thoát ");
                accept = scanner.nextLine();
                if (accept.equals("y")) {
                    lienheList.remove(lienhe);
                    System.out.println("Xóa thành công");
                    break;
                }
            } while (accept.equals("y"));


        }
    }

    public Lienhe findLienHe() {
        Lienhe needLienHe = null;
        System.out.println("Nhập số điện thoại hoặc họ tên(in hoa chữ đầu, không dấu) người cần tìm");
        String data = scanner.nextLine();
        for (Lienhe lienhe : lienheList) {
            if (lienhe.getHoTen().equals(data) || lienhe.getSoDienThoai().equals(data)) {
                System.out.println("Đã tìm thấy");
                needLienHe = lienhe;
            }
        }
        return needLienHe;
    }

    public void importFile() {
        String path = "D:\\CodeGym\\module_2\\src\\testmd2\\data\\LienHe.csv";
        LinkedList<Lienhe> newList = new LinkedList<>();
        try {
            FileReader fileReader = new FileReader(new File(path));
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line ;
            while ((line= bufferedReader.readLine())!=null){
                if (line.trim().equals(" ")){
                    continue;
                }
                String[] entry = line.split(",");
                newList.add(new Lienhe(entry[0],entry[1],entry[2],entry[3],entry[4],entry[5],entry[6]));
            }
            bufferedReader.close();
            fileReader.close();
            System.out.println("Nhap thanh cong");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        lienheList= newList;
    }


    public void exportFile() {
        String path = "D:\\CodeGym\\module_2\\src\\testmd2\\data\\LienHe.csv";
        try {
            FileWriter fileWriter = new FileWriter(new File(path),false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Lienhe lienhe : lienheList) {
                bufferedWriter.write(lienhe.toStringFile());
                bufferedWriter.write("\n");
            }
            bufferedWriter.close();
            System.out.println("Xuất thành công");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void displayLienHe() {
        for (Lienhe lienhe : lienheList) {
            System.out.println(lienhe.toString());
        }
    }

}
