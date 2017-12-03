package ignoreme;

public class Domain extends AbstractJoobyComponent implements JoobyComponent {

    private final String domain;
    private final JoobyComponent jooby;

    public Domain(String domain, JoobyComponent jooby) {
        this.domain = domain;
        this.jooby = jooby;
        print("(new domain id=" + System.identityHashCode(this)+ " parent=" + System.identityHashCode(jooby) + ")");

    }

    @Override
    public void print(String something) {
        jooby.print(domain + "/" + something);
    }

}
