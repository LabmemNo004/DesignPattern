package FluentInterface;

public class FormalOutputInterface extends FluentInterface{

    private String[] from;

    private String[] where;

    public FormalOutputInterface from(String... from) {
        this.from = from;

        return this;
    }

    public FormalOutputInterface where(String... where) {
        this.where = where;

        return this;
    }

    @Override
    public String getQuery() {
        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder.append("SELECT ")
                .append("chocolate")
                .append(" FROM ")
                .append(String.join("", from))
                .append(". Attribute: ")
                .append(String.join(" AND ", where));
        return sqlBuilder.toString();
    }

}
