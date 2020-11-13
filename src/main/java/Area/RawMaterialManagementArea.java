package Area;

import Charlie.Charlie;
import Factory.Factory;
import Material.Material;


public class RawMaterialManagementArea extends Area {
    private Material blackMaterial;
    private Material whiteMaterial;
    private volatile static RawMaterialManagementArea ourInstance;

    public static RawMaterialManagementArea getInstance(Charlie charlie,Factory factory,int blackNum,int whiteNum) {
        if (null == ourInstance) {
            synchronized (RawMaterialManagementArea.class) {
                if (null == ourInstance) {
                    ourInstance = new RawMaterialManagementArea(charlie,factory,blackNum,whiteNum);
                }
            }
        }
        return ourInstance;
    }

    private RawMaterialManagementArea(Charlie charlie,Factory factory,int blackNum,int whiteNum) {
        super("1","RawMaterialManagementArea",charlie,factory);
        blackMeterial=new Meterial(blackNum,10);
        whiteMeterial=new Meterial(whiteNum,20);
    }

    public int getBlackMaterialNum(){
        return blackMaterial.num;
    }

    public int getWhiteMaterialNum(){
        return whiteMaterial.num;
    }

    public void setBlackMaterialNum(int num){
        blackMaterial.setNum(num);
    }

    public void setWhiteMaterialNum(int num){
        whiteMaterial.setNum(num);
    }

    public static void blackProduce(){
        if(blackMaterial.num>=1)
        {
            blackMaterial.reduce();
        }
        else
        {
            System.out.println("黑巧克力原料不足！");
        }
    }
    public static void whiteProduce(){
        if(whiteMaterial.num>=1)
        {
            whiteMaterial.reduce();
        }
        else
        {
            System.out.println("白巧克力原料不足！");
        }
    }
}
