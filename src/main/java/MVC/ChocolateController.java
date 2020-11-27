package MVC;

import Chocolate.Chocolate;

import java.io.Serializable;

/*巧克力控制类*/
public class ChocolateController implements Serializable {
    private Chocolate model;//巧克力实例
    private ChocolateView view;//巧克力视图

    public ChocolateController(Chocolate m,ChocolateView v){//构造函数
        System.out.println("======== 使用 MVC 模式 ========");
        model=m;
        view=v;
    }

    public void setChocolatePrice(double p){//设置巧克力价格
        model.setPrice(p);
    }

    public void setChocolateComment(String comment){//评论巧克力
        model.setComment(comment);
    }

    public void setChocolateNickname(String name){//给巧克力取个别致的名字
        model.setNickname(name);
    }

    public double getChocolatePrice(){//获取巧克力的价格
        return model.getPrice();
    }
    public String getChocolateComment(){//获取巧克力评论
        return model.getComment();
    }
    public String getChocolateNickname(){//获取巧克力昵称
        return model.getNickname();
    }
    public String getChocolateType(){//获取巧克力类型
        return model.getName();
    }

    public void updateView(){//更新视图
        view.showChocolateView(model.getName(), model.getNickname(), model.getPrice(), model.getComment());
    }
}
