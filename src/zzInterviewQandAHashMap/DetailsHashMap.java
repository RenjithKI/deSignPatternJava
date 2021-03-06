package zzInterviewQandAHashMap;

/**https://beginnersbook.com/2013/12/hashmap-in-java-with-example/
 * 
@author Renjith
 *
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
public class DetailsHashMap {

   public static void main(String args[]) {

      /* This is how to declare HashMap */
      HashMap<Integer, String> hmap = new HashMap<Integer, String>();

      /*Adding elements to HashMap*/
      hmap.put(12, "Chaitanya");
      hmap.put(2, "Rahul");
      hmap.put(7, "Singh");
      hmap.put(49, "Ajeet");
      hmap.put(3, "Anuj");
      hmap.put(null, "Anuj2");
      
      System.out.println("size____>"+ hmap.size() );
      System.out.println(hmap.entrySet() );
      System.out.println("duplicate addition of key and value____>"+ hmap.put(12, "Chaitanya") );
      System.out.println("size____>"+ hmap.size() );
      System.out.println(hmap.entrySet() );
      
      System.out.println("duplicate key only>"+ hmap.put(3, "ssssssssssss") );
      System.out.println("___new key duplicate value___>"+hmap.put(50, "ssssssssssss") );
      //
//      System.out.println(hmap.keySet());
//      System.out.println(hmap.values());
     System.out.println(hmap.entrySet() );
      
      
      System.out.println("________________________________#########");
      
      
      /* Display content using Iterator*/
      Set set = hmap.entrySet();
      Iterator iterator = set.iterator();
      while(iterator.hasNext()) {
         Map.Entry mentry = (Map.Entry)iterator.next();
         System.out.println("key is: "+ mentry.getKey() + " & Value is: ");
         System.out.println(mentry.getValue());
      }

      /* Get values based on key*/
      String var= hmap.get(2);
      System.out.println("Value at index 2 is: "+var);

      /* Remove values based on key*/
      System.out.println("___@@@@@@@@@@@@@@''''___"+ hmap.remove(3) );
      System.out.println("Map key and values after removal:");
      Set set2 = hmap.entrySet();
      Iterator iterator2 = set2.iterator();
      while(iterator2.hasNext()) {
          Map.Entry mentry2 = (Map.Entry)iterator2.next();
          System.out.println("Key is: "+mentry2.getKey() + " & Value is: ");
          System.out.println(mentry2.getValue());
       }

   }
}