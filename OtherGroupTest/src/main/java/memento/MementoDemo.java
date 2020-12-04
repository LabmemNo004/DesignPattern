package memento;

import entity.Athlete;
import entity.Event;
import entity.Species;

/**
 * description: 备忘录模式(memento)调用类
 * data: 11/13/20 17:25 PM
 * author: cjsmt
 */
public class MementoDemo {

    public static void mementoTest(){
        EventEntryForm eventEntryForm = new EventEntryForm(Event.RUN);
        MemoManager memoManager = new MemoManager();
        Athlete athlete1 = new Athlete("Amy", Species.Bird);
        Athlete athlete2 = new Athlete("Bob", Species.Insect);
        Athlete athlete3 = new Athlete("Candy", Species.Cat);
        Athlete athlete4 = new Athlete("David", Species.Frog);
        Athlete athlete5 = new Athlete("Eric", Species.Fish);
        memoManager.setEntryFormMemo(eventEntryForm.createMemo());  //创建备忘录
        eventEntryForm.processRegistration(memoManager.getEntryFormMemo(), athlete1);  //处理报名
        memoManager.setEntryFormMemo(eventEntryForm.createMemo());  //创建备忘录
        eventEntryForm.processRegistration(memoManager.getEntryFormMemo(), athlete2);  //处理报名
        memoManager.setEntryFormMemo(eventEntryForm.createMemo());  //创建备忘录
        eventEntryForm.processRegistration(memoManager.getEntryFormMemo(), athlete3);  //处理报名
        memoManager.setEntryFormMemo(eventEntryForm.createMemo());  //创建备忘录
        eventEntryForm.processRegistration(memoManager.getEntryFormMemo(), athlete4);  //处理报名
        memoManager.setEntryFormMemo(eventEntryForm.createMemo());  //创建备忘录
        eventEntryForm.processRegistration(memoManager.getEntryFormMemo(), athlete5);  //处理报名

    }
}
