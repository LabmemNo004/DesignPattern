package visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:hzj
 * Date: 2020-12-01
 */
public class VisitorDemo {
    public static void VisitTest(){
            System.out.println("测试visitor模式");
            System.out.println("求出新修的4座形状不同的建筑物的周长和面积");
            ObjectStructure shapes = new ObjectStructure();
            System.out.println("Triangle 1, edges = (1.3,2.3,3.1)");
            shapes.add(new Triangle(1.3, 2.3, 3.1));
            System.out.println("Circle 1, radius = (1.2)");
            shapes.add(new Circle(1.2));
            System.out.println("Triangle 2, edges = (2.4,3.4,4.2)");
            shapes.add(new Triangle(2.4, 3.4, 4.2));
            System.out.println("Circle2, radius = (7.8)");
            shapes.add(new Circle(7.8));

            // 计算周长和面积的不同策略（访问者）
            Perimeter perimeter = new Perimeter();
            Area area = new Area();

            // 将周长和面积的计算策略传入（接受不同访问者的访问）
            System.out.println("接受具体的操作方法类-perimeter");
            shapes.accept(perimeter);
            System.out.println("接受具体的操作方法类-area");
            shapes.accept(area);
    }
}
