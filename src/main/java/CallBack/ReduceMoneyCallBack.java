package CallBack;

import Charlie.Charlie;

public class ReduceMoneyCallBack implements MoneyCallBack{
    private double _reduceMoney;
    protected Charlie charlie;

    public ReduceMoneyCallBack(double reduceMoney,Charlie charlie) {
        this._reduceMoney = reduceMoney;
        this.charlie = charlie;
    }

    public void setMoney(double money) {
        _reduceMoney = money;
    }

    public boolean call() {
        System.out.println("======== 使用回调 Callback 模式 ========");
        if (charlie.getAccount()<_reduceMoney) {
            throw new RuntimeException("charlie doesn't have enough money");
        }
        System.out.println("回调扣除资金 " + _reduceMoney + " 元");
        return true;
    }
}
