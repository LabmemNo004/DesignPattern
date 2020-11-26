package Servant;
import Mould.Mould;
import Worker.*;
import Chocolate.*;

public interface IWorked {
    public Chocolate worked(Chocolate chocolate, Mould mould);
}
