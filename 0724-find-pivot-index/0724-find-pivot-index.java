class Solution {
    public static int SumOfDigits(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }
    public int pivotIndex(int[] nums) {
        int LeftSum = 0;
        int TotalSum = SumOfDigits(nums);

        for (int i = 0; i < nums.length; i++) {

            int RightSum = TotalSum - LeftSum - nums[i];

            if (RightSum == LeftSum) {
                return i;
            }

            LeftSum += nums[i];
        }

        return -1;
    }
}