package Observer;

import Chocolate.Material;
import Chocolate.Color.Colors;

//观察者的接口，由Charlie实现
public interface MaterialObserver {
    public void update(Material material,Colors color);
}
