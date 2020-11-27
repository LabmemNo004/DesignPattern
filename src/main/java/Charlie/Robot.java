package Charlie;

import java.io.Serializable;

public interface Robot extends Serializable {

    double getAccount();
    boolean reduceAccount(Double  gold);
}
