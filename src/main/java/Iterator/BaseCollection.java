package Iterator;

import java.io.Serializable;

/*物品集合类基类
* 它的子类：ObjectCollection*/
public abstract class BaseCollection<T> implements Serializable {
    public abstract Iterator<T> iterator();//创建集合的迭代器
    public abstract void add(T item);//在集合中增添元素
    public abstract void delete(T item);//删除集合元素
    public abstract int getSize();//返回集合中的元素个数
}