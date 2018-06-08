package javafortesters.domainentities;

public class User {

    public String username;
    public String password;

    public User (){
        username = "username";
        password = "password";
    }

    public User (String binbash, String password) {
        this.username = binbash;
        this.password = password;
    }

    public String getUsername () {
        return "username";
    }

    public String getPassword() {

        return "password";
    }
}
