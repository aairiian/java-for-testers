import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestGradleTest {

    @Test
    public void canAddTwoPlusTwo() {
        int answer = 2 + 2;
        assertEquals("2+2=4", 4, answer);
    }

    @Test
    public void canSubtractTwoMinusTwo() {
        int answer = 2 - 2;
        assertEquals("2-2=0", 0, answer);
    }

    @Test
    public void canDivideTwoDivideTwo() {
        int answer = 2 / 2;
        assertEquals("2/2=1", 1, answer);
    }

    @Test
    public void canMultiplyTwoMultiplyTwo() {
        int answer = 2 * 2;
        assertEquals("2*2=4", 4, answer);
    }

}

