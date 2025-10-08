/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Lada;
import modelsforview.LadaItem;
import view.LadaGUIview;

/**
 *
 * @author szabo.roland
 */
public class LadaControl {
    public LadaControl(Lada model, LadaGUIview view){
        view.doMegjelen(model);
        LadaItem[] items = view.getLadak();
        for (int i = 0; i < items.length; i++) {
            final int it = i;
            items[i].addKinyitActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    model.doValaszt(-2);
                    view.doLadatNyit(model.getValasztott(), model.getMegfejtve());
                    view.doLadatNyit(model.getMegfejtes(), true);
                }
            });
        }
        
    }
}
