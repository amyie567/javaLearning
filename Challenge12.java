import java.util.Scanner;

public class Challenge12 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        String s =sc.nextLine();
        int start = sc.nextInt();
        int end= sc.nextInt();
String result=s.substring(start,end);

        System.out.println(result);




    }
}