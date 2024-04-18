package Q006_moveZeroes;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Solution obj = new Solution();
		
		int arr[] = {0,1,0,3,12};
		obj.moveZeroes(arr);
		System.out.println(Arrays.toString(arr));
	}

}
