package Chocolate;

/*模具形状接口
* 继承该接口的类：StarShaped,HeartShaped,SquareShaped,SphericalShaped*/
public interface MouldShape {
    public static enum Shapes{star,heart,square,spherical};//四种模具形状
    public Shapes getShape();//获取模具形状
}
