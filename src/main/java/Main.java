import Factory.Factory;

public class Main {
    public static void main(String[] args){

        // 初始化农场，根据调用关系先后用到了以下设计模式：
        // 双重检查锁模式
        // 建造者模式
        // 抽象工厂模式
        // 享元模式
        // 桥接模式
        // 多例模式
        // 私有类数据模式
        // 组合模式
        Factory factory = Factory.getInstance();
    }
}
