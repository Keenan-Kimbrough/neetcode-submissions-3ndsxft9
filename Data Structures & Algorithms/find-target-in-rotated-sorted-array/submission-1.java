class Solution {
    public int search(int[] nums, int target) {
        
        int l = 0;
        int r = nums.length - 1;

        while(l <= r){
            int m = (r + l) / 2;
            if ( nums[m] == target) {
                return m;
                }

            // determine which side is sorted.
            if(nums[l] <= nums[m]){
                // left side l.m is sorted
                if(nums[l] <= target && target < nums[m]){
                    // target is in the left sorted part
                    r = m - 1;
                }
                else {
                    //target is on the right part
                    l = m + 1;
                };

            }else {
                //right side is sorted m.r is sorted
                if(nums[m] < target && target <= nums[r]){
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
        }
        return -1;
    }
}
