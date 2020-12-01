package filter;

import entity.Dishes;
import entity.Taste;

import java.util.ArrayList;

/**
 * @Tester LabmemNo004
 * @Date: 18:11 2020/12/1
 **/

public class DishesFilterDemo {
    /*
     * description: 过滤器模式演示代码
     * date: 18:11 2020/12/1
     * author: LabmemNo004
     *
     * @param
     * @return void
     */
    public static void dishesFilterTest() {
        ArrayList<Dishes> dishesMenu = new ArrayList<Dishes>();

        System.out.println("开始创建菜单！");
        Dishes saltyDishes1 = new Dishes("椒盐核桃", Taste.salty);
        dishesMenu.add(saltyDishes1);
        Dishes saltyDishes2 = new Dishes("梅菜扣肉", Taste.salty);
        dishesMenu.add(saltyDishes2);
        Dishes sourDishes1 = new Dishes("泡椒鸡爪", Taste.sour);
        dishesMenu.add(sourDishes1);
        Dishes sourDishes2 = new Dishes("酸白菜", Taste.sour);
        dishesMenu.add(sourDishes2);
        Dishes spicyDishes1 = new Dishes("红油火锅", Taste.spicy);
        dishesMenu.add(spicyDishes1);
        Dishes spicyDishes2 = new Dishes("重庆小面", Taste.spicy);
        dishesMenu.add(spicyDishes2);
        Dishes sweetDishes1 = new Dishes("龙吟草莓", Taste.sweet);
        dishesMenu.add(sweetDishes1);
        Dishes sweetDishes2 = new Dishes("松鼠鱼", Taste.sweet);
        dishesMenu.add(sweetDishes2);



        System.out.println("开始生成咸口菜品菜单！");
        SaltyDishesFilter saltyDishesFilter = new SaltyDishesFilter();
        ArrayList<Dishes> saltyDishes = saltyDishesFilter.filter(dishesMenu);

        System.out.println("开始生成偏酸菜品菜单！");
        SourDishesFilter sourDishesFilter = new SourDishesFilter();
        ArrayList<Dishes> sourDishes = sourDishesFilter.filter(dishesMenu);

        System.out.println("开始生成偏辣菜品菜单！");
        SpicyDishesFilter spicyDishesFilter = new SpicyDishesFilter();
        ArrayList<Dishes> spicyDishes = spicyDishesFilter.filter(dishesMenu);

        System.out.println("开始生成甜品菜单！");
        SweetDishesFilter sweetDishesFilter = new SweetDishesFilter();
        ArrayList<Dishes> sweetDishes = sweetDishesFilter.filter(dishesMenu);

        System.out.println("\n咸味菜品：");
        for(Dishes dishes : saltyDishes) System.out.println(dishes.getName() + "  " + dishes.getTaste().toString());
        System.out.println("\n酸味菜品：");
        for(Dishes dishes : sourDishes) System.out.println(dishes.getName() + "  " + dishes.getTaste().toString());
        System.out.println("\n辣味菜品：");
        for(Dishes dishes : spicyDishes) System.out.println(dishes.getName() + "  " + dishes.getTaste().toString());
        System.out.println("\n甜味菜品：");
        for(Dishes dishes : sweetDishes) System.out.println(dishes.getName() + "  " + dishes.getTaste().toString());

    }
}
