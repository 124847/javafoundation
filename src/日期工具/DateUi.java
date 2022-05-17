package 日期工具;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateUi {
    private DateUi() {

    }

    public static String dateToString(Date date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String s = sdf.format(date);
        return s;
    }

    public static Date stringTodate(String s, String format) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.parse(s);
    }

}
