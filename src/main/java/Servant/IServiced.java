package Servant;
import Mould.Mould;
import Worker.*;
import Chocolate.*;

public interface IServiced {
    public Chocolate serviced(Worker worker, Chocolate chocolate, Mould mould);
}
