import java.util.Scanner;

class Check {
    public void isArmstrong(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int flag= 0;
        int ref = number;
        int digit = 0;

        while(number>0){
              digit = number%10;
              number = number/10;
              flag++;
              System.out.println("flag:" + flag);
              System.out.println("digit:" + digit);
        }
        number=ref;
        int value = 0;
        while(number>0){
            digit = number%10;
            number = number/10;
            value += Math.pow(digit, flag);
            System.out.println("value:-" + value);
        }

        if (ref == value) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
        
     System.out.println("Value:" + value);
    }
}

public class Armstrong {
    public static void main(String[] args) {
        Check obj = new Check();
        obj.isArmstrong();
    }
}
