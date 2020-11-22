package Shaped;

/*模具形状：正方形*/
public class SquareShaped implements MouldShape {
    @Override
    public Shapes getShape() {
        return Shapes.square;
    }
}
