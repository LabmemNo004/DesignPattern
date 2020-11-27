package FrontController;

import java.io.Serializable;

public class FrontController implements Serializable {
    private Dispatcher dispatcher;


    public FrontController(){
        dispatcher=new Dispatcher();
    }


    public boolean isAuthenticUser() {
        System.out.println("======== 使用FrontController前端控制器 模式 ========");
        System.out.println("用户：Charlie身份认证成功");
        return true;
    }

    private void trackRequest(String request){
        System.out.println("巧克力生产请求: " + request);
    }

    public void dispatchRequest(String request) {

        trackRequest(request); //记录生产请求
        if(isAuthenticUser()){ //对用户进行身份验证
            dispatcher.dispatch(request);
        }
    }
}
