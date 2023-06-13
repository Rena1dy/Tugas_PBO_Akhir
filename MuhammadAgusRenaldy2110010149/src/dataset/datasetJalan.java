package dataset;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author ACER
 */
public class datasetJalan  {
    private ArrayList<String> id;
    private ArrayList<String> namajln;
    private ArrayList<String> latiutde;
    private ArrayList<String> longitude;
    
    public datasetJalan() {
        id = new ArrayList<>();
        namajln = new ArrayList<>();
        latiutde = new ArrayList<>();
        longitude = new ArrayList<>();
    }
  
    public void addId(String value){
        this.id.add(value);
    }
    
    public ArrayList<String> getDataId(){
        return this.id;
    }
    
    public void addNamajln(String value){
        this.namajln.add(value);
    }
    
    public ArrayList<String> getDataNamajln(){
        return this.namajln;
    }     
    
    public void addLatiutde(String value){
        this.latiutde.add(value);
    }
    
    public ArrayList<String> getDataLatiutde(){
        return this.latiutde;
    }
    
    public void addLongitude(String value){
        this.longitude.add(value);
    }
    
    public ArrayList<String> getDataLongitude(){
        return this.longitude;
    }
}
