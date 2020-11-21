package Chocolate;

/*模具形状：星形*/
public class StarShaped implements MouldShape{
    @Override
    public Shapes getShape() {
        return Shapes.star;
    }
}
