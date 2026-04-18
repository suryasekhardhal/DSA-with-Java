import java.util.Scanner;

class Calculate {
    public int gcd(int num1, int num2){
          while (num2 != 0) {
            int temp = num2;
            num2 = num1%num2;
            num1=temp;
          }
          return num1;

    }

    public void lcm(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
        int lcm = num1*num2 / gcd(num1, num2);
        System.out.println("lcm is : "+lcm);
    }
}
public class LCM {
    public static void main(String[] args) {
        Calculate obj = new Calculate();
        obj.lcm();
    }
}
