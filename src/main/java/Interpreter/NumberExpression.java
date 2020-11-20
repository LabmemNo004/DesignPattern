package Interpreter;

import java.rmi.UnexpectedException;
import static Constant.Const.*;

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
            case "big_spherical_black":
                return VALUE_BIG_SPHERICAL_BLACK;
            case "big_square_black":
                return VALUE_BIG_SQUARE_BLACK;
            case "big_star_black":
                return VALUE_BIG_STAR_BLACK;
            case "big_heart_black":
                return VALUE_BIG_HEART_BLACK;

            case "middle_spherical_black":
                return VALUE_MIDDLE_SPHERICAL_BLACK ;
            case "middle_square_black":
                return VALUE_MIDDLE_SQUARE_BLACK  ;
            case "middle_star_black":
                return VALUE_MIDDLE_STAR_BLACK ;
            case "middle_heart_black":
                return VALUE_MIDDLE_HEART_BLACK ;

            case "small_spherical_black":
                return VALUE_SMALL_SPHERICAL_BLACK ;
            case "small_square_black":
                return VALUE_SMALL_SQUARE_BLACK ;
            case "small_star_black":
                return VALUE_SMALL_STAR_BLACK ;
            case "small_heart_black":
                return VALUE_SMALL_HEART_BLACK ;

            case "big_spherical_white":
                return VALUE_BIG_SPHERICAL_WHITE;
            case "big_square_white":
                return VALUE_BIG_SQUARE_WHITE;
            case "big_star_white":
                return VALUE_BIG_STAR_WHITE;
            case "big_heart_white":
                return VALUE_BIG_HEART_WHITE;

            case "middle_spherical_white":
                return VALUE_MIDDLE_SPHERICAL_WHITE ;
            case "middle_square_white":
                return VALUE_MIDDLE_SQUARE_WHITE  ;
            case "middle_star_white":
                return VALUE_MIDDLE_STAR_WHITE;
            case "middle_heart_white":
                return VALUE_MIDDLE_HEART_WHITE ;

            case "small_spherical_white":
                return VALUE_SMALL_SPHERICAL_WHITE ;
            case "small_square_white":
                return VALUE_SMALL_SQUARE_WHITE ;
            case "small_star_white":
                return VALUE_SMALL_STAR_WHITE ;
            case "small_heart_white":
                return VALUE_SMALL_HEART_WHITE ;
            default:
                throw new UnexpectedException("");
//                System.out.println("Invalid Operator!");
        }
    }
}

