class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer, Integer> map = new HashMap<>();

       for ( int i = 0; i < nums.length; i ++){
        int recip = target - nums[i];
        if(map.containsKey(recip)){
            return new int[]{map.get(recip),i};
        }
        else {
            map.put(nums[i], i);
        }
       }
       return new int[]{0,0};
    }
}
