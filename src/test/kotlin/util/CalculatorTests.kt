package util

import org.junit.Assert.assertEquals
import org.junit.Test

class CalculatorTests {

    @Test
    fun testSum() {
        assertEquals(4, Calculator.sum(2, 2))
    }

    @Test
    fun testSub() {
        assertEquals(1, Calculator.sub(3, 2))
    }
}