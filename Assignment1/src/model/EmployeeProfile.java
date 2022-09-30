/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author rohit
 */
public class EmployeeProfile {
    
    private String Name;
    private String EmpID;
    private int EmpAge;
    private String EmpGen;
    private String StartDate;
    private int level;
    private String TeamInfo;
    private String EmpPos;
    private int PhoneNumber;
    private String EmpEmail;
    private String photo;

    public String getEmpName() {
        return Name;
    }

    public void setEmpName(String EmpName) {
        this.Name = EmpName;
    }

    public String getEmpID() {
        return EmpID;
    }

    public void setEmpID(String EmpID) {
        this.EmpID = EmpID;
    }

    public int getEmpAge() {
        return EmpAge;
    }

    public void setEmpAge(int EmpAge) {
        this.EmpAge = EmpAge;
    }

    public String getEmpGen() {
        return EmpGen;
    }

    public void setEmpGen(String EmpGen) {
        this.EmpGen = EmpGen;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getTeamInfo() {
        return TeamInfo;
    }

    public void setTeamInfo(String TeamInfo) {
        this.TeamInfo = TeamInfo;
    }

    public String getEmpPos() {
        return EmpPos;
    }

    public void setEmpPos(String EmpPos) {
        this.EmpPos = EmpPos;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getEmpEmail() {
        return EmpEmail;
    }

    public void setEmpEmail(String EmpEmail) {
        this.EmpEmail = EmpEmail;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
    
    @Override
    public String toString(){
        return Name;
    }
}
