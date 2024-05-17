//	https://leetcode.com/problems/container-with-most-water/description/
package Extra001_maxWaterContainer;

class Solution {
	public static void main(String[] args) {
		int height[] = {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(height));
	}
    public static int maxArea(int[] height) {
        int n = height.length;
        int left = 0, right = n-1;
        int maxWater = 0;
        while(left < right) {
            int water = Math.min(height[left], height[right])*Math.abs(right-left);
            maxWater = Math.max(maxWater, water);
            if(height[left]< height[right]) left++;
            else right--;
        }
        return maxWater;
    }
}
