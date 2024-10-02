import Calc.Calculator;
import Calc.Signs;

public class Parser {

    public static Calculator parse(Calculator calc, String equation){

        //Finds the index of the first sign found
        int index = equation.indexOf('+');

        if(equation.indexOf('-') < index || index==-1)
            index = equation.indexOf('-');
        if(equation.indexOf('*') < index || index==-1)
            index = equation.indexOf('*');
        if(equation.indexOf('/') < index || index==-1)
            index = equation.indexOf('/');

        if(index == -1){
            //Saves last number in number variable
            calc.setNumber(Double.valueOf(equation));

            return calc;
        }
        else {

            //Saves the first sign in sign variable
            calc.setSign(parseSign(equation.charAt(index)));
            //saves the first number in left child number variable
            calc.left.setNumber(Double.parseDouble(equation.substring(0, index)));

            return parse(calc.right, equation.substring(index+1));
        }

    }

    public static Signs.Sign parseSign(char a){

        Signs.Sign sign = null;

        if(a=='*'){
            sign = Signs.Sign.multiplication;
        }
        if(a=='/'){
            sign = Signs.Sign.division;
        }
        if(a=='+'){
            sign = Signs.Sign.addition;
        }
        if(a=='-'){
            sign = Signs.Sign.subtraction;
        }


        return sign;

    }

}
