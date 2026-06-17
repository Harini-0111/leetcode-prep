class Solution {
    public int maxScore(int[] cardPoints, int k) {

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < k; i++) {
            leftSum += cardPoints[i];
        }

        int maxScore = leftSum;

        int rightIndex = cardPoints.length - 1;

        for (int leftIndex = k - 1; leftIndex >= 0; leftIndex--) {

            leftSum -= cardPoints[leftIndex];
            rightSum += cardPoints[rightIndex];

            rightIndex--;

            maxScore = Math.max(maxScore, leftSum + rightSum);
        }

        return maxScore;
    }
}