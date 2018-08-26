package demo;

import java.text.SimpleDateFormat;

public class DemoTest2 {

    public static void main(String[] args) {
        System.out.println(64444729);
        long time = System.currentTimeMillis();
        System.out.println(time);
        SimpleDateFormat dateFormat =  new SimpleDateFormat("yyyy");
        System.out.println(dateFormat.format(time));


    }
}
