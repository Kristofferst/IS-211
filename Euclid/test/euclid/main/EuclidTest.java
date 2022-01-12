package euclid.main;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class EuclidTest {
    final Euclid euclid = new Euclid();

    @Test
    void nIs4mIs16() {
        assertEquals (4, euclid.GreatestCommonDivisor(4, 16));
    }

    @Test
    void nIs16mIs4() {
        assertEquals (4, euclid.GreatestCommonDivisor(16, 4));
    }

    @Test
    void nIs15mIs60() {
        assertEquals (15, euclid.GreatestCommonDivisor(15, 60));
    }

    @Test
    void nIs15mIs65() {
        assertEquals (5, euclid.GreatestCommonDivisor(15, 65));
    }

    @Test
    void nIs1052mIs52() {
        assertEquals(4, euclid.GreatestCommonDivisor(1052, 52));
    }

    @Test
    void nIs1920mIs1080() {
        assertEquals(120, euclid.GreatestCommonDivisor(1920, 1080));
    }

    @Test
    void  nIs125463mIs9658(){
        assertEquals(1, euclid.GreatestCommonDivisor(125463, 9658));
    }
}