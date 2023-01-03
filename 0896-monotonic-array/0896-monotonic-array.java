class Solution {
    public boolean isMonotonic(int[] arr) {
    if (arr.length==0 || arr.length==1) return true;
    int c1=0,c2=0,c3=0;
    for(int i=0;i<arr.length-1;i++){
        if(arr[i]<arr[i+1]){
            c1++;
        }
        else if(arr[i]==arr[i+1]){
            c3++;
        }
        else{
            c2++;
        }

    }
    if(c1+c3== arr.length-1) return (true);
    else if(c2+c3== arr.length-1) return(true);
    else return (false);
    }
}