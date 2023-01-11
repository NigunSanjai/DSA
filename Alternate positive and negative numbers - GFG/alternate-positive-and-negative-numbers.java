//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java




class Solution {
    void rearrange(int arr[], int nnn) {
            //   int nnn = arr.length;
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int i: arr){
            if(i>=0)pos.add(i);
            else neg.add(i);
        }
        int index1 = 0 ,index2=0;
        boolean p = false;
        boolean n = false;
        int pn = 0;
        int nn = 0;
        boolean poo = true;
        boolean noo = false;
        for(int i = 0;i<nnn;i++){
            if(pos.size()==0 || pn==pos.size() ){
                p=true;
            }
            else if (neg.size()==0 || nn==neg.size()){
                n=true;
            }
            if(p){
                arr[i] =neg.get(index2);
                index2++;
            }
            else if(n){
                arr[i] =pos.get(index1);
                index1++;
            }
            if(!p && !n){
                if(poo){
                    arr[i] = pos.get(index1);
                    index1++;
                    poo=false;
                    noo=true;
                    pn++;
                }
                else if(noo){
                    arr[i] = neg.get(index2);
                    index2 ++;
                    poo=true;
                    noo=false;
                    nn++;
                }
            }

        }
        
    }
}