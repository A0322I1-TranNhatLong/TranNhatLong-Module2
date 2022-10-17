package bai_thi.utils;

import bai_thi.models.DienThoaiChinhHang;
import bai_thi.models.DienThoaiXachTay;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteReadFile {
    public static void writeToFile(String path, ArrayList<DienThoaiChinhHang> dienThoaiChinhHangs) {
        try {
            FileWriter fr = new FileWriter(path);
            BufferedWriter br = new BufferedWriter(fr);
            for (DienThoaiChinhHang dienThoai:dienThoaiChinhHangs) {
                br.write(dienThoai.toStringWrite());
                br.newLine();
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("File recording failed!");
        }
    }

    public static void writeToFiles(String path, ArrayList<DienThoaiXachTay> dienThoaiXachTays) {
        try {
            FileWriter fr = new FileWriter(path);
            BufferedWriter br = new BufferedWriter(fr);
            for (DienThoaiXachTay dienThoai:dienThoaiXachTays) {
                br.write(dienThoai.toStringWrite());
                br.newLine();
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("File recording failed!");
        }
    }
}
