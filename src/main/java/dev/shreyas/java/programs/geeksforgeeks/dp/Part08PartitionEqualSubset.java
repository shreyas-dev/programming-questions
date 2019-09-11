package dev.shreyas.java.programs.geeksforgeeks.dp;

import java.util.HashMap;


// https://www.youtube.com/watch?v=3N47yKRDed0
public class Part08PartitionEqualSubset {

    // O(n * sum)
    public boolean canPartition(int[] nums){
        int total = 0;
        for (int i:nums){
            total+= i;
        }
        if (total % 2 !=0){
            // If total can't be divided by two then we cannot
            // divide the subset's into two parts
            return false;
        }
        return canPartition(nums,0,0,total,new HashMap<>());
    }

    public boolean canPartition(int[] nums, int index, int sum, int total, HashMap<String,Boolean> state){
        String key = index +""+sum;
        // dp to save states
        if (state.containsKey(key))
            return state.get(key);
        if (sum * 2 == total)
            return true;
        // if sum is more than the total then it is invalid
        if (sum * 2 > total || index > nums.length)
            return false;
        // exclude the element ||include the element
        boolean foundPartition = canPartition(nums,index+1,sum,total,state) || canPartition(nums,index+1,sum+nums[index],total,state);
        state.put(key,foundPartition);
        return foundPartition;
    }
}
