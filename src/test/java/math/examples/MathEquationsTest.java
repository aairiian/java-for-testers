package math.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathEquationsTest {

    @Test

    public void equationsInDegree(){
        int x2 = 2;
        int y2 = 2;
        System.out.println("squaring the number of 2 = " + (int)Math.pow(x2,y2));
        assertEquals("squaring the number of 2", 4, (int)Math.pow(x2,y2));
    }


}
