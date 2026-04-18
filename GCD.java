import java.util.Scanner;

class Calculate {
    public void gcd(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        while (num1 != num2) {
        if(num1>num2){
            num1 = num1-num2;
        } else if(num2>num1){
            num2= num2-num1;
        } else {
            System.out.println("Can't find ");
        }
        }
        System.out.println("GCD is : " + num1);
       
    }
}
public class GCD {
    public static void main(String[] args) {
        Calculate obj = new Calculate();
        obj.gcd();
    }
}
