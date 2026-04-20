import java.util.ArrayList;
import java.util.Arrays;

class Remove {

    public void removeDuplicates(){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,2));
        // list.add(1);
        // list.add(2);
        // list.add(1);
        // list.add(2);
        // list.add(3);
        System.out.println(list);
        for(int i =0;i<list.size();i++){
             for(int j =i+1;j<list.size();j++){
                if(list.get(i).equals(list.get(j))){
                       list.remove(j);
                       j--;
                }
             }
        }
System.out.println(list);
        
    }

    
    
}
 
public class RemoveDuplicate {


    public static void main(String[] args) {
        Remove obj = new Remove();
        obj.removeDuplicates();
    }
}
