class Solution {
    public int countNicePairs(int[] arr) {
        HashMap<Long, Long> hm = new HashMap<>();
        long res = 0;
        for (long i : arr) {
            long rev = reverse(i);
            long sum = i - rev;
            if (hm.containsKey(sum)) {
                hm.put(sum, hm.get(sum) + 1);
                res += (hm.get(sum));
            }
            else hm.put(sum, 0l);
        }
       return (int)(res%1000000007);
    }

    private static long reverse(long num) {
        long rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }
    }
