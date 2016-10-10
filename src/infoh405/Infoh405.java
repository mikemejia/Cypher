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
       double [] u = {8.17,1.49,2.78,4.25,12.70,2.23,2.02,6.09,6.97,.15,.77,4.03,2.41,6.75,7.51,1.93,
           .09,5.99,6.33,9.06,2.76,.98,2.76,.98,2.36,.15,1.97,.07};
       indexOfC in = new indexOfC();
       double qq = in.indexOfC(u);
       
      System.out.println(qq);
       char [] arr = input1.toCharArray();
       int temp;
       int ans;
       int [] Freq = new int[26];
       double [] Freq2 = new double[26];
       char [] result = new char [arr.length];
      
     System.out.println(6/108);
       for(int i = 0;i<arr.length;i++){
       if(Character.isLetter(arr[i])){
       int t = (int)Character.toLowerCase(arr[i])-97;
       Freq[t]++;
       }
               
       }
       double rate = 0;
       int t = 0;
       for( int g = 0; g<26;g++){
       Freq2[g] = (double)Freq[g]/arr.length;
       
       if( rate < Freq2[g]){
       t=g;
       rate=Freq2[g];
       }
       }
       
                for(int i = 0;i<26;i++){
                   int k = 97+t;
                   int K = 65+t;
                   for (int r = 0; r < arr.length;r++){
                      temp = (int)arr[r];
                      result[r] = arr[r];
                      
                     if(temp >64 && temp < 91) {
                         ans =(temp - K)%26;
                         if(ans < 0) ans = ans + 26;
                         result[r] = (char)(65+ans);
                    }
                      if(temp >96 && temp < 123 ) {
                          ans =(temp - k)%26;
                        if(ans < 0) ans = ans + 26;        
                      result[r] = (char)(ans+97);
                      }
                      
                       
                                                        }
                  
                   
                     
       
        
       }
        

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
