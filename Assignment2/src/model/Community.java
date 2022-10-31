/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author hp
 */
public class Community extends City{
    static String hospitalCommunity;

    public String getHospitalCommunity() {
        return hospitalCommunity;
    }

    public void setHospitalCommunity(String hospitalCommunity) {
        Community.hospitalCommunity = hospitalCommunity;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        City.cityName = cityName;
    }
    
    
}
