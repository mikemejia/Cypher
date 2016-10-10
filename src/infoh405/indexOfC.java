/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infoh405;

/**
 *
 * @author Mike
 */
class indexOfC {
    
    public double indexOfC(double G[]){
     double k = 0.0;
        for(int i =0;i<G.length;i++){
        double percent = G[i]/100;
        k = k + Math.pow(percent,2);
        }
    
    return k;
    
    }
    
}
