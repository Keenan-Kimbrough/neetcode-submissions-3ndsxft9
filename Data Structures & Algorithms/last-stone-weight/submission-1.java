class Solution {
    public int lastStoneWeight(int[] stones) {
        // max heap, get top two
       PriorityQueue<Integer> queue = new PriorityQueue<>();

    for ( int s : stones){
        queue.offer(-s);
    }

    while ( queue.size() > 1){
        int first = queue.poll();
        int second = queue.poll();

        if ( second > first){
            queue.offer(first - second);
        }


    }
    queue.offer(0);

    return Math.abs(queue.peek());
    }
}
