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
    int valasztott;
    
    public Lada(){
        this.ladak = new String[]{
            "Arany;Én rejtem a kincset",
            "Ezüst;Nem én rejtem a kincset",
            "Bronz;Az arany hazudik",
        };
        this.megfejtve=false;
        this.megfejtes=1;
        this.valasztott=-1;
    }
    
    public boolean doValaszt(int ladaszam){
        boolean both = ladaszam > -1 && ladaszam < ladak.length && valasztott == -1;
        if(both){
            this.valasztott = ladaszam;
            this.megfejtve = this.megfejtes == ladaszam;
            System.out.println(Integer.toBinaryString(-3));
        }
        return this.megfejtve;
    }
    
    public int getValasztott(){
        return this.valasztott;
    }
    
    public String[] getLadak(){
        return Arrays.copyOf(ladak, ladak.length);
    }
    
    public boolean getMegfejtve(){
        return this.megfejtve;
    }
    
    public int getMegfejtes(){
        return valasztott != -1 ? megfejtes : -1;
    }
}
