 import java.util.Map;
 import java.util.HashMap;
 
 class Fibonacci {
   Fibonacci() {}

   private Map<Integer, Integer> cache = new HashMap();

   public int getFibonicciValue(int pos) {
     if(pos < 2) {
       return pos;
     }

     if(cache.contains(pos)) {
       return cache.get(pos);
     }
      
     int result = getFibonicciValue(pos-1) + getFibonicciValue(pos-2);
     cache.put(pos, result);
    
     return result; 
   }

 }