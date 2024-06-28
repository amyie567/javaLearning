import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Challenge10 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        Double payment= sc.nextDouble();
//        code
        // Create NumberFormat instances for each locale
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        // Format the payment for each locale
        String us = usFormat.format(payment);
        String india = indiaFormat.format(payment);
        String china = chinaFormat.format(payment);
        String france = franceFormat.format(payment);

        System.out.println("US:"+us);
        System.out.println("India:"+india);
        System.out.println("China:"+china);
        System.out.println("France:"+france);



    }
}
