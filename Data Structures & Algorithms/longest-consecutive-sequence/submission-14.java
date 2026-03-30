class Solution {
    public int longestConsecutive(int[] nums) {
       
       /*
       create set with unique nums
       check if beginniner of sequence num - 1 not in set
       then while num+1 in set increase len
       */

       Set<Integer> set = new HashSet<>();

       for (int num : nums){
        set.add(num);
       }

       int longest = 0;

       for ( int num : set){
        if(!set.contains(num - 1)){
            int currNum = num;
            int currStreak = 1;

            while (set.contains(currNum + 1)){
                currStreak++;
                currNum++;;
            }
            longest = Math.max(longest,currStreak);
        }

       }
       return longest;
    }
}

