import java.util.Scanner;

public class Challenge14 {
    public static  String isPalindrome(String s){

        s=s.replaceAll(" ","").toLowerCase();

        int left =0;
        int right =s.length()-1;

        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return  "No";
            }
        left++;
            right--;
        }
        return "Yes";










    }
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        String s = sc.nextLine();
        String s1= sc.nextLine();

        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome(s1));








    }
}
