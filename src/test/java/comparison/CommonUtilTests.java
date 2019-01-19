package comparison;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class CommonUtilTests {

    @Test
    public void date2Str() {
        String expected = "2019-01-19";
        Date current = new Date(System.currentTimeMillis()); // 테스트 시점에 맞춰 날짜를 변경해야 함

        assertEquals(expected, CommonUtil.date2Str(current));
    }

    @Test
    public void isValid_내용있는문자열을받으면_true를리턴한다() {
        String given = "hello";
        assertTrue(CommonUtil.isValid(given));
    }

    @Test
    public void isValid_내용없는문자열을받으면_false를리턴한다() {
        String given = "";
        assertFalse(CommonUtil.isValid(given));
    }
    @Test
    public void isValid_null문자열객체를받으면_false를리턴한다() {
        String given = null;
        assertFalse(CommonUtil.isValid(given));
    }
    @Test
    public void isValid_빈String객체를받으면_false를리턴한다() {
        String given = new String();
        assertFalse(CommonUtil.isValid(given));
    }


    /*
    그런데 CommonUtil은 비슷한 기능을 모아놓은 클래스인가?
    isValid를 String객체에서 바로 사용하면 더 편하겠다.
    date2Str를 Date객체에서 쓸수 있다면?
     */
}