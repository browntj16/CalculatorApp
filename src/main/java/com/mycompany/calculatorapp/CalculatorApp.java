/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculatorapp;

/**
 *
 * @author Scoober
 */
public class CalculatorApp {

    public static void main(String[] args) {
        int until = 10;
        for(int i = 0; i<until; i++){
            if(i == 5){
                until = 7;
            }
            System.out.println(i);
        }
    }
}
