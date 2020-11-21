package Charlie;

public class Charlie implements Robot{
    private double account=1000;
    private Charlie()
    {

    }
    
    public void addAccount(Double  gold)
    {

        account+=gold;

    }

    public boolean reduceAccount(Double gold)
    {
        if (account <gold) {
            return false;
        }
        account -= gold;
        return true;

    }


    public double getAccount()
    {
        return account;
    }

    static public Charlie charlie=new Charlie();
}
