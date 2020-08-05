import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class lightsaberTest {

    @Test
    public void testCharge(){
        Lightsaber lightsaber = new Lightsaber(10128);
        lightsaber.setCharge(12);

        float expected = 12;
        float actual = lightsaber.getCharge();

        assertEquals(expected, actual);
    }

    @Test
    public void testColor(){
        Lightsaber lightsaber = new Lightsaber(10128);
        lightsaber.setColor("red");

        String expected = "red";
        String actual = lightsaber.getColor();

        assertEquals(expected, actual);
    }

    @Test
    public void testUse(){
        Lightsaber lightsaber = new Lightsaber(10128);
        lightsaber.setCharge(100.0f);
        lightsaber.use(6.0f);

        float expected = 99.0f;
        float actual = lightsaber.getCharge();

        assertEquals(expected, actual);
    }

    @Test
    public void testRemainingMinutes(){
        Lightsaber lightsaber = new Lightsaber(10128);
        lightsaber.setCharge(100.0f);
        lightsaber.use(6.0f);

        float expected = 297.0f;
        float actual = lightsaber.getRemainingMinutes();

        assertEquals(expected, actual);
    }
}
