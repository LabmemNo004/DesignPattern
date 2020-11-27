package Observer;

import Color.Color.Colors;

import java.io.Serializable;

//被观察者的接口，由原材料管理区实现
public interface MaterialObservable extends Serializable {
    public void addObserber(MaterialObserver observer);
    public void removeObserver(MaterialObserver observer);
    public void notifyAllObservers(Colors color);
}
