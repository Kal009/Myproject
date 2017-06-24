/**
 * Created by Trupesh on 06/04/2017.
 */
public class IfAndIfelse {
    public static void main(String[] args) {
        int a = 10;
        int b = 300;
        int c = 35;
        if (a > b && b > c) {
            System.out.println("A " + "Has a Max    value " + a);
            System.out.println("B " + "Has a Middle value " + b);
            System.out.println("C " + "Has a Min    value " + c);
        } else if (b > a && a > c) {
            System.out.println("B " + "Has a Max    value " + b);
            System.out.println("A " + "Has a Middle value " + a);
            System.out.println("C " + "Has a Min    value " + c);
        } else if (b > c && c > a) {
            System.out.println("B " + "Has a Max    value " + b);
            System.out.println("C " + "Has a Middle value " + c);
            System.out.println("A " + "Has a Min    value " + a);
        } else if (c > a && a > b) {
            System.out.println("C " + "Has a Max    value " + c);
            System.out.println("A " + "Has a Middle value " + a);
            System.out.println("B " + "Has a Min    value " + b);
        } else if (c > b && b > a) {
            System.out.println("C " + "Has a Max    value " + c);
            System.out.println("B " + "Has a Middle value " + b);
            System.out.println("A " + "Has a Min    value " + a);
        } else {
            System.out.println("A " + "Has a Max    value " + a);
            System.out.println("C " + "Has a Middle value " + c);
            System.out.println("B " + "Has a Min    value " + b);
        }
    }
}







