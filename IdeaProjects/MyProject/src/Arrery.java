/**
 * Created by Trupesh on 06/04/2017.
 */
public class Arrery {
    public static void main(String args[]) {
        int[] numbers = {10, 20, 30, 40, 50};
        int c = 0;

        for (int a = 0; a < numbers.length; a++) {
            c = numbers[a];
            System.out.println(c);
        }
        System.out.println("-----------------------------");

        for(int x : numbers ) {

          //  if(c>=100) {
                System.out.println(x);
               System.out.print("\n");
        //System.out.println(numbers[c]);
            }
           // else {System.out.println(1);}

        }}





