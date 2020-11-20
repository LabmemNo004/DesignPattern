package Builder;

public class PackagingWorkerBuilder {
    public ProductionWorkerBuilder() {
        System.out.println("成功创建包装型工人Builder");
    }
    public void setWorkType() {
        this._farmer.setType(Const.WorkType.PACKAGING);
    }
}
