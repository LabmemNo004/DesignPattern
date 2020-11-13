package CallBack;

import Charlie.Charlie;

public class AddMoneyCallBack implements MoneyCallBack{
    private double _addMoney;
    protected Charlie charlie;

    public AddMoneyCallBack(double addMoney,Charlie charlie) {
        this._addMoney = addMoney;
        this.charlie = charlie;
    }

    public void setMoney(double money) {
        _addMoney = money;
    }

    public void call() {
        System.out.println("======== 使用回调 Callback 模式 ========");
        charlie.addMoney(_addMoney);
        System.out.println("回调增加资金 " + _addMoney + " 元");
    }
}
