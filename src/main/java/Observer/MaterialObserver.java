package Observer;

import Chocolate.Color.Colors;

//观察者的接口，由Charlie实现
public interface MaterialObserver {
    public void update(Colors color);
}
