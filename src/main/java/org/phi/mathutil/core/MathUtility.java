/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.phi.mathutil.core;

/**
 *
 * @author ACER
 */
public class MathUtility {
    public static long getFactorial(int n){
        //TODO...
        long product = 1;
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Inavlid n. n must be between 0,..,20");
        }
        if (n == 0 || n == 1 )
            return 1;
        for (int i = 2; i <= n; i++)
            product *= i;
        
        return product;
    }
    //return sớm để hàm ko báo lỗi
    public static final double PI = 3.1415;
}
