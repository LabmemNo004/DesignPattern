package Observer;

import Area.RawMaterialManagementArea;
import Charlie.Charlie;
import Chocolate.Color.Colors;
import Factory.Factory;
import FactoryParameter.Parameter;

public class CharlieObserver implements MaterialObserver{
    @Override
   public void update(Colors color) {
        int num=0;
        Charlie charlie = Charlie.charlie;
        RawMaterialManagementArea area = Factory.getInstance().getManageArea();
        double cost = 0;
        if(color==Colors.black){
            num = (int)(charlie.getAccount()/2/Parameter.blackMeterialPrice);
            cost = num*Parameter.blackMeterialPrice;
            area.buyBlackMaterial(num);
        }
        else {
            num = (int)(charlie.getAccount()/2/Parameter.whiteMeterialPrice);
            cost = num*Parameter.whiteMeterialPrice;
            area.buyWhiteMaterial(num);
        }
        charlie.reduceAccount(cost);
        System.out.println("charlie花费"+cost+"购买了"+num+"份原料");
   }
}
