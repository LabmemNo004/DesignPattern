package Builder;

public class MeterialWorkerBuilder {
    public ProductionWorkerBuilder() {
        System.out.println("成功创建采购型工人Builder");
    }
    public void setWorkType() {
        this._farmer.setType(Const.WorkType.MATERIAL);
    }
}
