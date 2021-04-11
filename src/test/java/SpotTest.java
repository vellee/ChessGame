import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class SpotTest {

    @Test
    public void validSpotTest() {
        Spot newSpot = new Spot("a", 1);
        Assertions.assertNotNull(newSpot);
        Assertions.assertEquals("a", newSpot.getX());
        Assertions.assertEquals(1, newSpot.getY());
    }

    @Test
    public void invalidXValueTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Spot newSpot = new Spot("q", 8);
        });


    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 0, 100})
    public void invalidYValueParamsTest(int y) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Spot newSpot = new Spot("h",y);
        });
    }


}
