package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //required to see calculator
        CalcGui CalcGui = new CalcGui();
        Calculator c = new Calculator();

//        public Calcutator() {
        //test calculator
        c.setNum1(12);
        c.setNum2(4);
        System.out.println(c.add());
        System.out.println(c.subtract());
        System.out.println(c.multiply());
        System.out.println(c.divide());
//
//        }

        }

}