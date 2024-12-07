class Solution {
    public static int maxArea(int[] height) {
        int maxArea = 0, left = 0, right = height.length - 1;

        while (left < right) {
            maxArea = Math.max(maxArea, getArea(left, right, height));

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static int getArea(int left, int right, int[] height) {
        int w = right - left, h = Math.min(height[left], height[right]);
        return w * h;
    }
}
