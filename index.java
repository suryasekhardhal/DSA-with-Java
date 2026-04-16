import java.util.*;
interface M {
    public int addInterface(int a ,int b);
}

class A {
    public int add(int a, int b){
        return a+b;
    }
    A(int c, int d){
        //System.out.println(add(c, d));
        int total = c + d;
        System.out.println("Total" + total);
    }
    private String name = "Suryasekhar Dhal";
    public String accessName = "Surya";
    public void getName(){
        System.out.println("Name of Class A:" + " " + name);
    }
}

class D extends A implements M {
    public D(){
        super(50, 6);
        System.out.println("class D");
    }
    public int addInterface(int a,int b){
        int total = a + b;
       return total;
    }
}

// class Convert {
//      int x = 20;
//      float a = x;
//      int b = (int)a;
//      String str = "123";
//      int num = Integer.parseInt(str);
//      Scanner sc = new Scanner(System.in);
//     public void inputArray(){
//         System.out.println("Enter the size of the array");
//          int size = sc.nextInt();
//          sc.nextLine();
//          String arr[]= new String[size];
//          System.out.println("Enter 5 names");
//          for(int i =0; i<arr.length;i++){
//             arr[i] = sc.nextLine();
//             System.out.println(i);

//          }
//          System.out.println("Print the names in the array");
//          for(int i = 0; i < arr.length; i++ ){
//             System.out.println(arr[i]);
//          }
//     }
// }

class ConditionalStatement{
    public void oddOrEven(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to Check the number is odd or even");
        int number = sc.nextInt();
        if(number%2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter your name");
        //String name = sc.nextLine();
        //System.out.println( " My name is" + " " + name);
       
        int arr[] ={1,2,3};
        System.out.println("enter array size");
        // int x = sc.nextInt();
        //int array[] = new int[x];
        for(int i = 0; i<3;i++){
            System.out.println("arr:" + arr[i]);
        }
       // System.out.println("User input array" + " " + array.length);
        //for(int i = 0; i<name.length();i++){
            //System.out.println(name.charAt(i));
            //System.out.println("index of" + name.indexOf(i));
       // }
        A obj= new A(5,6);
        System.out.println(obj.add(3, 4));
        obj.getName();
        System.out.println(obj.accessName);
        D obj1 = new D();
        obj1.addInterface(20,30);
        //Convert obj2 = new Convert();
        //System.out.println(obj2.b);
        //System.out.println(obj2.num);
        //obj2.inputArray();
        ConditionalStatement obj3 = new ConditionalStatement();
        obj3.oddOrEven();
    }
}