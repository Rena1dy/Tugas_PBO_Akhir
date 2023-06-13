/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammadagusrenaldy2110010149;

import dataset.datasetRute;
import dataset.datasetLokasi;
import dataset.datasetLogin;
import dataset.datasetJalan;
import dataset.datasetAngkutan;

/**
 *
 * @author ACER
 */
public class MuhammadAgusRenaldy2110010149 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        datasetJalan obj = new datasetJalan ();
        
        obj.addId("");
        obj.addNamajln("");
        obj.addLatiutde("");
        obj.addLongitude("");
        System.out.println("id : "+obj.getDataId()+"\n namajln :"  +obj.getDataNamajln()+"\n latiutde :" +obj.getDataLatiutde()+"\n longitude :"+obj.getDataLongitude());
    
    }
    public static void main2(String[] args) {
        // TODO code application logic here
        datasetAngkutan obj = new datasetAngkutan ();
        
        obj.addIdangku("12");
        obj.addNamaangku("budi");
        
        System.out.println("id : "+obj.getDataIdangku()+"\n namajln :"  +obj.getDataNamaangku());
    }
    
    public static void main3(String[] args) {
        // TODO code application logic here
        datasetLogin obj = new datasetLogin ();
        
        obj.addUsername("");
        obj.addPassword("");
        
        System.out.println("username : "+obj.getDataUsername()+"\n password :"  +obj.getDataPassword());
    }
    
        public static void main4(String[] args) {
        // TODO code application logic here
        datasetLokasi obj = new datasetLokasi ();
        
        obj.addIdlok("4");
        obj.addIdjal("3");
        obj.addNamlok("Jawa");
        obj.addLatiutde("-");
        obj.addLongiutde("-");

       System.out.println("idlok : "+ obj.getDataIdlok()+"\n idjal :"  + obj.getDataIdjal()+"\n namlok :" + obj.getDataNamlok()+"\n latiutde :" + obj.getDataLatiutde()+"\n longiutde :" + obj.getDataLongiutde());        
    }
        
            public static void main5(String[] args) {
        // TODO code application logic here
        datasetRute obj = new datasetRute ();
        
        obj.addIdrut("2");
        obj.addIdjal("5");
        obj.addIdangku("3");
        
        System.out.println("idrut : "+obj.getDataIdrut()+"\n idjal :"  +obj.getDataIdjal()+"\n idangku:" +obj.getDataIdangku());
    }
}
