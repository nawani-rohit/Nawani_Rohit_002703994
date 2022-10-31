/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author hp
 */
public class EncounterDetails {
    String encounterDetailsUnqId, timestamp, patientID, patientUnqID, patientName, bp, temp;

    public String getEncounterDetailsUnqId() {
        return encounterDetailsUnqId;
    }

    public void setEncounterDetailsUnqId(String encounterDetailsUnqId) {
        this.encounterDetailsUnqId = encounterDetailsUnqId;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getPatientUnqID() {
        return patientUnqID;
    }

    public void setPatientUnqID(String patientUnqID) {
        this.patientUnqID = patientUnqID;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getBp() {
        return bp;
    }

    public void setBp(String bp) {
        this.bp = bp;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }
}
