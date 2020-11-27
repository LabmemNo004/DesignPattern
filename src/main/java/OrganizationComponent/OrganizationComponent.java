package OrganizationComponent;

import Area.ChocolatePackagingArea;
import Area.ChocolateSellArea;
import Area.ProcessChocolateArea.ChocolateProductionArea;
import Factory.Factory;
import Worker.Attribute;
import Worker.PowderToLiquidWorker;

public abstract class OrganizationComponent {
    private String name;

    public OrganizationComponent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    protected void add(OrganizationComponent organizationComponent){
        throw  new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent organizationComponent){
        throw  new UnsupportedOperationException();
    }

    public abstract void print();


}
