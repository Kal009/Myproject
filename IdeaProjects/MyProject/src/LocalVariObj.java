/**
 * Created by Trupesh on 05/04/2017.
 */
public class LocalVariObj {

    public static void main (String[] args) {
        LocalVariable L1 = new LocalVariable();
        IntVariables L2 = new IntVariables();
        L1.emp();
        final int a = IntVariables.A;
        L2.add(1,2);
        System.out.println(a);
        assigment();
    }
    public static void assigment (){
        int a = 10;
        int c = 2;
        int d = (a== 1)? 20 : 30;
        System.out.println(c+=a);
        System.out.println(c);
        System.out.println(d);

    }
}
