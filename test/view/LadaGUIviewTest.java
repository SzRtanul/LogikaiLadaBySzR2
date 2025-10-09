/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.LadaControl;
import model.Lada;
import modelsforview.LadaItem;

/**
 *
 * @author szabo.roland
 */
public class LadaGUIviewTest {
    public static void main(String[] args){
        LadaGUIview gui = new LadaGUIview();
        new LadaControl(new Lada(), gui);
        LadaItem[] ladak = gui.getLadak();
        ladak[0].getBt_kinyit().doClick();
    }
}
