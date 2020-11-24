package SolveStarvation;

import Worker.*;
import Area.*;


/**
 * 责任链(chain of responsibility)模式
 */
public class CharlieSolveStarvation extends SolveStarvation{
    private Area _area;
    public CharlieSolveStarvation(Area area)
    {
        super("Owner");
        _area=area;
    }
    /**
     * 调用Charlie解决工人就餐问题的函数
     * @param starvation 需要解决的问题
     * @return 是否成功解决问题
     */
    @Override
    public boolean resolve(Starvation starvation)
    {
        return Charlie.getInstance().solveStarvation(this,starvation);
    }
    public Area getArea()
    {
        return _area;
    }
}
