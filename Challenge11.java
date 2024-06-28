import java.util.Scanner;

public class Challenge11 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        String  s1=sc.nextLine();
        String s2=sc.nextLine();

int total=s1.length()+s2.length();
String compare =(s1.compareTo(s2)>0)?"Yes":"No";
String capitalize= s1.substring(0,1).toUpperCase()+s1.substring(1)+" "+s2.substring(0,1).toUpperCase()+s2.substring(1);
        System.out.println(total);
        System.out.println(compare);
        System.out.println(capitalize);




    }
}
