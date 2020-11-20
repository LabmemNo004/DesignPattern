package Observer;

import Chocolate.Material;
import Chocolate.Color.Colors;

//被观察者的接口，由原材料管理区实现
public interface MaterialObservable {
    public void addObserber(MaterialObserver observer);
    public void removeObserver(MaterialObserver observer);
    public void notifyAllObservers(Material material,Colors color);
}
