package Mediator;

public interface Colleague {
    //给组员设置中介者
    public abstract void setMediator(ChocolateMediator chocolateMediator);

    //更新组员状态，用以状态报告
    public abstract  void setColleagueReport();//Chocolate重写
}
