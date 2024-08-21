package at.foswald_lafer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class FeatureATest {

    @Test
    void add() {

        int expected = 7;
        int actual = FeatureA.add(4, 3);

        assertEquals(expected, actual);

    }
}