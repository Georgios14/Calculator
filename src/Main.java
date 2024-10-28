import Calc.Calculation;
import Calc.CalcData;

public class Main {
    public static void main(String[] args) {

        double solution;

        //Initialising classes
        CalcData calc = new CalcData();
        Calculation calculate = new Calculation();
        Reader reader = new Reader();

        //Start of method calls
        Parser.parse(calc, reader.readEquation());
        calculate.calculateMultiplicationDivision(calc, calc.getNumber(), calc.isCalculated());
        solution = calculate.calculateAdditionSubtraction(calc,calc.getNumber(),calc.isCalculated());

        System.out.println("\nThe solution is: " + solution);

    }
}