package ignoreme;

public interface JoobyComponent {

    void print(String something);

    Route.Definition get(final String path, final Route.ZeroArgHandler handler);

    void dir(Dir dir);
}
