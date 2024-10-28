package Calc;

public class CalcData {

    boolean calculated = false;
    double number;
    Signs.Sign sign;
    public CalcData left;
    public CalcData right;

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

    @SuppressWarnings("SpellCheckingInspection")
    public double getRLnumber(CalcData calc){
        if (calc.calculated || (calc.left.getNumber() == 0 && calc.left.getSign() == null))
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
