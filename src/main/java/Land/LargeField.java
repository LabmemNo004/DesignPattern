package Land;

/**
 * The type Large field.
 */
public class LargeField extends Land{
    /**
     * The Usage.
     * 这块土地的用途
     */


    /**
     * Instantiates a new Large field.
     */
    public LargeField() { _usage=""; }

    /**
     * Instantiates a new Large field.
     *
     * @param usage the usage
     */
    public LargeField(String usage) {
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
        System.out.println("This large field is used.");
    }
}
