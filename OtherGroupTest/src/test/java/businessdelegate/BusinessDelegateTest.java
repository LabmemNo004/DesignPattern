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
        try {
            QueryDelegate MyqueryDelegate = new QueryDelegate(OfflineQuery.class.getName());
            MyqueryDelegate.setQueryType();
            Dog ADogathlete = new Dog(MyqueryDelegate);
            ADogathlete.doQuery();
        } catch (ClassNotFoundException e) {
            System.out.println("此查询类型不存在！");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
