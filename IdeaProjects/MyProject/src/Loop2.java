/**
 * Created by Trupesh on 06/04/2017.
 */
public class Loop2 {
    public static void main(String[] args){
        int a=10;
        int b=2;
        do {
            System.out.println(b+=a);
        }while(a<b && b<=50);
        b--;

        System.out.println(b);

    }
}
