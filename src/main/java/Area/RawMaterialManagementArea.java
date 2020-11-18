package Area;

import Charlie.Charlie;
import Chocolate.Material;
import Factory.Factory;


public class RawMaterialManagementArea extends Area {
    private static Material blackMaterial=new Material(1,20);
    private static Material whiteMaterial=new Material(2,20);
    private volatile static RawMaterialManagementArea ourInstance;

    public static RawMaterialManagementArea getInstance(Charlie charlie,Factory factory) {
        if (null == ourInstance) {
            synchronized (RawMaterialManagementArea.class) {
                if (null == ourInstance) {
                    ourInstance = new RawMaterialManagementArea(charlie,factory);
                    System.out.println("RawMaterialManagementArea has been initialized!");
                }
            }
        }
        return ourInstance;
    }

    private RawMaterialManagementArea(Charlie charlie,Factory factory) {
        super("1","RawMaterialManagementArea",charlie,factory);
    }

    public int getBlackMaterialNum(){
        return blackMaterial.getNum();
    }

    public int getWhiteMaterialNum(){
        return whiteMaterial.getNum();
    }



    public  static void blackProduce(){
        if(blackMaterial.getNum()>=1)
        {
            blackMaterial.reduce(1);
        }
        else
        {
            System.out.println("黑巧克力原料不足！");
        }
    }
    public static void whiteProduce(){
        if(whiteMaterial.getNum()>=1)
        {
            whiteMaterial.reduce(1);
        }
        else
        {
            System.out.println("白巧克力原料不足！");
        }
    }
}
