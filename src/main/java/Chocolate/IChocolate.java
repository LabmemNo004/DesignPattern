package Chocolate;

/*巧克力接口*/
import Mediator.ChocolateMediator;
import Visitor.ChocolateVisitor;

import java.util.List;

public interface IChocolate {
    String getName();
    //获得巧克力的名称 eg:small square white chocolate
    Mould.Size getSize();
    //获得巧克力型号
    MouldShape.Shapes getShape();
    //获得巧克力形状
    Color.Colors getColor();
    //获得巧克力颜色
    int getState();
    //查看巧克力状态
    void setState();
    //设置巧克力状态
    void setPrice();
    //设置巧克力价格
    double getPrice();
    //获得巧克力基础定价
    List<String> getPackInfo();
    //获得巧克力外层包装信息
    List<String> getPack();
    //获得巧克力外层包装实体
    void addPack(String layer);
    //增加巧克力最外层包装string（黑/白）
    String deletePack();
    //删除巧克力最外层包装
    int getQuality();
    //获取巧克力质量系数
    void Produce(Mould m);
    // 为 size color shape price 赋
    // 随机产生质量系
    void setMediator(ChocolateMediator chocolateMediator);

    public void accept(ChocolateVisitor chocolateVisitor);

    ChocolateMediator getMediator();
    //设置监察官

}
