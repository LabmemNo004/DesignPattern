package FrontController;

public class FrontController {
    private Dispatcher dispatcher;


    public FrontController(){
        dispatcher=new Dispatcher();
    }


    public boolean isAuthenticUser() {
        System.out.println("User:Charlie is authenticated successfully");
        return true;
    }

    private void trackRequest(String request){
        System.out.println("Produce requested: " + request);
    }

    public void dispatchRequest(String request) {

        trackRequest(request); //记录生产请求
        if(isAuthenticUser()){ //对用户进行身份验证
            dispatcher.dispatch(request);
        }
    }
}
