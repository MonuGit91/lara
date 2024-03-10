import java.util.*;

class W{
    static int i;
    public static void main(String[] args){
        System.out.println("main1: "+i);//0
		i = 1;
		test();
		System.out.println("main2: "+i);//4
		i = 2;
		W.test();
		System.out.println("main3: "+i);//5
    }
	public static void test(){
		System.out.println("test:"+i);//1 //2
		i+=3;
	}
}
/*
R:-
-here i, j, m are initilized
-k is not considered as initialized but k had default value 0


Q<***>:-
-CTE because
	. static can be used only for class level members
	. static can not used inside any method including main method


K<***>:-
-here no CTE because
	both m is in different scope
-local variable has grater preferation so out put is 4

I:-
-CTE because 
	2 variable should not have same name in the same scope


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
