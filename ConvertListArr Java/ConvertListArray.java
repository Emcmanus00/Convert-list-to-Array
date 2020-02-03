import java.util.*;
public class ConvertListArray {
   public static void main(String[] args) {
   
      String [] stuff = {"canteloupe", "grain", "wood", "honey"};
      LinkedList<String> thelist = new LinkedList<String>(Arrays.asList(stuff));
   
      thelist.add("seed");
      thelist.addFirst("notright");
   
   //convert list back to an array
      stuff = thelist.toArray(new String[thelist.size()]);
   
      for(String x : stuff)
         System.out.printf("%s ", x);
   
   }
}