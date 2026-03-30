class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        // create a hashmap, where key is the letters, then add those words to that eky

        HashMap<String,List<String>> map = new HashMap<>();

        // iterate over each string in the array
        for( String str: strs){
            //
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String (charArray);

        
        // if the sorted string is not in the map, add it with a new list
        if (!map.containsKey(sortedStr)){
            map.put(sortedStr, new ArrayList<>());

        }
        map.get(sortedStr).add(str);
        }
        return new ArrayList<>(map.values());

        }
}
    

