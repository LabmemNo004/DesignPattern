package Area;

import Charlie.Charlie;
import Factory.Factory;

import java.io.Serializable;


public class Area implements Serializable {
    public Area(String id,String name,Charlie charlie,Factory factory)
    {
        this.areaId=id;
        this.areaName=name;
        this.charlie=charlie;
        this.factory=factory;
    }

    protected String areaId;
    protected String areaName;
    protected Charlie charlie;
    protected Factory factory;
}