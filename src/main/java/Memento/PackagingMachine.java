package Memento;

import Chocolate.IChocolate;

import java.util.ArrayList;


public class PackagingMachine {
    private IChocolate _chocolate;
    private Command[] _commandList;

    /*
    传入一个巧克力时重新调整机器
     */
    public PackagingMachine()
    {
        _commandList=new Command[2];
        _commandList[0]=new CommandBlack();
        _commandList[1]=new CommandWhite();

        System.out.println("PackagingMachine has been initialized!");

    }
    public void resetMachine(IChocolate chocolate){
        this._chocolate=chocolate;
        _commandList[0].setReceiver(chocolate);
        _commandList[1].setReceiver(chocolate);
        Command._numCommand=0;
        Command._highWater=0;
        Command._commandList=new Command[20];
        Command._mementoList=new Memento[20];
        run();
    }
    /*
    机器运行，为巧克力进行包装
    */
    private void run(){
        int pointer=0;
        ArrayList<String>packInfo=_chocolate.getPackInfo();
        int sizePack=packInfo.size();
        while(sizePack>pointer){
            String target=packInfo.get(pointer);
            if(target.equals("black")){
                _commandList[0].execute();
            }
            else{
                _commandList[1].execute();
            }
            pointer=Command._numCommand;
            //测试redo /undo
            if(pointer==3) {
                Command.undo();
                Command.undo();
                Command.redo();
                Command.redo();
            }

        }
    }
}
