package Interpreter;

import Constant.Const;

public class Parser {
    /**
     *
     * @param exp 用户输入的语法表达式
     * @return 解析得到的对应语法树
     * @throws ParseException 当解析出现错误时抛出自定义的ParseException异常
     */
    public static Expression parse(String exp) throws ParseException {
        String[] nodes = exp.split(" ");

        System.out.println("你输入了语法表达式 （" + exp + " ）");
        return parse(nodes, 0, nodes.length);
    }

    /**
     *
     * @param nodes 输入字符串分割后的词法单元
     * @param start 当前解析子语法树的开始下标
     * @param end 当前解析子语法树的结束下标
     * @return 解析（[start, end)）获得的语法树
     * @throws ParseException 当解析出现错误时抛出自定义的ParseException异常
     */
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
        System.out.println("欢迎来到查理的巧克力工厂，你出售了这些巧克力：");
        System.out.print("这是你的出售清单 ：");
        String exp = "2 * " + Const.VALUE_TABLE_CHICKEN +" + "+ Const.VALUE_YELLOW_DUCK + " + "+ Const.VALUE_CROP;
        System.out.println(exp);

        System.out.println("你获得了以下金钱 ： " + Parser.parse(exp));
    }
}