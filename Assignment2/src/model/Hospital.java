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
public class Hospital extends Community implements DoctorHistory{
    String hospitalUnqID, hospitalID, hospitalName, hospitalAddress, cityName,  adminusername, adminpassword, hospitalCommunity;
    int hospitalPincode;
    ArrayList<Doctor> DoctorHistory = new ArrayList<>();
    ArrayList<Patient> PatientHistory = new ArrayList<>();

    public String getHospitalUnqID() {
        return hospitalUnqID;
    }

    public void setHospitalUnqID(String hospitalUnqID) {
        this.hospitalUnqID = hospitalUnqID;
    }

    public String getHospitalID() {
        return hospitalID;
    }

    public void setHospitalID(String hospitalID) {
        this.hospitalID = hospitalID;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getAdminusername() {
        return adminusername;
    }

    public void setAdminusername(String adminusername) {
        this.adminusername = adminusername;
    }

    public String getAdminpassword() {
        return adminpassword;
    }

    public void setAdminpassword(String adminpassword) {
        this.adminpassword = adminpassword;
    }

    public String getHospitalCommunity() {
        return hospitalCommunity;
    }

    public void setHospitalCommunity(String hospitalCommunity) {
        this.hospitalCommunity = hospitalCommunity;
    }

    public int getHospitalPincode() {
        return hospitalPincode;
    }

    public void setHospitalPincode(int hospitalPincode) {
        this.hospitalPincode = hospitalPincode;
    }

    public ArrayList<Doctor> getDoctor_Directory() {
        return DoctorHistory;
    }

    public void setDoctor_Directory(ArrayList<Doctor> doctorsArrayList) {
        this.DoctorHistory = doctorsArrayList;
    }

    public ArrayList<Patient> getPatient_Directory() {
        return PatientHistory;
    }

    public void setPatient_Directory(ArrayList<Patient> patientsArrayList) {
        this.PatientHistory = patientsArrayList;
    }   
}
