package no.kristiania;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatzyTest {

    @Test
    public void testScore() {
        assertEquals(4, new YatziGame().score("ONES", new int[] { 1, 1, 2, 3, 2 }));
    }

    @Test
    void shouldCalculateForOnes() {
        assertEquals(0, new YatziGame().score("ONES", new int[] { 2, 3, 4, 5, 6 }));
        assertEquals(3, new YatziGame().score("ONES", new int[] { 2, 1, 4, 1, 1 }));
        assertEquals(5, new YatziGame().score("ONES", new int[] { 1, 1, 1, 1, 1 }));
    }
}
