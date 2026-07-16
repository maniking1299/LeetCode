class Solution {
    public int calculate(String s) {
        Stack<Integer> st = new Stack<>();

        int currNo = 0;
        char op = '+';

        char ar[] = s.toCharArray();

        for (int i = 0; i < ar.length; i++) {
            char currChar = ar[i];
            if (Character.isDigit(currChar)) {
                currNo = currNo * 10 + ar[i] - '0';
            }
            if (!Character.isDigit(currChar) && currChar != ' ' || i == ar.length - 1) {
                if (op == '+') {
                    st.push(currNo);
                } else if (op == '-') {
                    st.push(-currNo);
                } else if (op == '*') {
                    int stTop = st.peek();
                    st.pop();
                    st.push(stTop * currNo);
                } else if (op == '/') {
                    int stTop = st.peek();
                    st.pop();
                    st.push(stTop / currNo);
                }

                op = currChar;
                currNo = 0;

            }
        }
        int res = 0;
        while (!st.isEmpty()) {
            res += st.pop();
        }

        return res;

    }
}