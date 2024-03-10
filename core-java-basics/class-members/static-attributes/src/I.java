import java.util.*;

class I{
	static int i;
	static double i;
	public static void main(String[] args){
		System.out.print("done");
	}
}
/*
- here i is called as
	. feild
	. attribute
	. globle variable
- attributes of a class automatically have default falues
- we do not need to initialize class level attributes before usage
- default value will be depends on data type of a variable
  	eg, 
	default value for 
  		. byte, short, int, long :  0
		. float, double : 0.0
		. boolean : false
		. char : blank [\u0000] ie, nothing
- default falue for every derived datatype is null 
- every array is comes under derivid data type no matere wether it is premitive type or derived datatype
	eg,
	default value for
		. String : null
		. String[] : null
		. int[], char[], .... : null	

*/
