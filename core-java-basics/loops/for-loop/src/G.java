import java.util.*;

class G{
	public static void main(String[] args){
		System.out.println("main begin");
		for(int i = 10; i >= 1; i--) {
			System.out.println("loop body: " + i);
		}
		System.out.println("main end: ");
	}
}
/*
main begin
int i = 10
i = 10 -> 10 >= 1 -> true
loop body: 10
i-- : 9

i = 9; 9 >= 1 -> true
loop body: 9
i-- : 8

i = 8; 8 >= 1 -> true
loop body: 8
i-- : 7

i = 7; 
loop body: 7
loop body: 6
loop body: 5
loop body: 4
loop body: 3
loop body: 2
loop body: 1
main end:
*/
