package de.htw_berlin.fb4.ossd.beheshta;
import junit.framework.TestCase;

public class TongueTwisterTest extends TestCase{
    public void testGet() {

        TongueTwister sentence =
                new TongueTwister();

        assertEquals(
                "Fischers Fritz fischt frische Fische, frische Fische fischt Fischers Fritz.",
                sentence.get()
        );
    }
}
