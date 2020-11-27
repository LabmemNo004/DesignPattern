package BusinessDelegate;

import java.io.Serializable;

public class Client implements Serializable {
    BusinessDelegate businessDelegate;

    public Client(BusinessDelegate businessDelegate)
    {
        this.businessDelegate=businessDelegate;
    }

    public void doTask()
    {
        businessDelegate.doTask();
    }
}
