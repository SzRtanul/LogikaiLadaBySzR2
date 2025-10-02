/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author szabo.roland
 */
public class Lada {
    String[] ladak;
    int megfejtes;
    int menet = 0;
    
    public Lada(){
        this.ladak = new String[]{
            "Arany;Én rejtem a kincset",
            "Ezüst;Nem én rejtem a kincset",
            "Bronz;Az arany hazudik",
        };
        this.megfejtes=1;
    }
}
