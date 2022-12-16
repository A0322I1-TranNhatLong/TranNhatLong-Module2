package ss1_Introduction_to_Java.bai_tap;

import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
        int so;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số bất kì : ");
        so = sc.nextInt();
        int tram = so / 100;
        int chuc = (so / 10) % 10;
        int donvi = so % 10;
        switch (tram) {
            case 1:
                System.out.print(" Một trăm ");
                break;
            case 2:
                System.out.print(" Hai trăm ");
                break;
            case 3:
                System.out.print(" Ba trăm ");
                break;
            case 4:
                System.out.print(" Bốn trăm ");
                break;
            case 5:
                System.out.print(" Năm trăm ");
                break;
            case 6:
                System.out.print(" Sáu trăm ");
                break;
            case 7:
                System.out.print(" Bảy trăm ");
                break;
            case 8:
                System.out.print(" Tám trăm ");
                break;
            case 9:
                System.out.print(" Chín trăm ");
                break;
            default:
                System.out.print("");
                break;
        }
        switch (chuc) {
            case 0: {
                if (tram != 0) {
                    System.out.print("Lẻ ");
                }
                break;
            }
            case 1:
                System.out.print(" mười ");
                break;
            case 2:
                System.out.print(" Hai mươi ");
                break;
            case 3:
                System.out.print(" Ba mươi ");
                break;
            case 4:
                System.out.print(" Bốn mươi ");
                break;
            case 5:
                System.out.print(" Năm mươi ");
                break;
            case 6:
                System.out.print(" Sáu mươi ");
                break;
            case 7:
                System.out.print(" Bảy mươi ");
                break;
            case 8:
                System.out.print(" Tám mươi ");
                break;
            case 9:
                System.out.print(" Chín mươi ");
                break;
            default:
                System.out.print("");
                break;
        }
        switch (donvi) {
            case 1:
                System.out.print(" một ");
                break;
            case 2:
                System.out.print(" hai ");
                break;
            case 3:
                System.out.print(" ba ");
                break;
            case 4:
                System.out.print(" bốn ");
                break;
            case 5: {
                if (chuc == 0) {
                    System.out.print(" năm ");
                } else {
                    System.out.print(" lăm ");
                }
            break;
        }
            case 6:
                System.out.print(" sáu ");
                break;
            case 7:
                System.out.print(" bảy ");
                break;
            case 8:
                System.out.print(" tám ");
                break;
            case 9:
                System.out.print(" chín ");
                break;
        }
    }
}
