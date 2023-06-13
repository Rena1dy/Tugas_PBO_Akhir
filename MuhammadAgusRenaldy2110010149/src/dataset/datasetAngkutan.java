package dataset;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class datasetAngkutan {
    private ArrayList<String> idangku;
    private ArrayList<String> namaangku;
            
    public datasetAngkutan() {
        idangku = new ArrayList<>();
        namaangku = new ArrayList<>();
    }
    public void addIdangku(String value){
        this.idangku.add(value);
    }
    
    public ArrayList<String> getDataIdangku(){
        return this.idangku;
    }
    
    public void addNamaangku(String value){
        this.namaangku.add(value);
    }
    
    public ArrayList<String> getDataNamaangku(){
        return this.namaangku;
    }
    
}
