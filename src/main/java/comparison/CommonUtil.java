package comparison;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CommonUtil {
    /**
     * Date 객체를 `yyyy-MM-dd` 포맷 스트링으로 리턴
     * @param d
     * @return
     */
    public static String date2Str(Date d) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        return df.format(d);
    }

    /**
     * 스트링이 null이거나 empty("")이면 false, 값이 있으면 true를 리턴
     * @param s
     * @return
     */
    public static boolean isValid(String s) {
        if(s == null || s.equals("")) {
            return false;
        }
        return true;
    }
}
