/**
 * Created by Trupesh on 05/04/2017.
 */
public class Object1{
    public static void main ( String[] args){
        SimpleJava S1= new  SimpleJava();
        SimpleJava S2 = new SimpleJava();
        S1.employeeName("Kalpesh");
        // referece variable
        S1.age(32);
        S1.post("Accountant");
        S1.salary(20000);
        S2.employeeName("Trupti");
        S2.age(27);
        S2.post("Software Tester");
        S2.salary(30000);

        S1.Edetails();
        S2.Edetails();

    }




}
