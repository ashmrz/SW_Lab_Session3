package tests;

import bridge.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BridgeTests {

    @Test
    void testPowerWithMult11() {
        PowerWithMult powerWithMult = new PowerWithMult(new Pow1(), new Mult1());
        assertEquals(powerWithMult.calculate(2, 5), 32);
        assertEquals(powerWithMult.calculate(4, 0.5), 2);
        assertEquals(powerWithMult.calculate(2, -1), 0.5);
    }

    @Test
    void testPowerWithMult12() {
        PowerWithMult powerWithMult = new PowerWithMult(new Pow1(), new Mult2());
        assertEquals(powerWithMult.calculate(2, 5), 32);
        assertEquals(powerWithMult.calculate(4, 0.5), 2);
        assertEquals(powerWithMult.calculate(2, -1), 0.5);
    }

    @Test
    void testPowerWithMult21() {
        PowerWithMult powerWithMult = new PowerWithMult(new Pow2(), new Mult1());
        assertEquals(powerWithMult.calculate(2, 5), 32);
        assertEquals(powerWithMult.calculate(4, 0.5), 2);
        assertEquals(powerWithMult.calculate(2, -1), 0.5);
    }

    @Test
    void testPowerWithMult22() {
        PowerWithMult powerWithMult = new PowerWithMult(new Pow2(), new Mult2());
        assertEquals(powerWithMult.calculate(2, 5), 32);
        assertEquals(powerWithMult.calculate(4, 0.5), 2);
        assertEquals(powerWithMult.calculate(2, -1), 0.5);
    }
}
