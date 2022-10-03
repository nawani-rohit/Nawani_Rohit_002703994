/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author rohit
 */
public class EmployeeList {
    
    private ArrayList<EmployeeProfile> employeelist;
    
    public EmployeeList() {
        this.employeelist = new ArrayList<EmployeeProfile>();
    }

    public ArrayList<EmployeeProfile> getEmployeelist() {
        return employeelist;
    }

    public void setEmployeelist(ArrayList<EmployeeProfile> employeelist) {
        this.employeelist = employeelist;
    }
    
    public EmployeeProfile addNewEmp(){
        EmployeeProfile newEmp = new EmployeeProfile();
        employeelist.add(newEmp);
        return newEmp;
    }
    
    public void deleteEmp(EmployeeProfile ep){
        employeelist.remove(ep);
    }
    
    public ArrayList<EmployeeProfile> getEmployeeColumn(String jbValue, String searchValue){
        System.out.println(jbValue);
        System.out.println(searchValue);
        
        ArrayList<EmployeeProfile> searchedEmpList = new ArrayList<>();

        if(jbValue.equalsIgnoreCase("Name")){
            for(int i = 0; i < employeelist.size(); i++){
                EmployeeProfile ep = employeelist.get(i);
                if(ep.getEmpName().equalsIgnoreCase(searchValue)){
                    searchedEmpList.add(ep);
                }
            }
        }else
            if(jbValue.equalsIgnoreCase("EmpID")){
            for(int i = 0; i < employeelist.size(); i++){
                EmployeeProfile ep = employeelist.get(i);
                if(ep.getEmpID().equalsIgnoreCase(searchValue)){
                    searchedEmpList.add(ep);
                }
            }
            }
            else if(jbValue.equals("Age")){
                int age = Integer.parseInt(searchValue);
                for(int i = 0; i < employeelist.size(); i++){
                EmployeeProfile ep = employeelist.get(i);
                if(age == ep.getEmpAge()){
                    searchedEmpList.add(ep);
                    System.out.println(searchedEmpList);
                }
            }
            }
            else if(jbValue.equalsIgnoreCase("Gender")){
                for(int i = 0; i < employeelist.size(); i++){
                EmployeeProfile ep = employeelist.get(i);
                if(ep.getEmpGen().equalsIgnoreCase(searchValue)){
                    searchedEmpList.add(ep);
                }
            }
            }
            else if(jbValue.equalsIgnoreCase("Start Date")){
                for(int i = 0; i < employeelist.size(); i++){
                EmployeeProfile ep = employeelist.get(i);
                if(ep.getStartDate().equalsIgnoreCase(searchValue)){
                    searchedEmpList.add(ep);
                }
            }
            }
            else if(jbValue.equalsIgnoreCase("Level")){
                for(int i = 0; i < employeelist.size(); i++){
                EmployeeProfile ep = employeelist.get(i);
                if(ep.getLevel().equalsIgnoreCase(searchValue)){
                    searchedEmpList.add(ep);
                }
            }
            }
            else if(jbValue.equalsIgnoreCase("Team Info")){
                for(int i = 0; i < employeelist.size(); i++){
                EmployeeProfile ep = employeelist.get(i);
                if(ep.getTeamInfo().equalsIgnoreCase(searchValue)){
                    searchedEmpList.add(ep);
                }
            }
            }
            else if(jbValue.equalsIgnoreCase("Position")){
                for(int i = 0; i < employeelist.size(); i++){
                EmployeeProfile ep = employeelist.get(i);
                if(ep.getEmpPos().equalsIgnoreCase(searchValue)){
                    searchedEmpList.add(ep);
                }
            }
            }
            else if(jbValue.equalsIgnoreCase("Phone")){
                for(int i = 0; i < employeelist.size(); i++){
                EmployeeProfile ep = employeelist.get(i);
                if(ep.getPhoneNumber().equalsIgnoreCase(searchValue)){
                    searchedEmpList.add(ep);
                }
            }
            }
            else if(jbValue.equalsIgnoreCase("Email")){
                for(int i = 0; i < employeelist.size(); i++){
                EmployeeProfile ep = employeelist.get(i);
                if(ep.getEmpEmail().equalsIgnoreCase(searchValue)){
                    searchedEmpList.add(ep);
                }
            }
            }
        return searchedEmpList;
    }
}
