import java.util.Scanner;

class Cal {
    public void largestAmongThreeNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
        System.out.println("Enter the third number");
        int num3 = sc.nextInt();
        if (num1>num2 && num1>num3) {
            System.out.println("Largest number is First : " + num1);
        } else if(num2>num1 && num2>num3){
            System.out.println("Largest number is second : " + num2);
        } else {
            System.out.println("Largest number is third : " + num3);
        }
    }
}
public class Largest {
    public static void main(String[] args) {
        Cal obj = new Cal();
        obj.largestAmongThreeNumbers();
    }
}
