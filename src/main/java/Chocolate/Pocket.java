package Chocolate;

import java.util.ArrayList;
import java.util.Arrays;

public class Pocket extends Items{
    private ArrayList<Items> pocketList;
    private String name;
    private int scale;

    private boolean isFull()
    {
        return pocketList.size()<scale;
    }

    public Pocket(String name,int scale) {
        System.out.println("使用Composite模式创建Pocket");
        this.name=name;
        if(scale<=0) this.scale=1;
        else this.scale=scale;
        System.out.println("该Pocket名字为"+name+",容量为:"+scale);
        pocketList=new ArrayList<>(Arrays.asList(new Items[this.scale]));
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

    public void add(Items item){
        if(isFull()||item==null) return;
        pocketList.add(item);
    }

}
