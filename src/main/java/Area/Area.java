package Area;

import java.io.Serializable;


public class Area implements Serializable {
    public Area(String id,String name,Charlie charlie)
    {
        areaId=id;
        areaName=name;
        this.charlie=charlie;
    }

    protected String areaId;
    protected String areaName;
    protected Charlie charlie;
}