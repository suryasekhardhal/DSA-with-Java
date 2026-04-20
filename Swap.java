import java.util.Scanner;

class Cal {
    public void swap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number in A : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the number in B : ");
        int num2 = sc.nextInt();
        num1 = num1 + num2;
        num2 = num1-num2;
        num1 = num1 - num2;
        System.out.println("After swapping A : " + num1 + " "+ "B : " + num2);
    }
}
public class Swap {
    public static void main(String[] args) {
        Cal obj = new Cal();
        obj.swap();
    }
}
