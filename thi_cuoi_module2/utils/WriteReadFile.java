package thi_cuoi_module2.utils;

import thi_cuoi_module2.models.BenhAnThuong;
import thi_cuoi_module2.models.BenhAnVip;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteReadFile {
    public static void writeToFile (String path, ArrayList<BenhAnVip> benhAnVips){
        try {
            FileWriter fr = new FileWriter(path);
            BufferedWriter br = new BufferedWriter(fr);
            for (BenhAnVip benhAn : benhAnVips){
                br.write(benhAn.toStringWrite());
                br.newLine();
            }
            br.close();
            fr.close();
        } catch (IOException e){
            System.out.println("File recording failded ! ");
        }
    }
    public static void writeToFiles(String path, ArrayList<BenhAnThuong>benhAnThuongs){
        try {
            FileWriter fr = new FileWriter(path);
            BufferedWriter br = new BufferedWriter(fr);
            for (BenhAnThuong benhAn : benhAnThuongs){
                br.write(benhAn.toStringWrite());
                br.newLine();
            }
            br.close();
            fr.close();
        } catch (IOException e){
            System.out.println("File recording failded ! ");
        }
    }
}
