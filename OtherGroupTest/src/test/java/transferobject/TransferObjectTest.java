package transferobject;

import entity.Cat;
import org.junit.Test;
import java.util.ArrayList;
/**
 * Author: Wenkai Tian
 * Date: 2020/12/1,15:55
 * Version: 1.0
 */
public class TransferObjectTest {

    @Test
    public void transferObjectTest() {
        System.out.println("====== 测试 TransferObject 设计模式 ======");
        //录入个人信息
        ArrayList<String> sportEventsTest = new ArrayList<String>();
        sportEventsTest.add("乒乓");
        sportEventsTest.add("篮球");
        sportEventsTest.add("跳远");
        PersonalInformation personalInformation = new PersonalInformation();
        personalInformation.setAge(15);
        personalInformation.setEntryNumber(777);
        personalInformation.setGender("男");
        personalInformation.setName("猫皇");
        personalInformation.setSportEvents(sportEventsTest);

        //新建运动员
        Cat catKing = new Cat(personalInformation);

        //创建查询对象
        QuerySystem querySystem = new QuerySystem();

        //进行查询
        querySystem.query(catKing.getPersonalInformation(), querySystem); //第一次查询不到创建
        querySystem.query(catKing.getPersonalInformation(), querySystem); //第二次查询到显示查询结果
        System.out.println("====== 测试完毕 ======");
    }
}
