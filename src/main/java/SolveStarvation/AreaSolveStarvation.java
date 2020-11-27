package SolveStarvation;

import Area.*;


/**
 * 责任链(chain of responsibility)模式
 */

public class AreaSolveStarvation extends SolveStarvation{

    public Area area;
    /**
     * 构造函数
     */
    public AreaSolveStarvation(Area area_)
    {
        super(area_.getAreaName()+"");
        area=area_;
    }
    /**
     * 调用区域处理工人就餐的函数
     * @param starvation
     * @return 是否成功解决
     */

    @Override
    public boolean resolve(Starvation starvation)
    {
        Area area_=area;
        return area_.solveStarvation(this,starvation);
    }

}
