package comparison;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class JavaUserTests {
    @Test
    public void test() {
        JavaUser obj = new JavaUser(1);

        System.out.println("나는 " + obj.getName() + ", 내 나이는 " + obj.getAge());

        assertEquals(32, obj.getAge());
        //obj.age += 1;
        obj.setAge(obj.getAge()+1);
        System.out.println("나는 " + obj.getName() + ", 내 나이는 " + obj.getAge());
        assertEquals(33, obj.getAge());
    }

    @Ignore
    @Test
    public void testSuccess() {
        //무조건 성공
        assertEquals(4, 2+2);
    }

    @Ignore
    @Test
    public void testFail() {
        //무조건 성공
        assertEquals(-4, 2+2);
    }

    //@Ignore
    @Test
    public void testNPE() {
        JavaUser user = null;
        user.setAge(10);
        System.out.println("내 나이는 " + user.getAge()); // null 객체의 멤버를 접근하려 해서 NPE
    }

    @Test
    public void testNullSafety() {
        JavaUser obj = null;

        if(obj != null) {
            System.out.println("Not null");
            assertEquals(32, obj.getAge());
        } else {
            System.out.println("객체가 null이기 때문에 처리로직 구성하자");
        }
    }
}
