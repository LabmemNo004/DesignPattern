package Servant;

import Chocolate.Chocolate;
import Mould.Mould;
import Worker.Worker;

public class WorkServant {
    public Chocolate workService(IWorked iworked, Chocolate chocolate, Mould mould) {
        System.out.println("======== 使用雇工 Servant 模式 ========");
        Chocolate newChocolate=iworked.worked(chocolate,mould);
        return newChocolate;
    }
}
