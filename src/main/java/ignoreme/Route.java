package ignoreme;

public class Route {

    public class Definition {

    }
    public class Chain {

    }
    public interface Handler {

        Object handle(Request req) throws Throwable;
    }

    public interface OneArgHandler extends Filter {

        Object handle(Request req) throws Throwable;
    }

    public interface ZeroArgHandler extends Filter {

        Object handle() throws Throwable;
    }
}
