package BusinessDelegate;

import BusinessDelegate.Business.BusinessService;

import java.io.Serializable;

public class BusinessDelegate implements Serializable {
    private BusinessLookUp lookUpService=new BusinessLookUp();
    private BusinessService businessService;
    private String serviceType;

    public void setBusinessService(String serviceType)
    {
        this.serviceType=serviceType;
    }

    public void doTask()
    {
        businessService=lookUpService.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}
