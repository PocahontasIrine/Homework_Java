import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Hello h1 = new Hello();
        h1.hello();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    public static void task2(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();
        System.out.println(e + " " + d + " " + c + " " + b + " " + a);
    }

    public static void task3(){
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();
        String c = scan.nextLine();
        System.out.println(a + "\n" + b + "\n" + c);
        System.out.println(a + " " + b + " " + c);
    }

    public static void task4(){
        Scanner scan = new Scanner(System.in);
        String password = "abcd1234";
        System.out.println("Password is: " + password);
        String check = scan.nextLine();
        if(password.equals(check)){ // < > <= >= == !=
            System.out.println("Equals");
        }else{
            System.out.println("Not equals");
        }
    }

    public static void task5(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println(a * b * c);
    }

    public static void task6(){
        Calendar claim = new GregorianCalendar(2024, 1, 10);
        claim.set(Calendar.HOUR, 14);
        System.out.println(claim.getTime() + " Барская Ирина");
        Calendar delivery = new GregorianCalendar(2024, 2, 1);
        delivery.set(Calendar.HOUR, 11);
        delivery.set(Calendar.MINUTE, 25);
        System.out.println(delivery.getTime() + " Барская Ирина");
    }
}
