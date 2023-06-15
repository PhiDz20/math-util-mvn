/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.phi.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.phi.mathutil.core.MathUtility;

/**
 *
 * @author ACER
 */
public class MathUtilityDDTTest {
    
    public static Object[][] initTestData() {
        
        Integer testData[][] = {{0, 1}, {1, 1}, {2, 2}, {3, 6}, {4, 24}, {5, 120}};
        return testData;
    }
    @ParameterizedTest
    @MethodSource("initTestData")
    public void testFactorialGivenRightArgumentReturnsWell(int n, long expected){
        
        assertEquals(expected, MathUtility.getFactorial(n));
    }
    //NHỒI DATA VÀO HÀM assertEquals(expected cột 1, getF(cột 0)
}
//MẢNG DATA TEST CASE PHẢI LÀ PUBLIC STATIC - QUY ƯỚC

