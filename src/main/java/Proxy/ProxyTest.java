package Proxy;

public class ProxyTest {
    public static void main(String[] args) {
        FactoryProxy factoryProxy = new FactoryProxy();
        System.out.println("测试1：测试代理获取Charlie的余额。");
        factoryProxy.getAccount();
        System.out.println("测试2：测试Charlie通过代理花钱，且余额不足的情况。");
        factoryProxy.reduceAccount((double) 1000);
        System.out.println("测试3：测试Charlie通过代理花钱，余额足够的情况。");
        factoryProxy.reduceAccount((double) 10);
    }
}
