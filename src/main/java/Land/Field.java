package Land;

/**
 * The type Field.
 * 小块土地类。继承自 Land 基类。
 */
public class Field extends Land {
    /**
     * The Usage.
     * 这块土地的用途
     */
    String _usage;

    /**
     * Instantiates a new Field.
     */
    public Field() { _usage=""; }

    /**
     * Instantiates a new Field.
     *
     * @param usage the usage
     */
    public Field(String usage) {
        this._usage = usage;
    }

    /**
     * Gets usage.
     * 获取土地的用途
     *
     * @return the usage
     */
    public String getUsage() { return _usage; }

    @Override
    public void use() {
        System.out.println("This field is used.");
    }
}
