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

        /* check length username and password */
        assertEquals("Length of useername", 8, user.getUsername().length());
        System.out.println("length of username = " + user.getUsername().length());
        assertEquals("Length of password", 8, user.getPassword().length());
        System.out.println("Length of password = " + user.getPassword().length());


    }

    @Test
    public void canConstructWithUsername() {

        User sudo = new User();
        sudo.username = "sudo";
        assertEquals("Username is sudo", "sudo", sudo.username);
        System.out.println("Username  = " + sudo.username);
    }

    @Test
    public void canSetNameToInvalidValue(){

        User sudo = new User();
        sudo.username = "12@$%";
        assertEquals("Invalid username", "12@$%", sudo.username);
        System.out.println("Invalid username " + sudo.username);
    }

    @Test
    public void userConstractWithArguments() {

        User user = new User ("binbash", "qweqwe");
        assertEquals("Return real credentials", "binbash", user.getUsername());
        assertEquals("Return real password ", "qweqwe", user.getPassword());
        System.out.println("Real username is " + user.getUsername());
        System.out.println("Real password is " + user.getPassword());

    }
/* Setter method / */
    @Test
    public void canSetPasswordAfterConstructed(){
        User user = new User();
        user.setPassword("asdfasdf");
        assertEquals("setter password is expected", "asdfasdf", user.getPassword());
        System.out.println("Setter password is expected: " + user.getPassword());
        assertEquals("check length parameters", 8, user.getPassword().length());
        System.out.println("length of getpassword = " + user.getPassword().length());
    }
/* Use length method to check count characters username  / */
    @Test
    public void canReturnLengthUsername(){
        User user = new User();
        user.username = "boboss";
        assertEquals("return username length = 6 characters", 6, user.username.length());
        System.out.println("Return username length = " + user.username.length());
    }

    /* Use length method to check count characters password  / */

    @Test
    public void canReturnLengthPassword(){
        User user = new User();
        user.password = "qweqwe";
        assertEquals("Return password length = 6 characters", 6, user.password.length());
        System.out.println("return password length = " + user.password.length());
    }

    @Test
    public void canANewStringGetter(){
        User user = new User();
        System.out.println("return search result " + user.getSearchers());
        assertEquals("return search keyword", "parliament", user.getSearchers());
        assertEquals("return search keyword length", 10, user.getSearchers().length());
    }



}