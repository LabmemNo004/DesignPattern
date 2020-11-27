package Interpreter;
import FactoryParameter.Parameter;

import java.io.Serializable;

public class Parser implements Serializable {

    public static Expression parse(String exp) throws ParseException {
        String[] nodes = exp.split(" ");

        System.out.println("你输入了语法表达式 （" + exp + " ）");
        return parse(nodes, 0, nodes.length);
    }


    private static Expression parse(String[] nodes, int start, int end) throws ParseException {
        if(start == end){
            return null;
        }else if(start == end - 1){
            return new NumberExpression(nodes[start]);
        }

        assert end - start >= 3;

        //Add
        for(int i = start+1; i < end; i++){
            int op = isOp(nodes[i]);
            if(op == 1){
                return new AddExpression(parse(nodes,start,i),
                        parse(nodes,i+1,end));
            }
        }
        //Multiply
        for(int i = start+1; i < end; i++){
            int op = isOp(nodes[i]);
            if(op == 2){
                return new MultiplyExpression(parse(nodes,start,i),
                        parse(nodes,i+1,end));
            }
        }
        throw new ParseException("Invalid Expression");
    }

    /**
     * @param str 用户输入字符串的分割单元
     * @return 判断此法单元str是否为操作符以及类型
     */
    static int isOp(String str){
        switch (str.charAt(0)){
            case '+':
                return 1;
            case '*' :
                return 2;
            default:
                return 0;
        }
    }

    /**
     * 内部测试函数
     */
    public static void main() throws ParseException {
        System.out.println("======== 使用 解释器 Interpreter模式 =======");
        System.out.println("欢迎来到查理的巧克力工厂，你出售了一些巧克力：");
        System.out.print("这是你的出售清单 ：");
        String exp = "2 * " + Parameter.VALUE_BIG_SPHERICAL_BLACK +" + "+ Parameter.VALUE_MIDDLE_SQUARE_WHITE + " + "+ Parameter.VALUE_SMALL_STAR_WHITE;
        System.out.println(exp);

        System.out.println("出售这些巧克力的标准总售价为 ： " + Parser.parse(exp));
    }
}