module org.wchill.jsoup {
    exports org.wchill.jsoup;
    exports org.wchill.jsoup.helper;
    exports org.wchill.jsoup.nodes;
    exports org.wchill.jsoup.parser;
    exports org.wchill.jsoup.safety;
    exports org.wchill.jsoup.select;

    requires transitive java.xml;  // for org.w3c.dom out of W3CDom
    requires static org.jspecify;  // nullability annotations
    requires static java.net.http; // HttpClient on Java 11; guarded
}
