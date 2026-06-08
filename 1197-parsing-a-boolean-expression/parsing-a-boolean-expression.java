class Solution {
    public boolean parseBoolExpr(String expression) {
        Stack<Character> st = new Stack<>();

        for (char ch : expression.toCharArray()) {

            if (ch == ',' || ch == '(') {
                continue;
            }

            if (ch == 't' || ch == 'f' || ch == '!' || ch == '&' || ch == '|') {
                st.push(ch);
            } else if (ch == ')') {

                int tCount = 0;
                int fCount = 0;

                while (!st.isEmpty() && st.peek() != '!' &&
                       st.peek() != '&' && st.peek() != '|') {

                    char val = st.pop();

                    if (val == 't') tCount++;
                    else fCount++;
                }

                char op = st.pop();

                char result = 'f';

                if (op == '!') {
                    result = (fCount == 1) ? 't' : 'f';
                } else if (op == '&') {
                    result = (fCount == 0) ? 't' : 'f';
                } else if (op == '|') {
                    result = (tCount > 0) ? 't' : 'f';
                }

                st.push(result);
            }
        }

        return st.peek() == 't';
    }
}