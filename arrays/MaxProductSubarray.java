public class MaxProductSubarray {
    public static int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int maxProductSoFar = nums[0];
        int minProductSoFar = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];

            if (current < 0) {
                int temp = maxProductSoFar;
                maxProductSoFar = minProductSoFar;
                minProductSoFar = temp;
            }

            maxProductSoFar = Math.max(current, current * maxProductSoFar);
            minProductSoFar = Math.min(current, current * minProductSoFar);

            result = Math.max(result, maxProductSoFar);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        System.out.println("Maximum Product Subarray: " + maxProduct(nums));

        int[] nums2 = {-2, 0, -1};
        System.out.println("Maximum Product Subarray: " + maxProduct(nums2));
    }
}
