package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        int[] a;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng : ");
        int n=sc.nextInt();
        a=new int[n];
        for (int i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }
        int min=a[0];
        for (int i=1; i<n; i++)
        {
            if(min>a[i]) min=a[i];
        }
        System.out.println("Min = "+min);
    }
}
