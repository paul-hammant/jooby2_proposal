Proposal to Edgar for extended Jooby syntax:

```
mvn install
mvn exec:java -Dexec.mainClass="demo.Demo1"
```

results in:

```
Root Jooby= 1880809713
/the_beatles.com/(new domain id=1331668887 parent=1880809713)
/the_beatles.com/members/(new dir id=1101034764 parent=1331668887)
/the_beatles.com/members/get(/) registered
/the_beatles.com/members/get(john) registered
/the_beatles.com/members/get(paul) registered
/the_beatles.com/members/get(george) registered
/the_beatles.com/members/get(ringo) registered
/the_beatles.com/members/stats/(new dir id=1705592243 parent=1101034764)
/the_beatles.com/members/stats/get(still-with-us) registered
/the_beatles.com/members/stats/get(average-age) registered
/the_beatles.com/members/dir(..) method invocation on Dir 1101034764
/the_beatles.com/dir(..) method invocation on Domain 1331668887
/the_beatles.com/get(/) registered
/domain(..) method invocation on Jooby 1880809713
/the_rolling_stones/(new domain id=727227237 parent=1880809713)
/the_rolling_stones/get(/) registered
/domain(..) method invocation on Jooby 1880809713
```

... or similar enough