package dev.shreyas.java.programs.arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    Given a collection of candidate numbers (candidates) and a target number (target),
    find all unique combinations in candidates where the candidate numbers sums to target.
    Each number in candidates may only be used once in the combination.

    Note:
        All numbers (including target) will be positive integers.
        The solution set must not contain duplicate combinations.

    Example 1:
        Input: candidates = [10,1,2,7,6,1,5], target = 8,
        A solution set is:
        [
          [1, 7],
          [1, 2, 5],
          [2, 6],
          [1, 1, 6]
        ]

    Example 2:
        Input: candidates = [2,5,2,1,2], target = 5,
        A solution set is:
        [
          [1,2,2],
          [5]
        ]


        Space : O(n) for stack
        Time : O(2^n)
 */
public class CombinationSum {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>>  result =new ArrayList<>();
        // Sort to avoid duplicates i.e 1,7 and 7,1
        Arrays.sort(candidates);
        findCombinations(candidates,0,target,new ArrayList<>(),result);
        return result;
    }

    // index will point to current element
    // Current list will hold up till now elements
    public void findCombinations(int[] candidates,int index,int target,List<Integer> current,List<List<Integer>> result){
        // if target is 0 then we found our list contain element that sum to target
        if (target == 0){
            result.add(new ArrayList<>(current));
            return;
        }
        // if -ve return
        if (target < 0 )
            return;

        // we always go forward to send other candidates
        for (int i = index;i<candidates.length;i++){
            // for only first iteration
            // Or
            // when this and prev elements don't match
            if (i == index|| candidates[i]!=candidates[i-1]){
                // simulate selecting the candidate
                current.add(candidates[i]);
                // check to find elements summing to target selecting this candidate/element
                findCombinations(candidates,i+1,target-candidates[i],current,result);
                // Simulate not selecting, no combination recursive call is required
                // cause we are moving forward
                current.remove(current.size()-1);
            }
        }
    }
}
