package Webapp.Ewell;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author LY
 * @data Create By 2019-08-24
 */
public class TimeSpace {
    public static void main(String[] args) {
        System.out.println("啊······················   啊啊啊啊啊啊啊啊啊啊啊 ");
        System.out.println("啊······················   啊啊啊啊啊啊啊啊啊啊啊 ");
        System.out.println("啊······················   啊啊啊啊啊啊啊啊啊啊啊 ");
        Date  date=new Date();
        System.out.println(date);
        System.out.println("我不知道。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。");
        SimpleDateFormat  simpleDateFormat=new SimpleDateFormat("HH:mm");
        String format = simpleDateFormat.format(date);
        System.out.println(format);
        System.out.println("你知道吗？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？？");

    }
}
