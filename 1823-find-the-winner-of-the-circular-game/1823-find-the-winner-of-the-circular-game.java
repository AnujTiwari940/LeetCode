class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<=n;i++){//1 to n added in queue
            q.add(i);
        }
        while(q.size()>1){//if one left then that is anwer so stop here
        for(int i=1;i<=k-1;i++){//k-1 remove from front and add at rear
            q.add(q.remove());
        }q.remove();//kth will be removed
        }
    return q.peek();
    }
}