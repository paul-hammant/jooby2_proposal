package ignoreme;

public class Dir extends AbstractJoobyComponent implements JoobyComponent {

    private final String dirname;
    private final JoobyComponent jooby;

    public Dir(String dirname, JoobyComponent jooby) {
        this.dirname = dirname;
        this.jooby = jooby;
        print("(new dir id=" + System.identityHashCode(this)+ " parent=" + System.identityHashCode(jooby) + ")");
    }

    @Override
    public void print(String something) {
        jooby.print(dirname + "/" + something);

    }

}
