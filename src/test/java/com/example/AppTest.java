package com.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class AppTest {
    @Test public void testLargest() { assertEquals(25, new App().largest(12, 25, 9)); }
    @Test public void testNegativeNumbers() { assertEquals(-2, new App().largest(-8, -2, -5)); }
}