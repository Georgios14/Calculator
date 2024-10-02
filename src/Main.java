import Calc.Calculation;
import Calc.Calculator;

public class Main {
    public static void main(String[] args) {

        double solution;

        //Initialising classes
        Calculator calc = new Calculator();
        Calculation calculate = new Calculation();
        Reader reader = new Reader();

        //Start of method calls
        calc = Parser.parse(calc,reader.readEquation());
        calculate.calculateMultiplicationDivision(calc, calc.getNumber(), calc.isCalculated());
        solution = calculate.calculateAdditionSubtraction(calc,calc.getNumber(),calc.isCalculated());

        System.out.println("\nThe solution is: " + solution);

    }
}