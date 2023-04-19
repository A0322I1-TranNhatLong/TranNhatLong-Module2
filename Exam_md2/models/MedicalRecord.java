package Exam_md2.models;

import java.time.LocalDate;

public abstract class MedicalRecord {
    private int serial;
    private String medicalCode;
    private String patienCode;
    private String name;
    private LocalDate inDate;
    private LocalDate outDate;
    private String reason;

    public MedicalRecord() {

    }

    public MedicalRecord(int serial, String medicalCode, String patienCode, String name, LocalDate inDate, LocalDate outDate, String reason) {
        this.serial = serial;
        this.medicalCode = medicalCode;
        this.patienCode = patienCode;
        this.name = name;
        this.inDate = inDate;
        this.outDate = outDate;
        this.reason = reason;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public String getMedicalCode() {
        return medicalCode;
    }

    public void setMedicalCode(String medicalCode) {
        this.medicalCode = medicalCode;
    }

    public String getPatienCode() {
        return patienCode;
    }

    public void setPatienCode(String patienCode) {
        this.patienCode = patienCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getInDate() {
        return inDate;
    }

    public void setInDate(LocalDate inDate) {
        this.inDate = inDate;
    }

    public LocalDate getOutDate() {
        return outDate;
    }

    public void setOutDate(LocalDate outDate) {
        this.outDate = outDate;
    }

    public String getReason() {
        return reason;
    }

    public String getDateStr(LocalDate date) {
        String[] dateArr = String.format("%s", date).split("-");
        return dateArr[2] + "/" + dateArr[1] + "/" + dateArr[0];
    }

    public abstract String getInfo();

    @Override
    public String toString() {
        return "MedicalRecord{" +
                "serial=" + serial +
                ", medicalCode='" + medicalCode + '\'' +
                ", patienCode='" + patienCode + '\'' +
                ", name='" + name + '\'' +
                ", inDate=" + inDate +
                ", outDate=" + outDate +
                ", reason='" + reason + '\'' +
                '}';
    }
}
