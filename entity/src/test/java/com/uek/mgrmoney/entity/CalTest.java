package com.uek.mgrmoney.entity;

import org.junit.Test;

import java.math.BigDecimal;

public class CalTest {
    public static void main(String[] args) {
        System.out.println(0.05+0.01);
        System.out.println(1.0-0.42);
        System.out.println(4.015*100);
        System.out.println(123.3/100);
    }
    @Test
    public void testCal(){
        BigDecimal a = BigDecimal.valueOf(1.0);
        BigDecimal b = BigDecimal.valueOf(0.42);
        BigDecimal subtract = a.subtract(b);
        System.out.println(subtract);
    }
    @Test
    public void testCal2(){
        BigDecimal a = BigDecimal.valueOf(4.015);
        BigDecimal b = BigDecimal.valueOf(100);
        BigDecimal subtract = a.multiply(b);
        System.out.println(subtract);
    }
}
