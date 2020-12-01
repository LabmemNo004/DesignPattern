package frontcontroller;

import org.junit.Test;

/**
 * @author Jasmine
 * @Date Created in 20:50 2020/12/1
 **/

public class FrontControllerTest {

    @Test
    public void frontControllerTest(){

        System.out.println("----------------测试设计模式： FrontController 前端控制器模式----------------");

        FrontController start=new FrontController();
        
        /**
         *代表验证其他人身份，名字为Jasmine
         */
        start.identityVerification("Jasmine");
        System.out.println("");
        
        /**
         *代表验证运动员身份，名字为Kant
         */
        start.identityVerification("Kant");
        System.out.println("");
        
        /**
         *代表验证管理员身份，名字为root
         */
        start.identityVerification("root");
        System.out.println("");
        System.out.println("------------------------------- END ----------------------------------");
    }

}
