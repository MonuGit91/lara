package Q005_romoveDublicates;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Solution obj = new Solution();
		
		int arr[] = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(Arrays.toString(arr));
		System.out.println(obj.removeDuplicates(arr));
		System.out.println(Arrays.toString(arr));
		
	}

}
