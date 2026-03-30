class Solution {
    public int[] twoSum(int[] nums, int target) {
     
        HashMap<Integer,Integer> prevMap =  new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            int num = nums[i];
            int recip = target - num;

            if(prevMap.containsKey(recip)){
                return new int[] {prevMap.get(recip), i};
            }
            prevMap.put(num,i);
        }
        return new int[] {};
    }

}

