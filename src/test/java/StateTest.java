import State.*;


import org.junit.Test;

public class StateTest {
	
	@Test
	public void Test() {
		Context context = new Context(); //创建环境      
		context.jumpState(); //处理请求
		context.jumpState(); //处理请求
        context.jumpState(); //处理请求
	    context.jumpState(); //处理请求	
	    context.jumpState(); //处理请求	
	    context.jumpState(); //处理请求	
	    System.out.println("当前的状态值是 "+context.getState());
	}
		    
}
