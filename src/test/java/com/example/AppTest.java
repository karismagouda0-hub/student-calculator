
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    App app = new App();

    @Test
    void testAddition() {
        assertEquals(15, app.add(10, 5));
    }

    @Test
    void testSubtraction() {
        assertEquals(5, app.subtract(10, 5));
    }

    @Test
    void testMultiplication() {
        assertEquals(50, app.multiply(10, 5));
    }
}
