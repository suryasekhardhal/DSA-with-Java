import java.util.Scanner;

// class Calculate {
//       public void fact(){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number to calculate Fact");
//         int num = sc.nextInt();
//         // int fact = num;
//         int fact =1;
//         for(int i = 1;i<num;i++){
//             // fact = fact * (num-i);
//             fact += fact*i;
             
//         }
//         System.out.println("Factorial:" +  fact);

       
//       }
// }

class Calculate {
      public int fact(int num){
       
        if (num == 0 || num == 1) {
            return 1;
        }

        return num* fact(num-1);

       
      }
}

public class Factorial {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to calculate Fact");
        int num = sc.nextInt();
        Calculate obj = new Calculate();
        int result  = obj.fact(5);
        System.out.println(result);
    }
}
