package Q002_sortColor;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Solution obj = new Solution();
		
		int arr[] = {1, 2, 0, 1, 2, 0, 0, 2, 0, 1};
		obj.sortColors(arr);
		System.out.println(Arrays.toString(arr));
	}

}
