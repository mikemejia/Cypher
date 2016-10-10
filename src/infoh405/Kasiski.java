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
public class Kasiski {
    public int Kasiski (String input, String comp){
        char [] arr = input.toCharArray();
        int gcd = 0;
        int point = 0;
        int Counter= 1;
        
        String test = "";
        
        
        
        for(int i = 0;i<arr.length;i++){
            test = test + String.valueOf(arr[i]);
            
            if(Counter == comp.length()){
                if(test.matches(comp)){
                    point = i;
                    System.out.println(i);
                    test =String.valueOf(arr[i]);
                    Counter = 1;
                    Counter++;
                }
                else{
                    test = String.valueOf(arr[i]);;
                    Counter = 1;
                    Counter++;
                }
            }
            else 
                Counter++;
        
        
        }
    System.out.print(point);
    return gcd;
    }
    
}
