package no.kristiania;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatzyTest {

    @Test
    public void testScore() {
        assertEquals(4, new YatziGame().score("ONES", new int[] { 1, 1, 2, 3, 2 }));
    }
}
