import java.util.Scanner;

public class Challenge2

{
    public static void main(String[] args) {



                Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        double d=scan.nextDouble();
//        if their is int ,double before the declaration of nextline() method we have to give  call a nextLine() before the  taking input as (string);
        scan.nextLine();
        String s=scan.nextLine();



                // Write your code here.


                System.out.println("String: " + s);
                System.out.println("Double: " + d);
                System.out.println("Int: " + i);
            }
        }


