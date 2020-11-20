package Charlie;

import java.io.Serializable;

public class Charlie implements Robot, Serializable {
    private double account;
    private Charlie()
    {

    }

    public void addAccount(Double  gold)
    {
        account +=gold;
    }

    public boolean reduceAccount(Double m)
    {
        if (account <m) {
            return false;
        }
        account -= m;
        return true;
    }


    public double getAccount()
    {
        return account;
    }
    static public Charlie charlie=new Charlie();
}
