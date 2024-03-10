import java.util.*;

class E{
	public static void main(String[] args){
		System.out.println(65 << 1);
		System.out.println(65 << 2);
		System.out.println(65 >> 1);
		System.out.println(65 >> 2);
		
	}
}
/*
65/2 --> 1
32/2 --> 0
16/2 --> 0
8/2  --> 0
4/2  --> 0
2/2  --> 0
1/2  --> 1
0
65: 1000001 ->64+0+0+0+0+0+1
65<<1 : 10000010 
     -> 128+0+0+0+0+0+1+0 
	  = 130
65<<2 : 100000100 
     -> 256+0+0+0+0+0+1+0+0 
	  = 260
65>>1 : 100000 
     -> 32+0+0+0+0+0 
	  = 32
65>>2 : 10000 
     -> 16 

*/
