class Solution {
    public int largestRectangleArea(int[] heights) {
        // keep track of bars in increaseing order in stack, and we store index and height can start
        //when we se a new bar that is shorter than the top of the stack, it means the taller bar cant extend further to the right
        // so we pop and compute the area it could cover
        // the new shorter bar can start from as far left as popped bars start index so we can reuse that index
        //after the pass we compute area of any bars still in the stack, extending them to the end
        int maxArea = 0;
        Stack<int[]> stack = new Stack<>(); // pair index and height

        for (int i = 0; i < heights.length; i++){
            int start = i;
            while (!stack.isEmpty() && stack.peek()[1]> heights[i]){
                int[] top = stack.pop();
                int index = top[0];
                int height = top[1];
                maxArea = Math.max(maxArea, height * (i - index));
                start = index;
            }
            stack.push(new int[]{start, heights[i]});
        }

        for ( int[] pair : stack){
            int index = pair[0];
            int height = pair[1];
            maxArea = Math.max(maxArea, height * (heights.length - index));

        }
        return maxArea;
    }
}
