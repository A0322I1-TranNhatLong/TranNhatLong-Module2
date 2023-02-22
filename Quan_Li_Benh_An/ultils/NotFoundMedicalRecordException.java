package Quan_Li_Benh_An.ultils;

public class NotFoundMedicalRecordException extends Exception{
    public void showMessage() {
        System.out.println("NotFoundMedicalRecordException: Bệnh án không tồn tại!");
    }
}
