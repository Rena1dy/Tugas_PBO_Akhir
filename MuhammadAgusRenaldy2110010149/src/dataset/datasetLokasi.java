/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;

import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class datasetLokasi {
    private ArrayList<String> idlok;
    private ArrayList<String> idjal;
    private ArrayList<String> namlok;
    private ArrayList<String> latiutde;
    private ArrayList<String> longiutde;
    
     public datasetLokasi() {
        idlok = new ArrayList<>();
        idjal = new ArrayList<>();
        namlok = new ArrayList<>();
        latiutde = new ArrayList<>();
        longiutde = new ArrayList<>();
     }

    public void addIdlok(String value){
        this.idlok.add(value);
    }
    
    public ArrayList<String> getDataIdlok(){
        return this.idlok;
    }
    
    public void addIdjal(String value){
        this.idjal.add(value);
    }
    
    public ArrayList<String> getDataIdjal(){
        return this.idjal;
    }    
    
    public void addNamlok(String value){
        this.namlok.add(value);
    }
    
    public ArrayList<String> getDataNamlok(){
        return this.namlok;
    }
    
    public void addLatiutde(String value){
        this.latiutde.add(value);
    }
    
    public ArrayList<String> getDataLatiutde(){
        return this.latiutde;
    }
    
    public void addLongiutde(String value){
        this.longiutde.add(value);
    }
    
    public ArrayList<String> getDataLongiutde(){
        return this.longiutde;
    }
}
