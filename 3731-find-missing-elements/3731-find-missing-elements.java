class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Arrays.sort(nums);
        int cur = nums[0];

        for (int x : nums) {
            while (cur < x){
                res.add(cur);
                cur++;
            }
            cur = x + 1;
        }
        return res;
    }
}