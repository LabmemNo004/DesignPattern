package BusinessDelegate;

import BusinessDelegate.Business.BusinessService;
import BusinessDelegate.Business.DisplayChocolates;
import BusinessDelegate.Business.DisplayWorkerState;
import FactoryParameter.FactoryParameter;

public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType)
    {
        if(serviceType.equalsIgnoreCase(FactoryParameter.SERVICE_DISPLAY_CHOCOLATE))
        {
            return new DisplayChocolates();
        }
        else if(serviceType.equalsIgnoreCase(FactoryParameter.SERVICE_DISPLAY_WORKERS))
        {
            return new DisplayWorkerState();
        }
        else return null;
    }
}
