package ra.session01;
import java.util.Date;

public class OperatorDemo {
    public static void main(String[] args) {
        //format code Ctrl+ Alt + l
        int a = 10;
        int b = a++; //b=10; va a=11;
        System.out.println(b);
        int c = ++b; //c=11; va b=11;
        System.out.println(c);
        //them date
        Date date = new Date();
        System.out.println(date);
    }
}
