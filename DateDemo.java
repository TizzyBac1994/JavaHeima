package Date;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(d1);

        long date = 1000*60*60;
        Date d2 = new Date(date);
        System.out.println(d2);

        //create obj
        Date d3 = new Date();
        System.out.println(d3.getTime()/1.0/1000/60/60/24/365);

        //set time
        long time = 1000*60*60;
        d1.setTime(time);
        System.out.println(d1);
    }
}
