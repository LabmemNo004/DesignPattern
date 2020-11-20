package Interpreter;

public class MultiplyExpression implements Expression {
    //左、右子节点
    private Expression _left, _right;

    /*
     * MultiplyExpression 构造函数
     */
    MultiplyExpression(Expression left, Expression right){
        this._left = left;
        this._right = right;
    }

    /*
     * @return 乘法表达式的计算值
     */
    @Override
    public double interpret(){
        return _left.interpret() * _right.interpret();
    }
}
