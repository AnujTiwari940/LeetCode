class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {//running loop for string s
            char ch = s.charAt(i);//holding values of string in ch one by one
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);//if opening brackets then push in stack
            } else {
                if (st.isEmpty()) {
                    return false;
                }

                char top = st.peek();//holding peek in top

                if ((ch == ')' && top == '(') ||
                    (ch == '}' && top == '{') ||
                    (ch == ']' && top == '[')) {
                    st.pop();//if peek is opening bracket and then we got same closing then pop top
                } else {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}