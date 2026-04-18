import java.util.Scanner;

class Calculate {
      public void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int digit = 0;
        int total = 0;
        while (number>0) {
            digit =  number%10;
            total += digit;
            number=number/10;
        }
        System.out.println("Sum of digits is : " + total);
      }
    
}

public class Sum {
    public static void main(String[] args) {
        Calculate obj = new Calculate();
        obj.sum();
    }
}
