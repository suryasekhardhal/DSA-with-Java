import java.util.Scanner;

class Calculate {
    public void count(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = sc.nextInt();
        int digit = 0;
        int flag = 0;
        while (number>0) {
            digit = number%10;
            number = number/10;
            flag++;
        }
        System.out.println("The number of digit : " + flag);

      }
}

public class Count {
    public static void main(String[] args) {
        Calculate obj = new Calculate();
        obj.count();
    }
}
