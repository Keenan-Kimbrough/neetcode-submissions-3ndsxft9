class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // temp[i] daily temp on ith day
        // result[i] -> ith day before a warmer temperature appears on a future day
        // loop through array and

        int[] res = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>(); // [temp,indx]

        for (int i = 0; i < temperatures.length; i++){

            int t = temperatures[i];
            while(!stack.isEmpty() && t > stack.peek()[0]){
                int[] pair = stack.pop();
                res[pair[1]] = i - pair[1];
            }
            stack.push(new int[] {t, i});
        }
        return res;
    }
}
