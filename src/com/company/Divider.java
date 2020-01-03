package com.company;

public class Divider extends CalculateBase {

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


}
