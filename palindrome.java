import java.util.Scanner;

class isPalindrome {
    public void check(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = sc.nextInt();
        int ref = number;
        System.out.println("ref:" + ref);
        int c = 0;
        int rev = 0;
        while (number>0) {
            c=number%10;
            System.out.println("Inside while C:" + c);
            rev = rev*10 + c;
            System.out.println("rev inside while" + rev);
            number = number/10;
            System.out.println("inside while Number:" + number);

            
        }

        System.out.println("C after while" + c + "ref after while" + ref + "rev after while" + rev);

        if (ref == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}


public class palindrome {


    public static void main(String[] args) {
        isPalindrome obj = new isPalindrome();
        obj.check();
    }
}
