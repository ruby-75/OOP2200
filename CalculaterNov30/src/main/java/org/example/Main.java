package org.example;


public class Main {
    public static void main(String[] args) {

        //required to see calculator
//        CalcGui CalcGui = new CalcGui();
        Calculator calc = new Calculator();

        calc.setNum1(1.0);
        calc.setNum2(5.0);

        calc.setOperator("➕");

        Double testResult1 = calc.performCalculations();
        System.out.println(testResult1);

        calc.setOperator("➖");

        Double testResult2 = calc.performCalculations();
        System.out.println(testResult2);

        calc.setOperator("✖");

        Double testResult3 = calc.performCalculations();
        System.out.println(testResult3);

        calc.setOperator("➗");

        Double testResult4 = calc.performCalculations();
        System.out.println(testResult4);


        }



}