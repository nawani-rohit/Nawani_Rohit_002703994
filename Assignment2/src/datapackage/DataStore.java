/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datapackage;

import model.Hospital;
import model.Person;
import model.User;
import java.util.ArrayList;
//import java.util.UnqID;

/**
 *
 * @author hp
 */
public class DataStore {
    public static ArrayList<Hospital> hospital_Screen_HospitalArrayList = new ArrayList<>();
    public static ArrayList<Person> person_registration_ArrayList = new ArrayList<>();
    public static ArrayList<User> userArrayList = new ArrayList<>();
    public static String ROLE = "";
    public static String USR_ID = "";
    public static String DOC_HOSID = "";
    
//    public static String generateUnqID() {
//        return UnqID.randomUnqID().toString();
//    }
}
