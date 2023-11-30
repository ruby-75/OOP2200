package org.example;



public class Calculator {
    Float num1;
    Float num2;
    String operator;



    //add method
    public Float add(){
        try {
            return num1 + num2;
        }catch (NullPointerException e){
            System.out.println(e.toString());
            return 0f;
        }
    }
    //subtract method
    public Float subtract(){
        try {
            return num1 - num2;
        }catch (NullPointerException e){
            System.out.println(e.toString());
            return 0f;
        }
    }
    //multiplication method
    public Float multiply(){
        try {
            return num1 * num2;
        }catch (NullPointerException e){
            System.out.println(e.toString());
            return 0f;
        }
    }
    //division method
    public Float divide(){
        try {
            return num1 / num2;
        }catch (NullPointerException e){
            System.out.println(e.toString());
            return 0f;
        }
    }
    public void delete(){

    }
    public void clear(){

    }
    public void updateOutput(){

    }
    public void appendToOutput(String num){

    }
    public void selectOperator(String newOperator){

    }
    public void calculate(){

    }
    //Choose Calculation method
    public Float chooseCalcMethod() {
        switch (operator) {
            case "➕":
                return add();
            case "➖":
                return subtract();
            case "✖":
                return multiply();
            case "➗":
                return divide();
            default:
                return num2;
        }
    }


}
