package businessdelegate;
import org.junit.Test;
/*
* @Author:Sophie
* @Date:2020/12/01 22:07
* */
public class BusinessDelegateTest {
    @Test
    public void businessDelegateTest() {
        System.out.println("---------------- 业务代表 BusinessDelegate 模式----------------");
        try {
            QueryDelegate MyqueryDelegate = new QueryDelegate(OfflineQuery.class.getName());
            MyqueryDelegate.setQueryType();
            Dog dogAthlete = new Dog(queryDelegate);
            dogAthlete.doQuery();
        } catch (ClassNotFoundException e) {
            System.out.println("此查询类型不存在！");
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        } catch (InstantiationException e) {
            System.out.println(e.getMessage());
        }

    }
}
