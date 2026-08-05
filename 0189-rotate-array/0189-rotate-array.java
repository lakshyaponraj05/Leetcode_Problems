class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        Reverse(nums, 0, n - 1);//reverse all elements
        Reverse(nums, 0, k - 1);//1st k-n half
        Reverse(nums, k, n - 1);//2nd k-n half
    }
    void Reverse(int[] nums, int s, int e) {
        while (e > s) {
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }
}