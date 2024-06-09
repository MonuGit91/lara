package q018_singleNumber;

public class Solution {

	public static void main(String[] args) {
		int arr[] = {4,1,2,1,2};
		System.out.println(singleNumber(arr));
	}
	
	public static int singleNumber(int[] nums) {
        int num = 0;
        for(int i = 0; i < nums.length; i++) 
            num = num^nums[i];

        return num;
    }
}
