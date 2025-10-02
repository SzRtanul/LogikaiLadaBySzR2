/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author szabo.roland
 */
public class Lada {
    String[] ladak;
    boolean megfejtve;
    int megfejtes;
    int menet;
    
    public Lada(){
        this.ladak = new String[]{
            "Arany;Én rejtem a kincset",
            "Ezüst;Nem én rejtem a kincset",
            "Bronz;Az arany hazudik",
        };
        this.megfejtve=false;
        this.megfejtes=1;
        this.menet=0;
    }
    
    public boolean doValaszt(int ladaszam){
        if(!this.megfejtve || this.menet < ladak.length){
            menet++;
            megfejtve=this.megfejtes==ladaszam;
        }
        return false;
    }
    
    String[] getLadak(){
        return Arrays.copyOf(ladak, ladak.length);
    }
    
    public boolean getMegfejtve(){
        return this.megfejtve;
    }
    
    public int getMegfejtes(){
        boolean both = this.megfejtve || this.menet >= ladak.length;
        return both ? megfejtes : -1;
    }
}
