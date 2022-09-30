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
}
