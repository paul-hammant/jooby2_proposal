package ignoreme;

public abstract class AbstractJoobyComponent implements JoobyComponent {

    public void dir(Dir dir) {
        Class clazz = this.getClass();
        if (clazz.getSimpleName().equals("")) {
            clazz = clazz.getSuperclass();
        }
        print("dir(..) method invocation on " + clazz.getSimpleName() + " " + System.identityHashCode(this));
    }

    public Route.Definition get(final String path, final Route.ZeroArgHandler handler) {
        print("get(" + path + ") registered");
        return null;
    }


}
