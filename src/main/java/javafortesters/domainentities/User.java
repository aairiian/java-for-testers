package javafortesters.domainentities;

public class User {

    public String username;
    public String password;
    public String searchers;

    public User (){
        username = "username";
        password = "password";
        searchers = "parliament";

    }

    public  User (String binbash, String qweqwe) {
        this.username = binbash;
        this.password = qweqwe;
    }

    public String getUsername () {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String asdfasdf) {
        this.password = asdfasdf;
    }

    public String getSearchers() {
        return searchers;
    }

}


