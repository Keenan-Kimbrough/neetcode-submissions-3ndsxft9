class Solution {
    public int majorityElement(int[] nums) {
        /*
        loop throguh array, keep count in a hashmap, then loop through vlaues
        if values is greater than half the count then add return the ke

        */
        Map<Integer,Integer> count = new HashMap<>();

        for (int num : nums){
            count.put(num,count.getOrDefault(num,0) + 1);
        }
        for ( Map.Entry<Integer,Integer> entry : count.entrySet()){
            if (entry.getValue()> (nums.length / 2)){
                return entry.getKey();
            }
        }
        return 0;
    }
}