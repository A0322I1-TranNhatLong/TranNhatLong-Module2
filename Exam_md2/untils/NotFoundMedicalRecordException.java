package Exam_md2.untils;

public class NotFoundMedicalRecordException extends Exception{
    public void showMessage(){
        System.out.println("NotFoundMedicalRecordException : Bệnh án không tồn tại ! ");
    }
}
