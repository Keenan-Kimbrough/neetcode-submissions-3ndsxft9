class Solution {
    public int longestConsecutive(int[] nums) {
       //
       /*
       sort array
       iterate with for loop
       check if num[i] == num[i-1] then continue to skip duplicates
       if num[i] == num[i+1] +1 then update current length and then update max length
        if num[i]
       */

       if (nums == null || nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);
        int maxLength = 1;
        int currLength = 1;
        for (int i = 1; i < nums.length; i ++){
            if(nums[i] == nums[i-1]){
                continue;
            }

            if(nums[i] == nums[i-1] + 1){
                currLength++;
            }
            else{
                maxLength = Math.max(maxLength, currLength);
                currLength = 1;
            }
            
        }
        maxLength = Math.max(maxLength,currLength);
        return maxLength;
    }
}

