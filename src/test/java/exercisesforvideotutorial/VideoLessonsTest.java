package exercisesforvideotutorial;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VideoLessonsTest {

    @Test
    public void charAndBoolean () {
        char copyRightSymbol = '\u00a9';
        assertEquals ("Copyright symbol", "©", Character.toString(copyRightSymbol));
        System.out.println("Unicode output was = " + copyRightSymbol);

        char registeredSymbol = '\u00ae';
        assertEquals ("Registered Symbol", "®", Character.toString(registeredSymbol));
        System.out.println("Registered symbol = " +registeredSymbol);

        char rightFacingArmenianEternitySign = '\u058d';
        assertEquals("Armenian Eternity Sing", "\u058D", Character.toString(rightFacingArmenianEternitySign));
        System.out.println("Armenian Eternity Sing:" +rightFacingArmenianEternitySign);

        boolean myBoolean = false;
        boolean myMale = true;


    }
}
