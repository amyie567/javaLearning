import java.util.Scanner;

public class Challenge3 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("===============================");
for (int i=0 ;i<=3;i++){
    String s=sc.nextLine();
    int x=sc.nextInt();
//    code

//    String Formatting:
//    To left-justify a string and ensure it takes up a fixed width, use the format specifier %-15s. Here, 15 is the width of the column.
//    Integer Formatting:

//    To ensure an integer is printed with leading zeros and always has three digits, use the format specifier %03d.
    System.out.printf("%-15s%03d%n",s,x);


}
        System.out.println("=================================");






    }
}
