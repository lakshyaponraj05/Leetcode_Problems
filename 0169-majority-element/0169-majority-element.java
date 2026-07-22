class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> a=new HashMap<>();
        int count=0;
        for(int i:nums){
            if(a.containsKey(i)){
                a.put(i,a.get(i)+1);
                
            }
            else{
                a.put(i,1);
            }
        }
        for(Map.Entry<Integer,Integer> k:a.entrySet()){
            if(k.getValue()>(nums.length/2)){
                return k.getKey();
            }
        }
        return 0;
    }
}