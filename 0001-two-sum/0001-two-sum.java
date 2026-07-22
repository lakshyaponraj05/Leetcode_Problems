class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*
        int l=nums.length;
        for(int i=0;i<l-1;i++){
            for(int j=i+1;j<l;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};*/
        HashMap<Integer,Integer> a=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int b=target-nums[i];
            if(!a.containsKey(b)){
                a.put(nums[i],i);
            }
            else{
                int s=a.get(b);
                int d=i;
                return new int[]{s,d};
            }
        }
        return new int[]{};
    }
}