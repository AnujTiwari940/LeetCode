class MyStack {
    Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.add(x);
    }

    public int pop() {
        int n = q.size();
        for (int i = 1; i < n; i++) {
            q.add(q.remove());
        }

        return q.remove();
    }

    public int top() {
        int n = q.size();

        for (int i = 1; i < n; i++) {
            q.add(q.remove());
        }

        int ans = q.peek();

        // Restore the queue
        q.add(q.remove());

        return ans;
    }

    public boolean empty() {
        return q.isEmpty();
    }
}