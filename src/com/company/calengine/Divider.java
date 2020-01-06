package com.company.calengine;

public class Divider extends CalculateBase implements MathProcessing {

    public Divider () {}

    public Divider (double leftVal, double rightVal){
        super(leftVal,rightVal);
    }

    @Override
    public void calculate() {

        if(getRightVal() != 0){
            double value = getLeftVal() / getRightVal();
            setResult(value);
        }
    }


    @Override
    public String getKeyword() {
        return "divide";
    }

    @Override
    public char getSymbol() {
        return '/';
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        setLeftVal(leftVal);
        setRightVal(rightVal);
        calculate();
        return getResult();
    }
}
