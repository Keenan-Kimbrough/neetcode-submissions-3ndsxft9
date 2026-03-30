class Solution {
    public int longestConsecutive(int[] nums) {
       
        Set<Integer> set = new HashSet<>();
        
        int longest = 0;
        for ( int num : nums){
            set.add(num);
        }

        for ( int num : set){
            if(!set.contains(num - 1)){
                int curr = num;
                int currStreak = 1;

                while ( set.contains(curr+1)){
                    curr++;
                    currStreak++;
                }
                longest = Math.max(longest,currStreak);
            }
        }
        return longest;

    }
}

