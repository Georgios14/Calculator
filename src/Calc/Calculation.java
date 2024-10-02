package Calc;

public class Calculation {

    public double calculate(Calculator calc,double previousSolution){
        double solution = 0;

        if (calc.getSign() == Signs.Sign.multiplication){

            solution = multiplication(calc.left.getNumber(), calc.getRLnumber(calc.right));

            calculate(calc.right,solution);

        }
        else if (calc.getSign() == Signs.Sign.division){

            solution = division(calc.left.getNumber(), calc.getRLnumber(calc.right));

            calculate(calc.right,solution);

        }

        if (calc.right.getSign() == null)
            return solution;

        return solution;
    }

    public static double addition(double num1,double num2){
        return num1+num2;
    }

    public static double division(double num1,double num2){
        return num1/num2;
    }

    public static double multiplication(double num1,double num2){
        return num1*num2;
    }

    public static double subtraction(double num1, double num2){
        return num1-num2;
    }

}
