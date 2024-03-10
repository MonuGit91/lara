import java.util.*;

class F{
	public static void main(String[] args){
		System.out.println(115 << 1);
		System.out.println(115 << 2);
		System.out.println(115 >> 1);
		System.out.println(115 >> 2);

	}
}
/*
230
460
57
28

115/2 --> 1
57/2  --> 1
28/2  --> 0
14/2  --> 0
7/2   --> 1
3/2   --> 1
1/2   --> 1
0

115:    	 
1110011
64+32+16+0+0+2+1

1110011<<1 
11100110
128+64+32+0+0+4+2: 460

1110011<<2
111001100
256+128+64+0+0+8+4+0+0
460
			
	 


*/



