package Calc;

public class Calculator {

    boolean calculated = false;
    double number;
    Signs.Sign sign;
    public Calculator left;
    public Calculator right;

    public void setNumber(Double number) {
        this.number = number;
    }

    public double getNumber(){
        return this.number;
    }

    public void setSign(Signs.Sign sign) {
        this.sign = sign;
    }

    public Signs.Sign getSign(){
        return this.sign;
    }

    public double getRLnumber(Calculator calc){
        if (calc.calculated)
            return calc.getNumber();
        else
            return calc.left.getNumber();
    }

    public boolean isCalculated() {
        return calculated;
    }

    public void setCalculated(boolean calculated) {
        this.calculated = calculated;
    }

}
