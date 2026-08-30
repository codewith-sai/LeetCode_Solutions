class Solution {
    public int minimumDeletions(int[] nums) {
      
        int n = nums.length;

        int minInd = 0;
        int maxInd = 0;

        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[minInd]) {
                minInd = i;
            }

            if (nums[i] > nums[maxInd]) {
                maxInd = i;
            }
        }

        int l = Math.min(minInd, maxInd);
        int r = Math.max(minInd, maxInd);

        int front = r + 1;
        int back = n - l;
        int fromBoth = (l + 1) + (n - r);

        return Math.min(front, Math.min(back, fromBoth));
    
    }
}