package BusinessDelegate;

import BusinessDelegate.Business.BusinessService;
import BusinessDelegate.Business.DisplayChocolates;
import BusinessDelegate.Business.DisplayWorkerState;
import FactoryParameter.Parameter;

public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType)
    {
        if(serviceType.equalsIgnoreCase(Parameter.SERVICE_DISPLAY_CHOCOLATE))
        {
            return new DisplayChocolates();
        }
        else if(serviceType.equalsIgnoreCase(Parameter.SERVICE_DISPLAY_WORKERS))
        {
            return new DisplayWorkerState();
        }
        else return null;
    }
}
