package javafortesters.chapter005;

import javafortesters.chapter005.domainobject.TestAppEnv;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAppEnvironment {

    @Test
    public void canGetCorrectUrl (){
        assertEquals ("Return Hard Code URL", "http://127.0.0.1:4723", TestAppEnv.getUrl());
        System.out.println("Return URL is " + TestAppEnv.getUrl());
    }
/*/ My version for exercises get only Domain and Port*/
    @Test
    public void canGetOnlyDomain (){
        assertEquals("Returns Domain", "http://127.0.0.1", TestAppEnv.getDomain());
        System.out.println("Returns Domain is " + TestAppEnv.getDomain());
    }

    @Test
    public void canGetOnlyPort (){
        assertEquals("Returns Port", "4723", TestAppEnv.getPort());
        System.out.println("Returns Port is " + TestAppEnv.getPort());
    }

    @Test
    public void canGetDomainFromField (){
        assertEquals("Return DOMAIN from constant field", "http://127.0.0.1", TestAppEnv.DOMAIN);
        System.out.println("Return DOMAIN from constant field " + TestAppEnv.DOMAIN);
    }

    @Test
    public void canGetPortFromField (){
        assertEquals("Return PORT from constant field", "4723", TestAppEnv.PORT);
        System.out.println("Return PORT from constant field " + TestAppEnv.PORT);
    }
}
