package Worker;

public class ConcreteExtension extends AbstractExtension{

    public ConcreteExtension(Worker owner)
    {
        super(owner);
        if(owner.getWorkTypeString()=="PowderToLiquidWorker")
        {
            System.out.println("----Super PowerToLiquidWorker 进入工作----");
        }
        else if(owner.getWorkTypeString()=="LiquidToSolidWorker")
        {
            System.out.println("----Super LiquidToSolidWorker 进入工作----");
        }
    }
    public void DoSomething()
    {
        System.out.println("----SuperWoker进入工作----");
    }

}
