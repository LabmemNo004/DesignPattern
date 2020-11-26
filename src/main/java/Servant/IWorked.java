package Servant;
import Mould.Mould;
import Worker.*;
import Chocolate.*;

import java.io.Serializable;

public interface IWorked extends Serializable {
    public Chocolate worked(Chocolate chocolate, Mould mould);
}
