package Visitor;
import Chocolate.Chocolate;

public class StsChocolateVisitor implements ChocolateVisitor{

    @Override
    public void visit(Chocolate chocolate){
        System.out.println("the state of this chocolate is"+chocolate.getState());
    }
}
