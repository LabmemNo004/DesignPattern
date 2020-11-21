package Chocolate;

/*模具形状：球形*/
public class SphericalShaped implements MouldShape{
    @Override
    public Shapes getShape() {
        return Shapes.spherical;
    }
}
