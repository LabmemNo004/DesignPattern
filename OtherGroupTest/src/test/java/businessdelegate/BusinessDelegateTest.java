package businessdelegate;
import org.junit.Test;
/*
* @Author:Sophie
* @Description:业务代表模式测试
* @Date:2020/12/01 22:07
* */
public class BusinessDelegateTest {
    @Test
    public void businessDelegateTest() {
        System.out.println("---------------- 业务代表 BusinessDelegate 模式----------------");
        Dog dogAthlete;
        QueryDelegate queryDelegate1;
        QueryDelegate queryDelegate2;
        try {
            queryDelegate1 = new QueryDelegate(OfflineQuery.class.getName());
            queryDelegate1.setQueryType();
            dogAthlete = new Dog(queryDelegate1);
            dogAthlete.doQuery();
        } catch (ClassNotFoundException e) {
            System.out.println("此查询类型不存在！");
        } catch (IllegalAccessException | InstantiationException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
        try {
            queryDelegate2 = new QueryDelegate(OnlineQuery.class.getName());
            queryDelegate2.setQueryType();
            dogAthlete = new Dog(queryDelegate2);
            dogAthlete.doQuery();
        } catch (ClassNotFoundException e) {
            System.out.println("此查询类型不存在！");
        } catch (IllegalAccessException | InstantiationException e) {
            System.out.println(e.getMessage());
        }
    }
}
