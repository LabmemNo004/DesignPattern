/*抽象基类
* 它的子类：Chocolate,Packet
* */
public abstract class Items extends TheObject{
    public abstract String getName();//获取物品名称
    public void add(Items item) throws TypeException{//向物品列表中添加物品
        throw new TypeException("该类型的类禁止使用add函数");

    }
}
