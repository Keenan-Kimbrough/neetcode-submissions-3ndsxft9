class Solution {
    public int characterReplacement(String s, int k) {
       Set<Character> set = new HashSet<>();
       int res = 0;
       char[] charArray = s.toCharArray();

       for ( char c : charArray){
        set.add(c);
       }
    
        for ( int c : set){
            int maxFreq = 0;
            int l = 0;
            for ( int r = 0; r < s.length(); r++){

                if( s.charAt(r) == c){
                    maxFreq++;
                }
                while( (r - l + 1) - maxFreq > k){
                    if(s.charAt(l)== c){
                        maxFreq--;
                    }
                    l++;
                }
                res = Math.max(res, r - l + 1);
            }
        }
        return res;
        
    }
}
