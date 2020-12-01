package lazyloading;

import java.util.ArrayList;

/**
 * @Author:hzj
 * @Time:2020-12-01
 **/
public class LazyLoadingDemo {
    public static void lazyLoadingTest(){
        System.out.println("公布官方工作人员信息");
        StuffInfoListProxy stuffInfoListProxy=new StuffInfoListProxy();
        System.out.println("调用代理获得工作人员信息列表");
        ArrayList<Stuff> stuffList=stuffInfoListProxy.getStuffList();
        for (Stuff stuff:stuffList){
            System.out.println(stuff);
        }
    }
}
