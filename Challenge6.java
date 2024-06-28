import java.util.Scanner;

public class Challenge6 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int x=sc.nextInt();

        for(int i=0;i<x;i++){
//byte<short<int<long
            try{
long a =sc.nextLong();
                System.out.println(a+" can be fitted :");
                if(a>=-127 && a<=127)
                    System.out.println("* byte");

                 if(a>=-32768 &&a<=32767)
                    System.out.println("* short");

                 if(a>=-2147483648 && a<=2147483647 )
                     System.out.println("* int");

                 if (a <= 9223372036854775807l)
                         System.out.println("* long");


                 }






                catch ( Exception e){
                    System.out.println(sc.next()+"can't be fitted anywhere");
                }



        }







    }
}
