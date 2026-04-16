import java.util.Scanner;

// class verify{
//     public boolean prime(){
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter the to check prime");
//         int number = sc.nextInt();
//         if (number==1) {
//             return false;
//         }
//         for(int i = 2; i<=Math.sqrt(number);i++){
//             if (number%i == 0) {
//                 return false;
//             }
//         }
       
//         return true;
//     }
    
    
// }

// public class prime {
//     public static void main(String[] args) {
//         verify obj = new verify();
//         if (obj.prime()) {
//             System.out.println("prime");
//         } else {
//             System.out.println("not prime");
//         }
//     }
// }


class IsPrime{
       public boolean prime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if(n<=1) return false;
        for(int i = 2;i<n-1;i++){
            if (n%2==0) {
                return false;
            }
        }
        return true;
       }
}

public class prime {

    public static void main(String[] args) {
        IsPrime obj = new IsPrime();
        if (obj.prime()) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}