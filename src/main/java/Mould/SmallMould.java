package Chocolate;

/*模具型号：小型*/
public class SmallMould extends Mould{
    @Override
    public Size getSize() {
        return Size.small;
    }

    @Override
    public void getInfo() {

        System.out.println("型号:"+getSize());
        System.out.println("形状:"+shape.getShape());
        System.out.println("颜色:"+color.getColor());

    }

    public SmallMould(MouldShape s,Color c){
        super(s,c);
        System.out.println("成功创建模具!该模具可以制作，");
        getInfo();
        System.out.println("的巧克力!");
    }
}
