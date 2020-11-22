package Memento;

import Chocolate.IChocolate;

import java.util.ArrayList;

public class CommandWhite extends Command{
    public CommandWhite(){
        System.out.println("CommandWhite has been initialized!");
    }
    protected void add(){
        ArrayList<String> pack=this._chocolate.getPack();
        pack.add("white");
        System.out.println("为巧克力增加了一层白色的包装");
    }

}
