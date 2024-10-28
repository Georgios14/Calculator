package Calc;

public class Calculation {

    public double calculateMultiplicationDivision(Calculator calc, double previousSolution, boolean previousCalculated){

        Signs.Sign sign = calc.getSign();
        Signs.Sign rightSign = calc.right.getSign();

        if (sign == Signs.Sign.multiplication && !calc.isCalculated()){
            if(previousCalculated)
                calc.setNumber(multiplication(previousSolution, calc.getRLnumber(calc.right)));
            else
                calc.setNumber(multiplication(calc.left.getNumber(), calc.getRLnumber(calc.right)));
            calc.setCalculated(true);

        }
        else if (sign == Signs.Sign.division && !calc.isCalculated()){
            if(previousCalculated)
                calc.setNumber(division(previousSolution, calc.getRLnumber(calc.right)));
            else
                calc.setNumber(division(calc.left.getNumber(), calc.getRLnumber(calc.right)));
            calc.setCalculated(true);

            if(calc.right.isCalculated() && previousCalculated)
                calc.right.setNumber(calc.getNumber());

        }

        double solution = calc.getNumber();

        if (rightSign == null)
            return solution;
        else
            return calculateMultiplicationDivision(calc.right,calc.getNumber(),calc.isCalculated());

    }

    public double calculateAdditionSubtraction(Calculator calc,double previousSolution,boolean previousCalculated){

        Signs.Sign sign = calc.getSign();
        Signs.Sign rightSign = calc.right.getSign();

        if (sign == Signs.Sign.addition && !calc.isCalculated()){
            if(previousCalculated)
                calc.setNumber(addition(previousSolution, calc.getRLnumber(calc.right)));
            else
                calc.setNumber(addition(calc.left.getNumber(), calc.getRLnumber(calc.right)));
            calc.setCalculated(true);

            if(calc.right.isCalculated() && previousCalculated)
                calc.right.setNumber(calc.getNumber());

        }
        else if (sign == Signs.Sign.subtraction && !calc.isCalculated()){
            if(previousCalculated)
                calc.setNumber(subtraction(previousSolution, calc.getRLnumber(calc.right)));
            else
                calc.setNumber(subtraction(calc.left.getNumber(), calc.getRLnumber(calc.right)));
            calc.setCalculated(true);

            if(calc.right.isCalculated() && previousCalculated)
                calc.right.setNumber(calc.getNumber());

        }

        double solution = calc.getNumber();

        if (rightSign == null)
            return solution;
        else
            return calculateAdditionSubtraction(calc.right,calc.getNumber(),calc.isCalculated());

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
