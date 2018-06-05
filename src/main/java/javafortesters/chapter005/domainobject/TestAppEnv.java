package javafortesters.chapter005.domainobject;

public class TestAppEnv {

    public static final String DOMAIN = "127.0.0.1";
    public static final String PORT = "4723";

    public static String getUrl () {
        return "http://" + DOMAIN  + ":" +PORT ;
    }

    public static String getDomain() {
        return "http://127.0.0.1";
    }

    public static String getPort() {
        return "4723";
    }
}
