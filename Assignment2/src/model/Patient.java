/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class Patient extends HouseAddress{
    String patientUnqID, patientId, patientName, patientPhone,  patientPincode, hospitalUnqID, patientHospitalID, patientHospitalName, doctorUnqID, doctorId, doctorName, password;
    ArrayList<EncounterDetails> EncounterHistory = new ArrayList<>();

    public String getPatientUnqID() {
        return patientUnqID;
    }

    public void setPatientUnqID(String patientUnqID) {
        this.patientUnqID = patientUnqID;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientPhone() {
        return patientPhone;
    }

    public void setPatientPhone(String patientPhone) {
        this.patientPhone = patientPhone;
    }

    public String getPatientPincode() {
        return patientPincode;
    }

    public void setPatientPincode(String patientPincode) {
        this.patientPincode = patientPincode;
    }

    public String getHospitalUnqID() {
        return hospitalUnqID;
    }

    public void setHospitalUnqID(String hospitalUnqID) {
        this.hospitalUnqID = hospitalUnqID;
    }

    public String getPatientHospitalID() {
        return patientHospitalID;
    }

    public void setPatientHospitalID(String patientHospitalID) {
        this.patientHospitalID = patientHospitalID;
    }

    public String getPatientHospitalName() {
        return patientHospitalName;
    }

    public void setPatientHospitalName(String patientHospitalName) {
        this.patientHospitalName = patientHospitalName;
    }

    public String getDoctorUnqID() {
        return doctorUnqID;
    }

    public void setDoctorUnqID(String doctorUnqID) {
        this.doctorUnqID = doctorUnqID;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<EncounterDetails> getEncounterHistory() {
        return EncounterHistory;
    }

    public void setEncounterHistory(ArrayList<EncounterDetails> encounterArrayList) {
        this.EncounterHistory = encounterArrayList;
    }
    
    
}
