package Factory;

import Area.ChocolateSellArea;
import Charlie.Charlie;
import Chocolate.Chocolate;

import java.util.ArrayList;

public class Factory {
    public Factory()
    {
        chocolateSellArea=ChocolateSellArea.getInstance(Charlie.charlie,this);
    }

    public ArrayList<Chocolate> getChocolates()
    {
        return _chocolates;
    }

    public ChocolateSellArea chocolateSellArea;
    private ArrayList<Chocolate> _chocolates;
}
