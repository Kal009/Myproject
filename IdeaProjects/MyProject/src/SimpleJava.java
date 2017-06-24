/**
 * Created by Trupesh on 05/04/2017.
 */
public class SimpleJava {
     String Name;
     int Age;
     String Post;
     int Salary;

     public void employeeName (String name ){
           Name = name;
    }

    public void age(int age){
         Age = age;
    }
    public void post (String post){
      Post = post;
    }
    public void salary (int salary) {
        Salary = salary;
    }
    public void Edetails (){
        System.out.println("Employee Name :" + Name);
        System.out.println("Age           :" + Age);
        System.out.println("Post          :" + Post);
        System.out.println("Salary        :" + Salary);
        System.out.println("---------------------------");

    }
}


