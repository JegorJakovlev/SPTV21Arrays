/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv21arrays;

import java.util.Random;

/**
 *
 * @author User
 */
public class SPTV21Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("------------ Demo arrays --------------");
        int[] arr1 = new int[10];
        Random random = new Random();
        for(int i = 0; i<arr1.length; i++){
            arr1[i] = random.nextInt(10);
            
        }
        int sum = 0;
        for(int i = 0;i<arr1.length;i++){
            System.out.printf("%2d,",arr1[i]);
            sum += arr1[i];
            
        }
        System.out.print("]");
        System.out.println();
        System.out.println("sum = "+sum);
        
        float num1 = 0;
        int num2 =10;
                System.out.println("Большое число: " + Math.max(num1,num2));
                System.out.println("Меньшие число: " + Math.min(num1,num2));
    }
    
}
