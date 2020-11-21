package Builder;

public class MaterialWorkerBuilder {
    public MaterialWorkerBuilder() {
        System.out.println("成功创建采购型工人Builder");
    }
    public void setWorkType() {
        this._worker.setType(Const.WorkType.MATERIAL);
    }
    public void assignSpeed() { this._worker.setSpeed(Const.Speed.MATERIAL);}
}
