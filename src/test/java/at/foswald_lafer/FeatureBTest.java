package at.foswald_lafer;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FeatureBTest {

    @Test
    public void multiplierTest() {
        assertEquals(25,FeatureB.multiplier(5,5));

    }
}
