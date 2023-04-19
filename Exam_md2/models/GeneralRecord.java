package Exam_md2.models;

import java.time.LocalDate;

public class GeneralRecord extends  MedicalRecord{
    private int fee;
    public GeneralRecord(){

    }



    public GeneralRecord(int fee) {
        this.fee = fee;
    }

    public GeneralRecord(int serial, String medicalCode, String patienCode, String name, LocalDate inDate, LocalDate outDate, String reason, int fee) {
        super(serial, medicalCode, patienCode, name, inDate, outDate, reason);
        this.fee = fee;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }
    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s",getSerial(),getMedicalCode(),getPatienCode(),getName(),getDateStr(getInDate()),getDateStr(getOutDate()),getReason(),getFee());
    }

    @Override
    public String toString() {
        return  super.toString()+
                ",GeneralRecord{" +
                "fee=" + fee +
                '}';
    }
}
