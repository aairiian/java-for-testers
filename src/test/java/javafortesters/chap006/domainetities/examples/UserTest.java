package javafortesters.chap006.domainetities.examples;

import javafortesters.domainentities.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class UserTest {

    @Test
    public void userHasDefaultUsernameAndPassword() {

        User user = new User();
        assertEquals("Default username is expected", "username", user.getUsername());
        System.out.println("Default username is expected: " +user.getUsername());

        assertEquals("Default password is expected ", "password", user.getPassword());
        System.out.println("Default password is expected: " + user.getPassword());

    }
}