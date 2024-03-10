import java.util.*;

class D{
	public static void main(String[] args){
		int i = 0;
		if(true || i++ == 1) {
			System.out.println("if block:" + i++);
			i++;
		}
		System.out.println("main:"+i);

	}
}
