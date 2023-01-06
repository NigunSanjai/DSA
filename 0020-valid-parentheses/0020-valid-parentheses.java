class Solution {
    public boolean isValid(String s) {
        Stack<String> ss = new Stack<>();
        String[] sss = s.split("");
        for (String i : sss) {
            if (ss.size() != 0 && i.equals(")")) {
                if (ss.peek().equals("(")) ss.pop();
                else ss.push(i);
            } else if (ss.size() != 0 && i.equals("}")) {
                if (ss.peek().equals("{")) ss.pop();
                else ss.push(i);
            } else if (ss.size() != 0 && i.equals("]")) {
                if (ss.peek().equals("[")) ss.pop();
                else ss.push(i);
            } else ss.push(i);
        }
        if (ss.size() == 0) return true;
        return false;
        
    }
}