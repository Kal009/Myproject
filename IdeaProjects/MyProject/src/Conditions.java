/**
 * Created by Trupesh on 10/04/2017.
 */
public class Conditions {

    public static void main(String[] args) {
        double min = 2.5;
        //Travel Card
        double cardBs = 2.0;
        String Cardtype1 = "Travel Card";
        int TavelCardZoneFrom = 1;
        int a = TavelCardZoneFrom;
        int TravelCardZoneTo = 4;
        int b = TravelCardZoneTo;
        String c = "Oyster Card";
        int Oyster = 1;
        int TravelCard=2;

        //Travelling
        int C = 1; //Card type
        int FromZone = 5;
        int ToZone = 3;
        int t = FromZone;
        int x = ToZone;
        if (c == "Oyster Card") {
            if ((t >= a && t <= b) && (x <= b && x >= a)) {
                System.out.println("Door opend & access given");
            } else if (cardBs >= min) {
                System.out.println("Door opend & access given");
            } else if (Cardtype1 == "Travel Card") {
                if ((t >= a && t <= b) && (x <= b && x >= a)) {
                    System.out.println("Door opend & access given");
                } else {
                    System.out.println("Door not open & access denied");
                    System.out.println("t value " + t + " a " + a);
                    System.out.println("e value " + a);
                    System.out.println("x value " + x + " b " + b);
                    System.out.println("d value " + b);
                }
            }
        }
    }
}




