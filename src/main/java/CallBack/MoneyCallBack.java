package CallBack;

import java.io.Serializable;

/**
 * 回调(Callback)模式
 */

public interface MoneyCallBack extends Serializable {
    void setMoney(double money);
    boolean call();
}
