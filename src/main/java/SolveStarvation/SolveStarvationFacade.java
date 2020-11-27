package SolveStarvation;


import Area.Area;
import Charlie.Charlie;

public class SolveStarvationFacade {
    private Starvation _starvation;
    private AreaSolveStarvation _area_solve;
    private CharlieSolveStarvation _charlie_solve;


    public SolveStarvationFacade(Area area) {
        System.out.println("======== 使用外观 Facade 模式 ========");
        this._starvation = new Starvation();
        this._area_solve = new AreaSolveStarvation(area);
        this._charlie_solve = new CharlieSolveStarvation(area);
    }


    public void solve(int total_appetite_num) {
        System.out.println("使用外观模式解决工人就餐问题");
        _starvation._required_food_amount = total_appetite_num;
        _area_solve.setNext(_charlie_solve);
        _area_solve.solve(_starvation);
    }

}

