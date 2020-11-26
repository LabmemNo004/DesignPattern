package Memento;

import java.util.ArrayList;

public class Memento {

    public Memento(ArrayList<String> history){
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
