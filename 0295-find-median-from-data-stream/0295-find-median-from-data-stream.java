class MedianFinder {
    PriorityQueue<Integer>minheap;
    PriorityQueue<Integer>maxheap;

    public MedianFinder() { //constructor(initializing) 
        minheap=new PriorityQueue<>();
        maxheap=new PriorityQueue<>(Collections.reverseOrder());        
    }
    
    public void addNum(int num) {
        if (maxheap.isEmpty() || num <= maxheap.peek()){
            maxheap.add(num);
        }
        else minheap.add(num);

        // Balance the heaps
        if (maxheap.size() > minheap.size() + 1) {
            minheap.add(maxheap.remove());
        }

        if (minheap.size() > maxheap.size()) {
            maxheap.add(minheap.remove());
        }
    }
    
    public double findMedian() {
        if (maxheap.size() > minheap.size()) {
            return maxheap.peek();
        }

        else return (maxheap.peek() + minheap.peek()) / 2.0;
    }
}