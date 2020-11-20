package Strategy;

import Chocolate.*;

public class Test {
    public static void main(String[]args){
        ChocolateShaping strategy= new BigHeart().doShaping();
    }
}
