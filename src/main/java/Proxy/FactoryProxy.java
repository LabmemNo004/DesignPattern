package Proxy;

import Charlie.*;

public class FactoryProxy implements Robot{

    private Charlie charlie;
    private double gold;

    public FactoryProxy(){
        charlie=Charlie.charlie;
        gold =charlie.getAccount();
    }


    @Override
    public double getAccount() {
        System.out.println("代理：获知Charlie的财产有"+ gold +"元。");
        return gold;
    }

    @Override
    public boolean reduceAccount(Double m) {
        if (gold < m) {
            System.out.println("代理：Charlie的财产不足"+m+"元，消费失败。");
            return false;
        }
        gold -= m;
        Charlie.charlie.reduceAccount(m);
        System.out.println("代理：Charlie花了"+m+"元，余额为"+ gold +"元。");
        return true;
    }
}
