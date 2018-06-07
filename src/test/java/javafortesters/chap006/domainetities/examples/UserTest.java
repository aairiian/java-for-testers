package javafortesters.chap006.domainetities.examples;

import javafortesters.domainentities.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void canConstractANewUser (){

        User user = new User();

         assertEquals("Return default username", "sudo", user.getUsername());
        System.out.println("Username = " + user.getUsername());

         assertEquals( "Return default password", "qweqwe", user.getPassword());
        System.out.println("Password = " + user.getPassword());
    }
}
