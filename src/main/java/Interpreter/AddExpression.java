package Interpreter;

public class AddExpression implements Expression{

    private Expression _left,_right;

    AddExpression(Expression left, Expression right){
        this._left=left;
        this._right=right;
    }

    @Override
    public double interpret(){return _left.interpret()+_right.interpret();}
}
