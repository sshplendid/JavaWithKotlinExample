package comparision

import org.junit.Test

import org.junit.Assert.*
import java.util.*

class CommonExtensionsKtTest {

    @Test
    fun date2Str() {
        val expected = "2019-01-19"
        val date = Date(System.currentTimeMillis())

        assertEquals(expected, date.date2Str())
    }

    @Test
    fun isValid_내용있는문자열을받으면_true를리턴한다() {
        val given = "hello"
        assertTrue(given.isValid())
    }
    @Test
    fun isValid_내용없는문자열을받으면_False를리턴한다() {
        val given = ""
        assertFalse(given.isValid())
    }
    @Test
    fun isValid_null객체를받으면_true를리턴한다() {
        val given: String? = null // ?
        assertFalse(given?.isValid() == true)
    }

    @Test
    fun isValid_빈String객체를받으면_false를리턴한다() {
        val given = String()
        assertFalse(given.isValid())
    }
}