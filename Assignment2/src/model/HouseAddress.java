/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author hp
 */
public class HouseAddress {
    static String patientAddress;

    public static String getPatientAddress() {
        return patientAddress;
    }

    public static void setPatientAddress(String patientAddress) {
        HouseAddress.patientAddress = patientAddress;
    }
}
