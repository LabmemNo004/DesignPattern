package CallBack;

import Charlie.Charlie;

public class ReduceMoneyCallBack implements MoneyCallBack{
    private double _reduceMoney;
    private Charlie charlie=Charlie.charlie;

    public ReduceMoneyCallBack(double reduceMoney) {
        this._reduceMoney = reduceMoney;
        //this.charlie=charlie;
    }

    public void setMoney(double money) {
        _reduceMoney = money;
    }

    public boolean call() {
        System.out.println("\n======== 使用回调 Callback 模式 ========\n");
        if (Charlie.charlie.getAccount()<_reduceMoney) {
            throw new RuntimeException("charlie doesn't have enough money");
        }
        else {
            System.out.println("回调扣除资金 " + _reduceMoney + " 元");
            charlie.reduceAccount(_reduceMoney);
            return true;
        }
    }
}
