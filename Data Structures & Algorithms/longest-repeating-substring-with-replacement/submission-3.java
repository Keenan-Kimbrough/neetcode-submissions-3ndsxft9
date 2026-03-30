class Solution {
    public int characterReplacement(String s, int k) {
        int res = 0;
        Set<Character> charSet = new HashSet<>();
        
        char[] charArray = s.toCharArray();

        for ( char c : charArray){
            charSet.add(c);
        }

        for (char c : charSet){
            int l = 0;
            int maxCount = 0;

            for ( int r = 0; r < s.length(); r++){
                if(s.charAt(r) == c){
                    maxCount++;
                }

                while ((r - l + 1) - maxCount > k){
                    if(s.charAt(l) == c){
                        maxCount--;
                    }
                    l++;
                }
                res = Math.max(res,r - l + 1);

            }

        }
        return res;
        
    }
}
