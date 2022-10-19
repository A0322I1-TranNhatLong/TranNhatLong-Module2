package ss3_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args){
        int size;
        int []  array;
        int so,vitri;
        Scanner sc = new Scanner(System.in);
        System.out.print("Bạn muốn nhập vào mảng bao nhiêu số : ");
        size= sc.nextInt();
        array = new int[size];
        for(int i=0; i<size;i++)
        {
            System.out.print("Nhập phần tử thứ "+ i+" : ");
            array[i]= sc.nextInt();
        }
        for(int i : array)
        {
            System.out.print(i+"\t");
        }
        System.out.print("Nhập phần tử cần xóa : ");
        so=sc.nextInt();
        vitri= Index(so,array);
        if(Index(so,array)==-1)
        {
            System.out.print("Số cần xóa không có trong mảng ");
            for(int i : array)
            {
                System.out.print(i+"\t");
            }
        }else{
            for(int i=vitri;i<array.length-1;i++) {
                array[i]=array[i+1];
            }
            array[array.length-1]=0;
            for(int i : array)
            {
                System.out.print(i+"\t");
            }
        }
    }
    public static int Index(int x, int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(x==arr[i])
            {
                return i;
            }
        }
        return -1;
    }
}
