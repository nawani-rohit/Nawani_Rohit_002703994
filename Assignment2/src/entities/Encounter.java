/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author rinki
 */
public class Encounter {
String encounterUUId, timestamp, patientID, patientUUID, patientName, bloodpressure, temperature;

    public String getPatientID() {
        return patientID;
    }

    public String getBloodpressure() {
        return bloodpressure;
    }

    public void setBloodpressure(String bloodpressure) {
        this.bloodpressure = bloodpressure;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getPatientUUID() {
        return patientUUID;
    }

    public void setPatientUUID(String patientUUID) {
        this.patientUUID = patientUUID;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getEncounterUUId() {
        return encounterUUId;
    }

    public void setEncounterUUId(String encounterUUId) {
        this.encounterUUId = encounterUUId;
    }

    

    public String getTimestamp() {
        return timestamp;
    }

    public void settimeStamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
