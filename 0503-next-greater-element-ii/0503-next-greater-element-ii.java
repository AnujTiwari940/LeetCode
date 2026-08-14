class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] nge = new int[n];//next  greater element
        Stack<Integer> st = new Stack<>();
        for(int i =n-1; i >= 0; i--) {
            st.push(arr[i]);//pushed whole array in stack
        }
        for(int i =n-1; i >= 0; i--) {//now start compairing
            while(st.size() > 0 && arr[i]>=st.peek()) st.pop();//if new element>peek , pop the peek
            if(st.size() == 0)nge[i] = -1;
            else nge[i] = st.peek();//if new element<peek...nge of that new is peek
            st.push(arr[i]);
        }
        return nge;
    }
}