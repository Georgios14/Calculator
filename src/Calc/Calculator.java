package Calc;

public class Calculator {

    double number;
    Signs.Sign sign;
    Calculator left;
    Calculator right;

    public double addition(double num1,double num2){
        return num1+num2;
    }

    public double subtraction(double num1, double num2){
        return num1-num2;
    }

    public double multiplication(double num1,double num2){
        return num1*num2;
    }

    public double division(double num1,double num2){
        return num1/num2;
    }

}
