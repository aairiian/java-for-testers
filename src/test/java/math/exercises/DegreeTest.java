package math.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DegreeTest {

    @Test
    public void canDegree (){
        int x2 = 2;
        int y2 = 3;
        assertEquals("value 2 in degree 3 ", "8", Math.pow(x2, y2));
        System.out.println("return add value " + Math.pow(x2, y2));
    }
}
