package org.example;


public class Main {
    public static void main(String[] args) {

        //required to see calculator
//        CalcGui CalcGui = new CalcGui();
        Calculator calc = new Calculator();

        calc.setNum1(1.0);
        calc.setNum2(5.0);

        calc.setOperator("➕");

        Double testResult = calc.performCalculations();
        System.out.println(testResult);
        }

}