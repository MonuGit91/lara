import java.util.*;

class R{
    static int i = 10;
    static int j = 20;
    static int k;
    static int m = 30;
    public static void main(String[] args){
        System.out.println(i+","+j+","+k+","+m);
        i = 50;
        j = 510;
        k = 40;
        m = 140;
        System.out.println(i+","+j+","+k+","+m);

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
