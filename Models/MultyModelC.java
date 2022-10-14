package Ex001Calc.Models;

import Ex001Calc.ComplexNum;

public class MultyModelC extends SumModelC{
    @Override
    public ComplexNum result(ComplexNum a, ComplexNum b) {
        return new ComplexNum(a.getrPart()*b.getrPart()-a.getiPart()*b.getiPart(),
                a.getiPart()*b.getrPart()+a.getrPart()*b.getiPart());
    }
}
