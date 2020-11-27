package BusinessDelegate;

import BusinessDelegate.Business.BusinessService;
import BusinessDelegate.Business.DisplayChocolates;
import BusinessDelegate.Business.DisplayMaterial;
import BusinessDelegate.Business.DisplayWorkerState;
import FactoryParameter.Parameter;

import java.io.Serializable;

public class BusinessLookUp implements Serializable {
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
        else if(serviceType.equalsIgnoreCase(Parameter.SERVICE_DISPLAY_MATERIAL))
        {
            return new DisplayMaterial();
        }
        else return null;
    }
}
