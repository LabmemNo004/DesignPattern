package Land;

import java.io.Serializable;

/**
 * The type Land.
 * 土地基类。
 */
public class Land implements Serializable {
    String _usage;
    public Land(String usage){this._usage = usage;};
    public Land() { _usage=""; }
    public void use(){};
}
