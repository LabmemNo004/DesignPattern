package Command;
import Area.*;
import Area.ProcessChocolateArea.ChocolateProductionArea;
import Area.ProcessChocolateArea.ProcessFacade;

public class ProduceCommand {
    public void startProduce(ProcessFacade processFacade) {
        processFacade.setProducePermission(1);
        System.out.println("使用命令类启动了生产过程");
    }
    public void stopProduce(ProcessFacade processFacade)
    {
        processFacade.setProducePermission(0);
        System.out.println("使用命令类停止了生产过程");
    }
}
