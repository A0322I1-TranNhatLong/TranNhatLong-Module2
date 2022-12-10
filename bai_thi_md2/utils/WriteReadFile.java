package bai_thi_md2.utils;

import bai_thi_md2.models.TaiKhoanThanhToan;
import bai_thi_md2.models.TaiKhoanTietKiem;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteReadFile {
    public static void writeToFile(String path, ArrayList <TaiKhoanTietKiem> taiKhoanTietKiems) {
        try {
            FileWriter fr = new FileWriter(path);
            BufferedWriter br = new BufferedWriter(fr);
            for (TaiKhoanTietKiem taiKhoan : taiKhoanTietKiems) {
                br.write(taiKhoan.toStringWrite());
                br.newLine();
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("File recording failded!");
        }
    }

    public static void writeToFiles(String path, ArrayList <TaiKhoanThanhToan>  taiKhoanThanhToans) {
        try {
            FileWriter fr = new FileWriter(path);
            BufferedWriter br = new BufferedWriter(fr);
            for (TaiKhoanThanhToan taiKhoan:taiKhoanThanhToans) {
                br.write(taiKhoan.toStringWrite());
                br.newLine();
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("File recording failded!");
        }
    }
}
