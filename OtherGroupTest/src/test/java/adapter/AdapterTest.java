package adapter;

import org.junit.Test;

/**
 * @Author Max Leung
 * @Description:
 * @Date: Created in 20:35 2020/12/01
 * @Modified By:IsabelleCur
 **/
public class AdapterTest {

    @Test
    public void adapterTest(){
        System.out.println("---------------- [Pattern] Adapter----------------");
        AdapterDemo adapterDemo = new AdapterDemo();
        adapterDemo.adapterTest();
        System.out.println("------------------------ END ------------------------");
    }
}
