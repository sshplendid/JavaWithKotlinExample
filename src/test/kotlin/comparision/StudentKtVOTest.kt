package comparision

import org.junit.Assert.*
import org.junit.Test

class StudentKtVOTest {
    @Test
    fun testToString() {
        val obj: StudentKtVO = StudentKtVO(1, "Shawn", "shawn@gmail.com")
        val foo = KotlinUser(1)

        println("data class -> ${obj.toString()}")
        println("normal class -> ${foo.toString()}")
    }

    @Test
    fun testEquals() {
        val foo = StudentKtVO(1, "foo", "abc@aaa.net")
        val bar = StudentKtVO(1, "foo", "abc@aaa.net")

        // `==` 값 비교
        // `===` 객체 비교
        println("data class -> ${foo == bar} ${foo === bar}")
        val foz = KotlinUser(1)
        val baz = KotlinUser(1)

        println("normal class -> ${foz == baz} ${foz === baz}")
        assertEquals(foo, bar)
        assertEquals(foz, baz)
    }
}