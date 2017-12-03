package demo;

import ignoreme.Dir;
import ignoreme.Domain;
import ignoreme.Jooby;

public class Demo1 extends Jooby {{

    domain(new Domain("the_beatles.com", this) {{
        dir(new Dir("members", this) {{
                get("/", () -> "John, Paul, George, Ringo");
                get("john", () -> "singer, songwriter, musician, and activist");
                get("paul", () -> "singer-songwriter, multi-instrumentalist, and composer");
                get("george", () -> "guitarist, singer-songwriter, and producer");
                get("ringo", () -> "drummer, singer, songwriter and actor");
                // Directory nesting:
                dir(new Dir("stats", this) {{
                    get("still-with-us", () -> {
                        return "2/4";
                    });
                    get("average-age", () -> {
                        return "62.5";
                    });
                }});
            }});
        get("/", () -> "Great band from the 60's. Sadly long split up");

    }});

    // Host a second domain in the same Jooby instance:

    domain(new Domain("the_rolling_stones", this) {{
        get("/", () -> {
            return "Rock band formed in 1962 with an original lineup of Brian Jones, Mick Jagger, Keith Richards, Bill Wyman, Charlie Watts, and Ian Stewart";
        });
    }});

}


    public static void main(String[] args) {
        new Demo1();
    }

}
