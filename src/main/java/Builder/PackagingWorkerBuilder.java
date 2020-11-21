package Builder;

public class PackagingWorkerBuilder {
    public PackagingWorkerBuilder() {
        System.out.println("成功创建包装型工人Builder");
    }
    public void setWorkType() {
        this._worker.setType(Const.WorkType.PACKAGING);
    }
    public void assignSpeed() { this._worker.setSpeed(Const.Speed.PACKAGING);}
}
