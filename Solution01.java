package LeetCode001;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution01 {
    public static void main(String[] args) {
        solution s = new solution();
        int[] arr={2,7,5,11};
        int target=9;
        int[] result = s.twoSum(arr, target);
        System.out.println(Arrays.toString(result));

    }



    static class solution{
    public  int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");

    }
    }
}
