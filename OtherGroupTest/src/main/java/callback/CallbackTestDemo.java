package callback;

import entity.ScoreBoard;
/**
 * @Tester Neko
 * @Date: 15:20 2020/12/1
 **/

public class CallbackTestDemo {
    static public void callbackTest(){
        ScoreBoard scoreBoard = new ScoreBoard();
        GetScoreBoard getScoreBoard = new GetScoreBoard(scoreBoard);
        for(int i=0;i<10;i++){
            Competition competition = new Competition(scoreBoard);
            System.out.println("=============== TEST ===============");
            System.out.println("                                        " +
                    "{ Competition : executer() : 调用一个回调模式的工作流 }");
            competition.executer(getScoreBoard);
        }
    }
}
