package MVC;

/*巧克力视图类*/

import java.text.DecimalFormat;

public class ChocolateView {
    public void showChocolateView(String type,String name,double price,String comment){//打印视图信息
        DecimalFormat df=new DecimalFormat("#.00");
        System.out.println("巧克力信息如下:");
        System.out.println("类型:"+type);
        System.out.println("Charlie的命名:"+name);
        System.out.println("价格:￥"+df.format(price));
        System.out.println("Charlie的评价:"+comment);

    }
}
