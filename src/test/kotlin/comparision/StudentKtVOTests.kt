package comparision

import org.junit.Assert.*
import org.junit.Test

class StudentKtVOTests {
    @Test
    fun testToString() {
        val obj: StudentKtVO = StudentKtVO(1, "Shawn", "shawn@email.me")
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
        assertNotEquals(foz, baz)
    }

    @Test
    fun testDestructinAssignments() {
        val obj: StudentKtVO = StudentKtVO(1, "Shawn", "shawn@email.me")
        // val foo = KotlinUser(1)

        val (id, name, email) = obj; // 주 생성자 파라미터 순서대로 할당o
        //val (bar) = foo

        assertEquals(1, id)
        assertEquals("Shawn", name)
        assertEquals("shawn@email.me", email)
    }
}