package abstractfactory;

import org.junit.Test;

import abstractfactory.myapp.JumpingScorer;

/**
 * @author Jasmine
 * @Date Created in 20:07 2020/12/1
 **/
public class AbstractFactoryDemoTest {

    @Test
    public void AbstractFactoryTest() {
        System.out.println("---------------- 测试设计模式：AbstractFactory 抽象工厂模式 ----------------");
        
        /**
         *新建3个成绩单，并展示每个成绩单的所有评价等级
         */
        JumpingScorer jumpingScorer = new JumpingScorer();

        System.out.println("                                        [ JumpingScorer : addResult() : 跳远记分员添加成绩单到自己的的统计表 ]");
        System.out.println("                                        [ JumpingScorer : createFemaleResult(String name) : 跳远记分员创建女子成绩单 ]");
        System.out.println("                                        [ JumpingScorer : createMaleResult(String name) : 跳远记分员创建男子成绩单 ]");

        jumpingScorer.addResult(jumpingScorer.createFemaleResult("Abby"));
        jumpingScorer.addResult(jumpingScorer.createMaleResult("Bob"));
        jumpingScorer.addResult(jumpingScorer.createFemaleResult("Cindy"));

        jumpingScorer.showResults();
        System.out.println("--------------------------------- END ----------------------------------");
    }
}