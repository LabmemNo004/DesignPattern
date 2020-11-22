package Item;

/*抽象基类
* 它的子类：Chocolate,Packet
* */
public abstract class Items extends TheObject
{
    public abstract String getName();//获取物品名称

    public abstract int getCount();//获取数量多少

    public void add(Items item) throws TypeException
    {
        throw new TypeException("该类型的类禁止使用add函数");
    }
}
