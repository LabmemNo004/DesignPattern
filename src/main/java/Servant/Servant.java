package Servant;

import Chocolate.Chocolate;
import Mould.Mould;
import Worker.Worker;

public class Servant {
    public Chocolate service(IServiced serviceFuture, Worker worker,Chocolate chocolate, Mould mould) {
        Chocolate newChocolate=serviceFuture.serviced(worker,chocolate,mould);
        return newChocolate;
    }
}
