package FrontController;

/*FrontController+Strategy 模式测试*/
public class FrontControllerTest {
    public static void main(String[] args){
        FrontController frontController=new FrontController();
        frontController.dispatchRequest("BigHeartBlackChocolate");
    }
}
