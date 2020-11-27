package SolveStarvation;

import java.io.Serializable;

public abstract class SolveStarvation implements Serializable {
    private SolveStarvation _next;
    private String _name;

    /**
     * 构造函数
     * @param name 解决问题的area的名字
     */
    public SolveStarvation(String name)
    {
        _name = name;
    }

    /**
     * 确定下一级负责的角色
     * @param solveStarvation 下一级负责的类
     * @return 下一级负责的角色
     */
    public SolveStarvation setNext(SolveStarvation solveStarvation){
        this._next = solveStarvation;
        return solveStarvation;
    }

    @Override
    public String toString(){
        return this._name;
    }

    /**
     * 不同角色有不同的解决办法
     * @param starvation 具体需要解决的问题
     * @return 是否解决
     */
    protected abstract boolean resolve(Starvation starvation);

    /**
     * 解决成功
     * @param starvation 具体需要解决的问题
     */
    protected void finish(Starvation starvation)
    {
        System.out.println("======== 使用责任链 Chain of Responsibilities 模式 =========");
        System.out.println(starvation + " It is solved by " + this);
    }

    /**
     * 解决失败
     * @param starvation 具体需要解决的问题
     */
    protected void fail(Starvation starvation)
    {
        System.out.println("======== 使用责任链 Chain of Responsibilities 模式 =========");
        System.out.println(starvation + "solving has been failed.");
    }

    /**
     * 尝试解决工人就餐（向食堂添加食物）的问题，并根据解决的结果调用相应函数表明成功解决和解决失败
     * @param starvation 具体需要解决的问题
     */
    public final void solve(Starvation starvation){
        if(resolve(starvation)){
            finish(starvation);
        }else if (_next !=null){
            _next.solve(starvation);
        }else{
            fail(starvation);
        }
    }
}
