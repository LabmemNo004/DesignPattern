package Iterator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/*物品集合类*/
public class ObjectCollection<T> extends BaseCollection<T> implements Serializable{
    private int size;//集合中的元素个数
    private List<T> collection;//将元素放在列表中

    public ObjectCollection(){//构造函数
        size=0;
        collection=new ArrayList<>();
    }

    @Override
    public Iterator<T> iterator() {//为集合建立迭代器
        return new CollectionIterator();
    }

    @Override
    public void add(T item) {//增添元素
        collection.add(item);
        size++;

    }

    @Override
    public void delete(T item) {
        collection.remove(item);//删除元素
        size--;

    }

    @Override
    public int getSize() {
        return size;
    }

    class CollectionIterator implements Iterator<T>{//内部类，集合迭代器
        private int point;
        @Override
        public boolean hasNext() {
            if(size>point){
                return true;
            }

            return false;
        }

        @Override
        public T next() {
            if(hasNext()){
                point++;
                return collection.get(point);
            }
            return null;
        }

        CollectionIterator(){
            point=-1;

        }

        public void reset(){//重置迭代器指针为0
            point=-1;
        }
    }
}