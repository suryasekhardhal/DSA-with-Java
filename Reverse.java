import java.util.Scanner;

class ReverseNumber{
    public void reverse(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int rev = 0;
        int digit = 0;
        while(number>0){
            digit = number%10;
            rev = rev * 10 + digit;
            number = number/10;
        }
        System.out.println("The reverse number is : " +  rev);
    }
}


public class Reverse {
    public static void main(String[] args) {
        ReverseNumber obj = new ReverseNumber();
        obj.reverse();
    }
}
