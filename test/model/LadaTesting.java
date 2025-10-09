/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


/**
 *
 * @author SzabóRoland(SZF_2024
 */
public class LadaTesting {
    public static void main(String[] args){
        Lada lada = new Lada();
        String[] ladak = lada.getLadak();
        int len = ladak.length;
        // Első teszteset
        assert len == 3;
        // Második teszteset
        int van = 0;
        int isTrue = 0;
        for (int i = 0; i < len; i++) {
            lada.init();
            lada.doValaszt(i);
            van += lada.getMegfejtve() ? 1 : 0;
            isTrue += lada.getMegfejtes() == -1 ? 1 : 0;
        }
        assert van == 1;
        assert isTrue == 0;
        // Harmadik teszteset
        for (int i = 0; i < len; i++) {
            assert ladak[i].split(";").length > 1;
        }
        // Negyedik teszteset
        int[] falseErtekek = new int[]{
            -1 ,-2, -3, 3, 4, 5, 6
        };
        boolean isFalse = true;
        for (int i = 0; i < falseErtekek.length && isFalse; i++) {
            lada.init();
            lada.doValaszt(falseErtekek[i]);
            isFalse = lada.getMegfejtes() == -1;
        }
        assert isFalse;
    }
}
