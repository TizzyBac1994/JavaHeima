package SimpleDateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class SimpleDateformatDemo {
    public static void main(String[] args) throws ParseException {
        //d-->str
        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat();
        String s1 = simpleDateFormat1.format(date1);
        System.out.println(s1);

        //2021/4/29 下午3:35
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat
                ("yyyy.MM.dd G 'at' HH:MM:ss Z");
        String s2 = simpleDateFormat2.format(date1);
        System.out.println(s2);
        //2021.04.29 公元 at 15:04:32 +0100

        System.out.println("-------");
        String s3 = "2048-08-09 11:12:13";
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d3 = simpleDateFormat3.parse(s3);
        System.out.println(d3);
        //格式完全对应上

    }
}
