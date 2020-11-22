package BusinessDelegate;

import BusinessDelegate.Business.BusinessService;

public class BusinessDelegate {
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
