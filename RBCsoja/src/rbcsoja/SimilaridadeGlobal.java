/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rbcsoja;

/**
 *
 * @author mayla
 */
public class SimilaridadeGlobal {
    public double SimilaridadeGlobal(int parcial,double ext, double crop, double sev, double germ, double log, double stem, double rot){
        double global;
        global=(parcial+(ext*7)+(crop*1)+(germ*1)+(log*6)+(stem*8)+(rot*8))/214;
        return global;
    }
}
