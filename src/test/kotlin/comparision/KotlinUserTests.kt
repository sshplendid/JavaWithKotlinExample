package comparision

import org.junit.Assert.*
import org.junit.Test

class KotlinUserTests {

    @Test
    fun testKotlinUser() {
        val obj = KotlinUser(1)
        println("나는 ${obj.name}, 내 나이는 ${obj.age}.")
        assertEquals(32, obj.age)

        obj.age += 1
        println("나는 ${obj.name}, 내 나이는 ${obj.age}.")

        assertEquals(33, obj.age)
        assertEquals("old Shawn", obj.name)

    }

    @Test
    fun testNPE() {
        val obj: KotlinUser? = null
        obj?.age = 10
        println("내 나이는 ${obj?.age}")
    }

    @Test
    fun testNullSafety() {
        val obj: KotlinUser? = null

        obj?.let {
            println("Not null")
            assertEquals(32, it.age)
        }
        // obj가 null이면 하위 로직이 실행되지 않기때문에, null 처리 필요가 없음
    }

    @Test
    fun typeInference() {
        val foo: Int = 3
        val bar = 3L // Long type
        assertTrue(foo is Int)
        assertTrue(bar is Long)

        assertEquals(6, foo + bar)
        assertTrue((foo + bar) is Long)

        val baz = "hello" // String type
    }
}