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
public class Infoh405 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String input1 = "Fbzr crbcyr jrne Fhcrezna cnwnznf. Fhcrezna jrnef Puhpx Abeevf cnwnznf.";
       String input2 = "prtdfrlytyifgpzxdrowkukakfuotrmqotjtrrikmfglvgrtodmf\n" +
"gnugxrtlvdrcvrwxezxvunvsizhvpdxgvwwiikmhyiexkkwfvoji\n" +
"kwsuplpdzifrlymfvhzhrrhremiqsicplungirvlvprtdfrlyszx\n" +
"xgtvhrttyiuovvvwnadivzhvglzyzwykrpsojaehekalxllucmwc\n" +
"ajjranuigsoiiwnaexzutysxyaehbkaiwdmo";
       double [] u = {8.17,1.49,2.78,4.25,12.70,2.23,2.02,6.09,6.97,.15,.77,4.03,2.41,6.75,7.51,1.93,
           .09,5.99,6.33,9.06,2.76,.98,2.76,.98,2.36,.15,1.97,.07};
       indexOfC in = new indexOfC();
       Caesar_Freq fq= new Caesar_Freq();
       Kasiski KN = new Kasiski();
       int gcd;
        gcd = KN.Kasiski(input2,"rt");
       char [] result = fq.Caesar_Freq(input1);
       
       double qq = in.indexOfC(u);
       
      
      
        

// TODO code application logic here
    }
    
    public double indexOfC (Double [] G){
        double k = 0.0;
        for(int i =0;i<G.length;i++){
        k = k + Math.pow(G[i],2);
        }
    
    return k;
    }
    
}
