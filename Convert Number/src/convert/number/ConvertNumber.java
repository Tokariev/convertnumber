/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convert.number;

/**
 *
 * @author Dream
 */
public class ConvertNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int result = pow(2, 7);
        System.out.print(result);
        
    }
    public static int pow(int x, int n) {
        if (n != 1){ // пока n != 1, сводить вычисление pow(x,n) к pow(x,n-1)
            return x * pow(x, n - 1);
        } else {
            return x;
        }
    }
    
}
