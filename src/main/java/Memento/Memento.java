package Memento;

import java.io.Serializable;
import java.util.ArrayList;

public class Memento implements Serializable {

    public Memento(ArrayList<String> history){
        System.out.println("========使用备忘录Memento模式========");
        this.history=(ArrayList<String>)history.clone();

    }

    public void setState(ArrayList<String>state){
        this.history=state;
    }

    public ArrayList<String> getState(){
        return this.history;
    }

    private ArrayList<String> history;
}
