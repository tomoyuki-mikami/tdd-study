package com.company.section1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {
    @Test
    public void TestMultiplication() {
        Dollar five = new Doller(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}
