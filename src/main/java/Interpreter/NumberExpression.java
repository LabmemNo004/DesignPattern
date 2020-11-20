package Interpreter;

import java.rmi.UnexpectedException;

public class NumberExpression implements Expression{
    double _value;
    NumberExpression(String str){
        if(Character.isDigit(str.charAt(0))){
            this._value = Double.parseDouble(str);
        }else{
            try {
                this._value = getValue(str);
            } catch (UnexpectedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public double interpret(){
        return _value;
    }

    public static double getValue(String str) throws UnexpectedException {
        switch (str){
            case NAME_TABLE_CHICKEN://等定义，先写着
                return VALUE_TABLE_CHICKEN ;
            case NAME_YELLOW_DUCK:
                return VALUE_YELLOW_DUCK;
            case NAME_CROP:
                return VALUE_CROP;
            default:
                throw new UnexpectedException("");
//                System.out.println("Invalid Operator!");
        }
    }
}
