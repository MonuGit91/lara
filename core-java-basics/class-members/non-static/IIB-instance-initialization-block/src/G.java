import java.util.*;

class G{
	static int p;//0
	
	G(){
		p+=10;//30
	}
	
	{
		p+=20;//20
	}
	void test1(){
		p+=30;//60
	}
	static void test2(){
		p+=40;//100
	}
	public static void main(String[] args){
		System.out.println("a:"+p);//0
		G g1 = new G();
		System.out.println("b:"+p);//30
		g1.test1();
		System.out.println("c:"+p);//60
		test2();
		System.out.println("d:"+p);//100

	}
}
/*
class G:-
-at the time of class loding static members will lode
-IIB will run at the time of object creation before constructor call


class f:-
-even there is calling mulitple constructor for one object creaition IIB will
 execute only one time

class b:-
IIB : Instant Initialization Block
-all IIB will be executing for every object creation before the constructor
-we can have multiple IIB and all IIB will execute top to bottom
*/
