package comparison;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentVOTests {
    @Test
    public void testStudentVO() {
        StudentVO obj = new StudentVO(1, "Shawn", "shawn@gmail.com");
        JavaUser foo = new JavaUser(1);

        System.out.println("normal class -> " + obj.toString());
        System.out.println("also normal class -> " + foo.toString());
    }
}