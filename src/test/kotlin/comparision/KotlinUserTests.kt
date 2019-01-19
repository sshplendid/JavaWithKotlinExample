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
}