class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> s = new HashSet<>();
        for(int i=0;i<emails.length;i++){
            String res= "";
            boolean f=true;
            boolean f1=true;
            for(int j = 0;j<emails[i].length();j++){
                if(emails[i].charAt(j)=='.' && f1) continue;
                else if(emails[i].charAt(j)=='+'&& f && f1){
                    f=false;
                }
                else if(emails[i].charAt(j)=='@' && f1){
                    res+=String.valueOf(emails[i].charAt(j));
                    f=true;
                    f1=false;
                }
                else if(f) {
res+=String.valueOf(emails[i].charAt(j));
System.out.println(res);
                }
        
    }
   s.add(res);
}
return s.size();
    }
}