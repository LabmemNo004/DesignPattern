package Visitor;

import Chocolate.Chocolate;

import java.io.Serializable;

public interface ChocolateVisitor extends Serializable {

    public void visit(Chocolate chocolate);
}
