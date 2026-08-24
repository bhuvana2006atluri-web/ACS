class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int total = 0;
        for (int x : nums) total += x;

        int left = 0;

        for (int i = 0; i < n; i++) {
            int right = total - left - nums[i];

            ans[i] = nums[i] * i - left
                   + right - nums[i] * (n - i - 1);

            left += nums[i];
        }

        return ans;
    }
}
