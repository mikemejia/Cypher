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
public class Caesar_Freq {
    public char [] Caesar_Freq(String input1){
    char [] arr = input1.toCharArray();
       int temp;
       int ans;
       int [] Freq = new int[26];
       double [] Freq2 = new double[26];
       char [] result = new char [arr.length];
      
     
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
               return result;
    }
}
