class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {

            String s = tokens[i];

            if (!s.equals("+") && !s.equals("-") && !s.equals("*") && !s.equals("/") ) {
                st.push(Integer.parseInt(s));
            }
            else {

                int a = st.pop();
                int b = st.pop();

                switch(tokens[i]) {

                    case "+" : st.push(a + b); break;
                    case "-" : st.push(b - a); break;
                    case "/" : st.push(b / a); break;
                    case "*" : st.push(a * b); break;
                }
            }
        }

        return st.pop();
    }
}
