class Solution {
    public int strStr(String h, String n) {
        char[] let = h.toCharArray();
        if(n.length()>h.length()) return -1;
        for(int i=0;i<let.length;i++){
            if(String.valueOf(let[i]).equals(n.substring(0,1))){
                if(i+n.length()<=h.length() && String.valueOf(h.substring(i,i+n.length())).equals(n)){
                    return i;
                }
            }
        }
        return -1;
        
    }
}