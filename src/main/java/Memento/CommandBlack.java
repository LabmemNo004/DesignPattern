package Memento;

import Chocolate.IChocolate;

import java.util.ArrayList;

public class CommandBlack extends Command{

    public CommandBlack(){
        System.out.println("CommandBlack has been initialized!");
    }
    protected void add(){
        ArrayList<String> pack=this._chocolate.getPack();
        pack.add("black");
        System.out.println("为巧克力增加了一层黑色的包装");
    }
}
