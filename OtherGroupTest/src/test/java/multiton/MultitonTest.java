package multiton;

import entity.TrainingRoom;
import org.junit.Test;

/**
 * @Tester Neko
 * @Date: 15:40 2020/12/1
 **/

public class MultitonTest {
    @Test
    public void MultitonTest(){
        System.out.println("=============== TEST [Multiton] ===============");
        RoomDistributor roomDistributor = new RoomDistributor();
        System.out.println("申请训练室——");
        TrainingRoom trainingRoom1 = roomDistributor.applyRoom();
        trainingRoom1.showRoom();
        System.out.println("申请训练室——");
        TrainingRoom trainingRoom2 = roomDistributor.applyRoom();
        trainingRoom2.showRoom();
        System.out.println("申请训练室——");
        TrainingRoom trainingRoom3 = roomDistributor.applyRoom();
        trainingRoom3.showRoom();
        System.out.println("申请训练室——");
        TrainingRoom trainingRoom4 = roomDistributor.applyRoom();
        System.out.println("\n完成使用——");
        trainingRoom3.repayRoom();
        System.out.println("\n申请训练室——");
        trainingRoom4 = roomDistributor.applyRoom();
        trainingRoom4.showRoom();
        System.out.println("=============== TEST END ===============");
    }
}
