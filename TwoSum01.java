package 数据结构;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum01 {
    public static void main(String[] args) {
        TwoSum01 twoSum01 = new TwoSum01();
        int nums[]={2,7,11,15};
        int[] result = twoSum01.twoSum(nums, 9);
        int[] result2 = twoSum01.twoSum2(nums, 9);
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result2));
    }
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
return result;
    }

    public int[] twoSum2(int[] nums, int target){
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i <nums.length ; i++) {
          int x= target-nums[i];
                if(map.containsKey(x)&& map.get(x)!=i){
                    result[0]=i;
                    result[1]=map.get(x);
                    break;
                }
            }

        return result;
    }

    public int[] twoSum3(int[] nums,int target){
        int[] result =new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <nums.length; i++) {
            int x = target -nums[i];
            if(map.containsKey(x)){
                result[0]=i;
                result[1]=map.get(x);
                break;
            }
        map.put(nums[i],i);
        }

        return result;
    }

}
