class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashMap<Integer,Integer> u= new HashMap<>();
        int target=0;
        for (int i = 0; i < nums.length; i++)
        {
            u.put(nums[i],i);
        }
        HashSet<List<Integer>> ars = new HashSet<List<Integer>>();
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                List<Integer> arr = new ArrayList<>();
                List<Integer> temp = new ArrayList<>();
                if(i!=j && u.containsKey(-nums[i]-nums[j]+target)){
                   if(u.get(-nums[i]-nums[j]+target)!=i && u.get(-nums[i]-nums[j]+target)!=j)
                    arr.add(nums[i]);
                    arr.add(nums[j]);
                    arr.add(-nums[i]-nums[j]+target);
                }
                if(arr.size()==3){
                    if (arr.get(1) < arr.get(0))
                    {
                        temp.add(0,arr.get(0));
                        arr.add(0,arr.get(1));
                        arr.add(1,temp.get(0));
                    }
                    if (arr.get(2) < arr.get(1))
                    {
                        temp.add(0,arr.get(1));
                        arr.add(1,arr.get(2));
                        arr.add(0,temp.get(0));

                        if (arr.get(1) < arr.get(0))
                        {
                            temp.add(0,arr.get(0));
                            arr.add(0,arr.get(1));
                            arr.add(1,temp.get(0));
                        }
                    }
                }
                if(arr.size()==3){
                    if(!ars.contains(arr)){
                        ars.add(arr);
                    }
                }

            }
        }
        List<List<Integer>> res = new ArrayList<>(ars);
        return res;

    }
}