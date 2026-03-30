class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();

        int l = 0;
        int r = 0;
        int maxLength = 0;

        char[] charArray = s.toCharArray();

        while ( r < charArray.length){
            char c = charArray[r];

            if(!set.contains(c)){
                set.add(c);
                maxLength = Math.max(maxLength, r- l + 1);
                r++;
                
            }else{
                set.remove(charArray[l]);
                l++;

            }
        }
        return maxLength;
    }
    
}
