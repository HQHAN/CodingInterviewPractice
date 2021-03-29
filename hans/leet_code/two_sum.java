import java.io.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] solution = new int[2];
        for(int i=0; i<nums.length; i++) {
            int complement = target - nums[i];
            for(int j=i+1; j<nums.length; j++) {
                if(complement == nums[j]) {
                    solution[0] = i;
                    solution[1] = j;
                    return solution;
                }
            }
        }
        return solution;
    }
}