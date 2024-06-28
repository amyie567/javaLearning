import java.util.Scanner;

//import static java.lang.System.in;

public class Challenge5 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of Queries: ");
        int queries=sc.nextInt();

        for(int i=0;i<queries;i++){
            System.out.println("Enter value of a: ");
            int a=sc.nextInt();
            System.out.println("Enter the value of b: ");
            int b=sc.nextInt();
            System.out.println("Enter the value of n: ");
            int n=sc.nextInt();

            int sum=a;
        for(int j=0;j<n;j++){

            sum+= (int) (Math.pow(2,j)*b);
            System.out.print(sum+" ");
        }



            System.out.println();


        }




    }
}
