/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fu.mathutil;

/**
 *
 * @author vinhh
 */
public class MathUtil {
    
    
    public static long getFactiorial(int n){
            if(n< 0 || n > 20 ){
                throw new IllegalArgumentException("Invalid argument. n must be between 0 and 20");
            }
            // hàm dưng không cần return
           // xuống là n =  0...20 r;
            // dừng ngay khi n đặc biệt 
           
           // xuống đến đây , n = 2.20
           long product = 1;
           for (int i = 2; i <= n; i++) 
            product = product *=i;
        
            
           return product;
           
    }
}
