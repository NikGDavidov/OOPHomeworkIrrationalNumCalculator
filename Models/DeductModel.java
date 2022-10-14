package Ex001Calc.Models;

public class DeductModel extends SumModel {
    @Override
    public double result() {
        return x - y;
    }
}
