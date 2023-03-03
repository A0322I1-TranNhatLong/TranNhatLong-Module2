package Quan_Li_Tai_Khoan_Ngan_Hang.ultils;

import Quan_Li_Tai_Khoan_Ngan_Hang.model.TaiKhoanThanhToan;
import Quan_Li_Tai_Khoan_Ngan_Hang.model.TaiKhoanTietKiem;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class ReadAndWrite {
    final static String TAIKHOAN_TIETKIEM = "D:\\CodeGym\\module_2\\src\\Quan_Li_Tai_Khoan_Ngan_Hang\\data\\TaiKhoanTietKiem.csv";
    final static String TAIKHOAN_THANTOAN = "D:\\CodeGym\\module_2\\src\\Quan_Li_Tai_Khoan_Ngan_Hang\\data\\TaiKhoanThanhToan.csv";

    public  static List<TaiKhoanTietKiem> ReadtaiKhoanTietKiem() throws IOException{
        List<TaiKhoanTietKiem>tietKiems = new ArrayList<>();
        FileReader fileReader = new FileReader(TAIKHOAN_TIETKIEM);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        String[] temp;
        TaiKhoanTietKiem tietKiem;
        while ((line = bufferedReader.readLine())!=null){
            temp = line.split(",");
            int id = Integer.parseInt(temp[0]);
            String maTaiKhoan = temp[1];
            String tenChuTaiKhoan = temp[2];
            String ngayTaoTaiKhoan = temp[3];
            double soTienGui = Double.parseDouble(temp[4]);
            String ngayGui = temp[5];
            String laiSuat = temp[6];
            int kiHan = Integer.parseInt(temp[7]);
            tietKiem = new TaiKhoanTietKiem (id,maTaiKhoan,tenChuTaiKhoan,ngayTaoTaiKhoan,soTienGui,ngayGui,laiSuat,kiHan);
            tietKiems.add(tietKiem);
        }
        bufferedReader.close();
        return tietKiems;
    }
    public static List<TaiKhoanThanhToan> ReadtaiKhoanThanhToan() throws IOException {
        List<TaiKhoanThanhToan> thanhToans = new ArrayList<>();
        FileReader fileReader = new FileReader(TAIKHOAN_THANTOAN);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        String[] temp;
        TaiKhoanThanhToan thanhToan;
        while ((line = bufferedReader.readLine()) != null){
            temp = line.split(",");
            int id = Integer.parseInt(temp[0]);
            String maTaiKhoan = temp[1];
            String tenChuTaiKhoan = temp[2];
            String ngayTaoTaiKhoan = temp[3];
            String soThe = temp[4];
            double soTienTrongTaiKhoan = Double.parseDouble(temp[5]);
            thanhToan = new TaiKhoanThanhToan(id,maTaiKhoan,tenChuTaiKhoan,ngayTaoTaiKhoan,soThe,soTienTrongTaiKhoan);
            thanhToans.add(thanhToan);

        }
        bufferedReader.close();
        return thanhToans;


    }
    public static void writeTaiKhoanTietKiem(List<TaiKhoanTietKiem> taiKhoanTietKiemList) throws IOException {
       FileWriter fileWriter = new FileWriter(TAIKHOAN_TIETKIEM,false);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (TaiKhoanTietKiem taiKhoanTietKiem: taiKhoanTietKiemList){
            bufferedWriter.write(taiKhoanTietKiem.getId()+","+taiKhoanTietKiem.getMaTaiKhoan()+","+taiKhoanTietKiem.getTenChuTaiKhoan()+","+taiKhoanTietKiem.getNgayTaoTaiKhoan()+
                    ","+taiKhoanTietKiem.getTienGui()+","+taiKhoanTietKiem.getNgayGui()+","+taiKhoanTietKiem.getLaiSuat()+","+taiKhoanTietKiem.getKiHan() +"\n");
        }

        bufferedWriter.close();
    }
    public static void writeTaiKhoanThanhToan(List<TaiKhoanThanhToan> taiKhoanThanhToanList) throws IOException {
        FileWriter fileWriter = new FileWriter(TAIKHOAN_THANTOAN,false);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (TaiKhoanThanhToan taiKhoanThanhToan: taiKhoanThanhToanList){
            bufferedWriter.write(taiKhoanThanhToan.getId()+","+taiKhoanThanhToan.getMaTaiKhoan()+","+taiKhoanThanhToan.getTenChuTaiKhoan()+","+taiKhoanThanhToan.getNgayTaoTaiKhoan()+
                    ","+taiKhoanThanhToan.getSoThe()+","+taiKhoanThanhToan.getSoTienTrongTaiKhoan() +"\n");
        }

        bufferedWriter.close();
    }

}

