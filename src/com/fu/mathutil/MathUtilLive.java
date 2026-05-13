/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.fu.mathutil;

/**
 *
 * @author vinhh
 */
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       long result =  MathUtil.getFactiorial(5); // hàm tính đi coi là mấy 
        System.out.println("5! = 120; actual"+ result);
        // kĩ thuật kiểm thử phần mềm : ouwsc lượng xem giá trị của hàm là gì
       //expected value : 5! = 120
       // mày/ hàm ai đó viết khi chạy thực tế là mấy - actual , giả sử 120
       // if expected -- actual , hàm ngon trong tình huống này
       
       // them code sau lan dau tien lam chuyen ay - code len sever 14:534 PM 15/3/2026
       
         System.out.println("expected 0! =  0 actual :"+ MathUtil.getFactiorial(1));
         System.out.println("expected 3! = 6 actual :"+ MathUtil.getFactiorial(1));
           System.out.println("expected 3! = 6 actual :"+ MathUtil.getFactiorial(1));
  
    }
    
}
