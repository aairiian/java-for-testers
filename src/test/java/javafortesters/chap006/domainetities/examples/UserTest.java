package javafortesters.chap006.domainetities.examples;

import javafortesters.domainentities.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class UserTest {

    @Test
    public void userHasDefaultUsernameAndPassword() {

        User user = new User();
        assertEquals("Default username is expected", "username", user.getUsername());
        System.out.println("Default username is expected: " + user.getUsername());

        assertEquals("Default password is expected ", "password", user.getPassword());
        System.out.println("Default password is expected: " + user.getPassword());

    }

    @Test
    public void userHasNotDefaultUsername() {

        User sudo = new User();
        sudo.username = "sudo";
        assertEquals("Username is sudo", "sudo", sudo.username);
        System.out.println("Username = " + sudo.username);
    }

    @Test
    public void userConstractWithArguments() {

        User user = new User ("binbash", "qweqwe");
        assertEquals("Return real credentials", "binbash", user.getUsername());
        assertEquals("Return real password ", "qweqwe", user.getPassword());
        System.out.println("Real username is " + user.getUsername());
        System.out.println("Real password is " + user.getPassword());

    }


}