package Pocket;

import Item.Items;
import Item.NullItem;

import java.util.ArrayList;
import java.util.Arrays;

public class Pocket extends Items {
    private ArrayList<Items> pocketList;
    private String name;
    private int scale;

    public boolean isFull()
    {
        return pocketList.size()>=scale;
    }
    

    public Pocket(String name,int scale) {
        System.out.println("=====使用Composite模式创建Pocket=====");
        this.name=name;
        if(scale<=0) this.scale=1;
        else this.scale=scale;
        System.out.println("该Pocket名字为"+name+",容量为:"+scale);
        pocketList=new ArrayList<>(this.scale);
    }

    @Override
    public String getName() {
        return this.name;
    }

    public int getScale(){//一个背包和一个巧克力占用同样的容量大小
        return this.scale;
    }

    @Override
    public int getCount() {
        int size=0;
        for(Items now:pocketList)
        {
            size+=now.getCount();
        }
        return size;
    }
    
    public Items getItem(int index) {
    	if(index > -1 && index < this.scale) return pocketList.get(index);
    	else return new NullItem();
    }
    
    public void add(Items item){
        if(item==null)
        {
            System.out.println("加入物品不存在");
            return;
        }
        else if(isFull())
        {
            System.out.println("向神奇背包——"+this.name+"加入"+item.getName()+"，但是当前背包已满！");
            return;
        }
        pocketList.add(item);
        System.out.println("向神奇背包——"+this.name+"中加入"+item.getName());
    }

}
