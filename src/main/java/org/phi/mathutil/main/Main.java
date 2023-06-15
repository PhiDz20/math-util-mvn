/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.phi.mathutil.main;

import org.phi.mathutil.core.MathUtility;

/**
 *
 * @author ACER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Test case 1: n = 0
        System.out.println("Check getF(0) expected: 1 | actual: " + MathUtility.getFactorial(0));
        //Test case 2: n = 1
        System.out.println("Check getF(1) expected: 1 | actual: " + MathUtility.getFactorial(1));
        //Test case 3: n = 2
        System.out.println("Check getF(2) expected: 2 | actual: " + MathUtility.getFactorial(2));
        //Test case 3: n = -1
        System.out.println("Check getF(-1) expected: Exeption | actual: " );
//        MathUtility.getFactorial(-1);
    }
    //  THIET KÊ HÀM GIAI THỪA: ÂM GIAI THỪA VÀ > 20! THÌ KO TÍNH DC
    // HÀM SẼ NÉM RA NGOẠI LỆ
     // test case 1: check if getF() returns well with n = 0;
        //Step/Procedures
        //- input n = 0 to the funtion/method
        //- run the metod to get the actual value of 0!
        //Expectes: 0! must be is 1, expected value = 1
        //1. given n = 0
        //2. execute getF(n = 0)
        //executed value: (hàm hy vọng sẽ trả về mấy)
        //                getF(0) 0! must return 1
        
    // test case 2: check if getF() returns well with n = 1;
        //Step/Procedures
        //- input n = 0 to the funtion/method
        //- run the metod to get the actual value of 0!
        //Expectes: 0! must be is 1, expected value = 1
        //1. given n = 1
        //2. execute getF(n = 1)
        //executed value: (hàm hy vọng sẽ trả về mấy)
        //                getF(1) 1! must return 1
        
    //tdd: test driven development: viết code, làm app theo style
    //code và test song hành vs nhau
    //code và test là cặp bài trùng, code liên tục dc test
    //phải nghĩ ngay luôn bộ test case khi bắt đầu viết code
}
