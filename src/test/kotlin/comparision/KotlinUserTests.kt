package comparision

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
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
        // 타입을 명시하지 않아도 컴파일러가 추론한다.
        val foo: Int = 3
        val bar = 3L // Long type
        assertTrue(foo is Int)
        assertTrue(bar is Long)

        assertEquals(6, foo + bar)
        assertTrue((foo + bar) is Long)

        val baz = "hello" // String type
    }

    @Test
    fun testExpressionsIf() {
        val number = 3;

        val isEven = if(number%2 == 0) {
            // 짝수
            "Even"
        } else {
            "Odd"
        }

        println("${number}는 짝수인가? $isEven .")

        assertEquals("Odd", isEven)

    }

    @Test
    fun testWhenExpression() {
        val condition: Any = "hello"

        val result = when(condition) {
            1 -> {
                println("이건 숫자")
                1
            }
            "hello" -> {
                println("hello world")
                "world"
            }
            true -> {
                println("It's true!")
                true
            }
            else -> {
                println("else 구문은 꼭 들어가야 함")
                Unit
            }
        }

        println("결과는 -> $result")
    }

    @Test
    fun testLambda() {
        val numbers = listOf("1", "3", "5", "7")

        numbers
            .map { it.toInt() }
            .map { number -> number*2 }
            .forEach { println("forEach -> ${it}") }
    }
}