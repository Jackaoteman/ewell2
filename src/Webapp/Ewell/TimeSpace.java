package Webapp.Ewell;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author LY
 * @data Create By 2019-08-24
 */
public class TimeSpace {
    public static void main(String[] args) {

        Date  date=new Date();
        System.out.println(date);
        SimpleDateFormat  simpleDateFormat=new SimpleDateFormat("HH:mm");
        String format = simpleDateFormat.format(date);
        System.out.println(format);

    }
}
