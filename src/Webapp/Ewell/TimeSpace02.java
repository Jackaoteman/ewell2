package Webapp.Ewell;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author LY
 * @data Create By 2019-08-24
 */
public class TimeSpace02 {
    public static void main(String[] args) throws ParseException {

        String  time="2019-11-20 10:30:39";

        SimpleDateFormat  dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date parse = dateFormat.parse(time);

        System.out.println(parse);


    }
}
