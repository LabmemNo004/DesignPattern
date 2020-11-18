package Charlie;

public class Charlie {
    private double accout;
    private Charlie()
    {

    }

    public void addAccount(Double  gold)
    {
        accout+=gold;
    }

    public void reduceAccount(Double  gold)
    {
        accout-=gold;
    }

    public double getAccout()
    {
        return accout;
    }
    static public Charlie charlie=new Charlie();
}
