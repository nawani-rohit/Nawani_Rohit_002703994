/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.util.ArrayList;


/**
 *
 * @author rinki
 */
public class Hospital extends Community implements Doctor_Directory{
    String hospitalUUID, hospitalID, hospitalName, hospitalAddress, cityName,  adminusername, adminpassword, hospitalCommunity;
    int hospitalPincode;
    ArrayList<Doctor> Doctor_Directory = new ArrayList<>();
    ArrayList<Patient> Patient_Directory = new ArrayList<>();
    

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

    public ArrayList<Doctor> getWorkingdoctorsArrayList() {
        return Doctor_Directory;
    }

    public void setWorkingdoctorsArrayList(ArrayList<Doctor> workingdoctorsArrayList) {
        this.Doctor_Directory = workingdoctorsArrayList;
    }

    public ArrayList<Patient> getEnrolledPatientsArrayList() {
        return Patient_Directory;
    }

    public void setEnrolledPatientsArrayList(ArrayList<Patient> enrolledPatientsArrayList) {
        this.Patient_Directory = enrolledPatientsArrayList;
    }
    public String getHospitalID() {
        return hospitalID;
    }

    public void setHospitalID(String hospitalID) {
        this.hospitalID = hospitalID;
    }

    public String getHospitalUUID() {
        return hospitalUUID;
    }

    public void setHospitalUUID(String hospitalUUID) {
        this.hospitalUUID = hospitalUUID;
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

    public String getHospitalCity() {
        return cityName;
    }

    public void setHospitalCity(String hospitalCity) {
        this.cityName = hospitalCity;
    }

    public int getHospitalPincode() {
        return hospitalPincode;
    }

    public void setHospitalPincode(int hospitalPincode) {
        this.hospitalPincode = hospitalPincode;
    }

    public  String getHospitalCommunity() {
        return hospitalCommunity;
    }

    public  void setHospitalCommunity(String hospitalCommunity) {
        this.hospitalCommunity = hospitalCommunity;
    }

   
    
}
