import java.util.*;

class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    // Write your code here.
    Map<Integer,Integer> map = new HashMap();
    for(int i:array){
      int diff = targetSum - i;
      if(map.containsKey(i) && map.get(i)==diff){
        return new int[]{map.get(i),i};
      }else{
        map.put(diff,i);
      }
    }
    return new int[0];
  }
}
