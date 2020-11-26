package Memento;

import Chocolate.IChocolate;

import java.util.ArrayList;

public abstract class Command {
    protected IChocolate _chocolate;
    protected static Memento[] _mementoList=new Memento[20];
    protected static Command[] _commandList=new Command[20];
    protected static int _numCommand=0;
    protected static int _highWater=0;

    protected abstract void add();


    public void execute(){
        _mementoList[_numCommand]=_chocolate.createMemento();
        _commandList[_numCommand]=this;
        _highWater=_numCommand;
        _numCommand++;
        add();
    }

    public static void undo(){
        if(_numCommand==0)
        {
            System.out.println("***Attempt to run of end!***");
            return;
        }
        _commandList[_numCommand-1]._chocolate.reinstateMemento(_mementoList[_numCommand-1]);
        System.out.println("***Undo!***");
        _numCommand--;


    }
    public static void redo(){
        if(_numCommand>_highWater){
            System.out.println("***Attempt to run of end!***");
            return;
        }
        System.out.println("***Redo!***");
        _commandList[_numCommand].add();

        _numCommand++;
    }

    public void setReceiver(IChocolate chocolate){
        this._chocolate=chocolate;
    }

}
