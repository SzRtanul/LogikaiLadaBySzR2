/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program;

import model.Lada;
import controller.LadaControl;
import view.LadaGUIview;

/**
 *
 * @author szabo.roland
 */
public class LogikaiLadaBySzR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new LadaControl(new Lada(), new LadaGUIview());
    }
    
}
