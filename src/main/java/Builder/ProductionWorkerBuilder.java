package Builder;

public class ProductionWorkerBuilder extends WorkerBuilder{
    public ProductionWorkerBuilder() {
        System.out.println("成功创建生产型工人Builder");
    }
    public void setWorkType() {
        this._farmer.setType(Const.WorkType.PRODUCTION);
    }
    public void assignSpeed() { this._farmer.setSpeed(Const.Speed.PRODUCTION);}
}
