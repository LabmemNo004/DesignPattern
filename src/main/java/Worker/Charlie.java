package Worker;


import Worker.Attribute.*;
import java.io.Serializable;

public class Charlie extends Person implements Serializable {
    private static Charlie instance=new Charlie();

    private Charlie()
    {
        super(new Attribute("0001","2020-10-01","man",10000));
    }


    public static Charlie getInstance()
    {
        System.out.println("=====使用单例模式=====");
        Charlie temp=instance;
        if(temp==null)
        {
            synchronized (Charlie.class)
            {
                temp=instance;
                if(temp==null)
                {
                    instance=new Charlie();
                    temp=instance;
                }
            }
        }
        return temp;
    }

    /** -----------------------以下为各种调用函数------------------- **/


}
