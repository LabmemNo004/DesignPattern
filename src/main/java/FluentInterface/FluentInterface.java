package FluentInterface;

public class FluentInterface {
    private String[] fields;

    private String[] from;

    private String[] where;

    public FluentInterface select(String... fields) {
        this.fields = fields;

        return this;
    }

    public FluentInterface from(String... from) {
        this.from = from;

        return this;
    }

    public FluentInterface where(String... where) {
        this.where = where;

        return this;
    }

    public String getQuery() {

        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder.append("SELECT ")
                .append(String.join(", ", fields))
                .append(" FROM ")
                .append(String.join("", from))
                .append(" WHERE ")
                .append(String.join(" AND ", where));
        return sqlBuilder.toString();
    }

    public static void main(String[] args) {
        FluentInterface sql = new FluentInterface();
        sql.select("a", "b", "c").from("table AS a").where("a=1", "b=1");
        String query = sql.getQuery();
        System.out.println(query);
    }
}
