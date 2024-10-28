import Calc.Calculator;
import Calc.Signs;

public class Parser {

    public static void parse(Calculator calc, String equation){

        calc.left = new Calculator();
        calc.right = new Calculator();

        //Finds the index of the first sign
        int index = indexLocator(equation);

        if(index == -1){
            //Saves last number in number variable
            calc.setNumber(Double.valueOf(equation));

        }
        else {

            //Saves the first sign in sign variable
            calc.setSign(parseSign(equation.charAt(index)));
            //saves the first number in left child number variable
            calc.left.setNumber(Double.parseDouble(equation.substring(0, index)));

            String substring = equation.substring(index+1);

            parse(calc.right, substring);

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

    public static int indexLocator(String equation){

        for(int i=0;i<equation.length();i++){

            if(equation.charAt(i)=='+' || equation.charAt(i)=='-' || equation.charAt(i)=='*' || equation.charAt(i)=='/')
                return i;

        }

        return -1;

    }

}
