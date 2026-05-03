class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // this is in decreaseing order so max will be at the top b[0] - a[0]
        PriorityQueue<int[]> heap = new PriorityQueue<>((a,b) -> b[0]-a[0]);
        // len 7 k = 3
        int[] output = new int[nums.length - k + 1];
        int indx = 0;

        for ( int i = 0; i < nums.length; i++){
            heap.offer(new int[] {nums[i], i});
            // i = 2, k - 3
            if ( i >= k - 1){
                while(heap.peek()[1] <= i - k){
                    heap.poll();
                }
                output[indx++] = heap.peek()[0];
            }
        }
        return output;
        
    }
}
