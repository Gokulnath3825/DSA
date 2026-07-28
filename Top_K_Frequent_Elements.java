
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Top_K_Frequent_Elements {

    public static int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> num = new LinkedHashMap<>();

        for(int each:nums){
            int temp = num.getOrDefault(each,0)+1;
            num.put(each, temp);
        }

        List<Map.Entry<Integer,Integer>> temp = new ArrayList<>(num.entrySet());

        temp.sort(Map.Entry.comparingByValue());

        Collections.reverse(temp);

        int []res = new int [k];
        for(int i=0;i<k;i++){
            res[i] = temp.get(i).getKey();
        }

        return res;

    }

    public static void main(String[] args) {
        int [] nums ={1,2,1,1,3,3,4,1,2};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums,k)));
    }
}
