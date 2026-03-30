class Solution {
    public boolean isAnagram(String s, String t) {

        //check if the length of each string is the same
        if(s.length() != t.length()){
            return false;
        }
        
        // transfer from string to char array
        char[] sArray = s.toCharArray();
        char[]tArray = t.toCharArray();


        // Sort Array

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray,tArray);
      
        
    }
}
