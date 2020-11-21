package Shaped;

/*模具形状：球形*/
public class SphericalShaped implements MouldShape {
    @Override
    public Shapes getShape() {
        return Shapes.spherical;
    }
}
