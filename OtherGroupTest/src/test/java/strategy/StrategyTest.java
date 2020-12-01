package strategy;

import org.junit.Test;

/**
 * @Author: wjm
 * @Date: Created in 2020/12/01
 */
public class StrategyTest {
    @Test
    public void StrategyTest() {
        System.out.println("===========Strategy Test===========");
//        创建动物并进行进食、训练以及表演
        Rabbit rabbit = new Rabbit("Snow", "run");
        rabbit.eat();
        Bird bird = new Bird("Fluffy", "fly");
        bird.eat();
        Fish fish = new Fish("Nemo", "swim");
        fish.eat();
        rabbit.train();
        bird.train();
        fish.train();
        bird.perform();
        fish.perform();
        rabbit.perform();
        System.out.println("===========Strategy Test End===========");
    }
}
