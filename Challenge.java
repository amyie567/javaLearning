import java.util.Scanner;

public class Challenge
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        if(!(N % 2 == 0) || N >= 6 && N <= 20){
            System.out.println("Weird");
        }
        else if(N >= 2){
            System.out.println("Not Weird");
        }
    }
}
