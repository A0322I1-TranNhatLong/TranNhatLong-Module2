package Exam_md2.models;

import java.time.LocalDate;

public class VipRecord extends MedicalRecord{
    private String type;
    private LocalDate duration;
    public VipRecord(){ }



    public VipRecord(String type, LocalDate duration) {
        this.type = type;
        this.duration = duration;
    }

    public VipRecord(int serial, String medicalCode, String patienCode, String name, LocalDate inDate, LocalDate outDate, String reason, String type, LocalDate duration) {
        super(serial, medicalCode, patienCode, name, inDate, outDate, reason);
        this.type = type;
        this.duration = duration;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getDuration() {
        return duration;
    }

    public void setDuration(LocalDate duration) {
        this.duration = duration;
    }
    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s",getSerial(),getMedicalCode(),getPatienCode(),getName(),getDateStr(getInDate()),getDateStr(getOutDate()),getReason(),getType(),getDateStr(getDuration()));
    }


    @Override
    public String toString() {
        return super.toString()+
                ",VipRecord{" +
                "type='" + type + '\'' +
                ", duration=" + duration +
                '}';
    }
}
