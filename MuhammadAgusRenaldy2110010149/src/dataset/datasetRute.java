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
public class datasetRute {
    private ArrayList<String> idrut;
    private ArrayList<String> idjal;
    private ArrayList<String> idangku;
    
     public datasetRute() {
             idrut = new ArrayList<>();
             idjal = new ArrayList<>();
             idangku = new ArrayList<>();
     }
    public void addIdrut(String value){
        this.idrut.add(value);
    }
    
    public ArrayList<String> getDataIdrut(){
        return this.idrut;
    }
    
    public void addIdjal(String value){
        this.idjal.add(value);
    }
    
    public ArrayList<String> getDataIdjal(){
        return this.idjal;
    }
    public void addIdangku(String value){
        this.idangku.add(value);
    }
    
    public ArrayList<String> getDataIdangku(){
        return this.idangku;
    }
    
}
