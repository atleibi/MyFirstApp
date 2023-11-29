
package myfirstapp;
import java.util.Scanner;
public class MyFirstApp {

    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        //System.out.print("Enter Your Name ==> ");
        //String name=sc.nextLine();
        //System.out.println("Hello "+name);
        
        //double a,b;
        String a,b;
        Scanner Ahmad=new Scanner(System.in);
        System.out.print("Enter Number a ==> ");
        //a=Ahmad.nextDouble();//How to input
        a=Ahmad.nextLine();
        System.out.print("Enter Number b ==> ");
        //b=Ahmad.nextDouble();
        b=Ahmad.nextLine();
        
        //Calculations c1=new Calculations(a,b);//to call functions from the class
        //System.out.print("The sum is ==> "+c1.Addition());
        
        Calculations c2=new Calculations(a,b);
        System.out.print("The sum is ==> "+c2.Addition());

    }
    
}
