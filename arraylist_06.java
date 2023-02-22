import java.util.LinkedList;  
import java.util.List;  

 public class arraylist_06
  {  
  public static void main(String[] args)
 {  
  List<Integer> list= new LinkedList<>();  
 for (int i=0;i<6;i++)
 {  
  list.add(i);  
  // returns the element at the specified position in this list  
  int index =list.get(i);  
  System.out.println("Element "+i+" stored at Index : "+index);  
        }  
    }  
}  