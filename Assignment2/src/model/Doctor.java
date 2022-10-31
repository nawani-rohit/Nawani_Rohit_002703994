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
public class Doctor {
    String hospitalUnqID, hospitalId, hospitalName, doctorUnqID, doctorId, doctorName, doctorPhone, password;
    ArrayList<Patient> assignedPatients = new ArrayList<>();
    public String getHospitalUnqID() {
        return hospitalUnqID;
    }

    public void setHospitalUnqID(String hospitalUnqID) {
        this.hospitalUnqID = hospitalUnqID;
    }

    public String getDoctorUnqID() {
        return doctorUnqID;
    }

    public void setDoctorUnqID(String doctorUnqID) {
        this.doctorUnqID = doctorUnqID;
    }

    
    
    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
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

    public String getDoctorPhone() {
        return doctorPhone;
    }

    public void setDoctorPhone(String doctorPhone) {
        this.doctorPhone = doctorPhone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public ArrayList<Patient> getAssignedPatients() {
        return assignedPatients;
    }

    public void setAssignedPatients(ArrayList<Patient> assignedPatients) {
        this.assignedPatients = assignedPatients;
    }
}
