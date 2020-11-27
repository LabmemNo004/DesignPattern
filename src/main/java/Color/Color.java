package Color;

import java.io.Serializable;

/*巧克力颜色接口
* 继承该接口的类：WhiteColor,BlackColor*/
public interface Color extends Serializable {
    public static enum Colors{white,black};//两种颜色
    public Colors getColor();//获取颜色
}
