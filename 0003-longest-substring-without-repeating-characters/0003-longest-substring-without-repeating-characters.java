class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> ar = new HashSet<>();
        int a = 0;
        int b=0;
        int len = 0;
        while(b<s.length()){
            if(!ar.contains(s.charAt(b))){
                ar.add(s.charAt(b));
                b++;
                len = Math.max(ar.size(),len);
            }
            else{
                ar.remove(s.charAt(a));
                a++;
            }

        }
        return len;

    }
}