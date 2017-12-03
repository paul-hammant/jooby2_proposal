package ignoreme;

public class Jooby extends AbstractJoobyComponent implements JoobyComponent {

    public Jooby() {
        System.out.println("Root Jooby= " + System.identityHashCode(this));
    }

    @Override
    public void print(String something) {
        System.out.println("/" + something);
    }

    public Route.Definition get(final String path, final Route.ZeroArgHandler handler) {
        print("get(" + path + ") registered");
        return null;
    }


    public void domain(Domain domain) {
        print("domain(..) method invocation on Jooby " + System.identityHashCode(this));
    }

}