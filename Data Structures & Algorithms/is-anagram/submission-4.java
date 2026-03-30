class Solution {
    public boolean isAnagram(String s, String t) {
       if (s.length() != t.length()){
        return false;
       }
       char[] sArray = s.toCharArray();
       char[] tArray = t.toCharArray();

       Map<Character, Integer> countS = new HashMap<>();
       Map<Character, Integer> countT = new HashMap<>();

       for (char c : sArray){
        countS.put(c, countS.getOrDefault(c,0) + 1);
       }
       for( char c : tArray){
        countT.put(c, countT.getOrDefault(c, 0) + 1);
       }
       return countT.equals(countS);

 
    }
}
