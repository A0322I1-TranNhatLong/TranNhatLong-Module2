package ss15_xu_li_ngoai_le_va_debug.bai_tap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        IllegalTriangleExceptionCheck check = new IllegalTriangleExceptionCheck ();
        try {
            System.out.print("Nhập vào cạnh thứ nhất : ");
            int a = sc.nextInt();
            System.out.print("Nhập vào cạnh thứ hai : ");
            int b = sc.nextInt();
            System.out.print("Nhập vào cạnh thứ ba : ");
            int c = sc.nextInt();

            try {
               check.IllegalTriangleException(a, b, c);
            } catch (IllegalTriangleException ex) {
                System.out.println(ex.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Sai: không đúng định dạng !");
        }

        sc.close();
    }
}
