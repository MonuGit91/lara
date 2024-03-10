import java.util.*;

class H{
	static int i = test1();//17
    static int j = test2();//82
	static {
		System.out.println("from SIB: "+i+","+j);//26, 82
		i+=1;//i = (26+=1) = 27
		j+=2; //j = (82+=2) = 84
	}
	static int test1() {
		System.out.println("from test1: "+i+","+j);//0,0
		i+=3;//i = 3
		j+=4;//j = 4
		return i+j+10;//3+4+10 = 17
	}
	static int test2() {
        System.out.println("from test2: "+i+","+j);//17,4
        i+=j+5;//i = (17 += 4+5) = 26
		j+=i+6;//j = (4 += 26+6) = 36
		return i+j+20;//82
    }
	public static void main(String[] args){
		System.out.println(i+","+j);//27, 84

	}
}
/*
E<***>:-
Q. is there any possiblity to rum any thing before calling main()?

-all initilizer will run before main method
-here static int i, static j and static block are initilizer and it is running before calling main method
-

*/
