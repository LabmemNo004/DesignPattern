package Worker;

public class ConcreteExtension extends AbstractExtension{

    public ConcreteExtension(Worker owner)
    {
        super(owner);
        if(owner.getWorkTypeString()=="PowderToLiquid")
        {
            System.out.println("----Super PowerToLiquidWorker 进入工作----");
        }
        else if(owner.getWorkTypeString()=="LiquidToSolid")
        {
            System.out.println("----Super LiquidToSolidWorker 进入工作----");
        }
    }
    public void DoMore()
    {
        System.out.println("----SuperWoker进入工作----");
    }

}
