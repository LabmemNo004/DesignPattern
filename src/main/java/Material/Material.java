package Material;

import Item.TheObject;

/*原料类*/
public class Material extends TheObject {
    protected int num;//原料数量
    protected int id;//原料编码
    public Material(int i,int n){
        this.id=i;
        this.num=n;
    }
    public int getNum(){//获取原料数量
        return num;
    }
    public int getId(){//获取原料编码
        return id;
    }
    public void add(int x){//增加原料
        num+=x;
    }
    public void reduce(int x){//减少原料
        num-=x;
    }
    public void setNum(int n){this.num=n;}
}
