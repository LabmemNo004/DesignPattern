package Observer;

import Color.Color.Colors;

import java.io.Serializable;

//观察者的接口，由Charlie实现
public interface MaterialObserver extends Serializable {
    public void update(Colors color);
}
