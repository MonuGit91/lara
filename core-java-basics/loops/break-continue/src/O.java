class O{
	public static void main(String[] args){
		System.out.println("main begin");
		loop1:
		for(int i = 1; i <= 10; i++) {
			System.out.println("outer loop begin: " + i);
			loop2:
			for(int j = 101; j <= 105; j++) {
				System.out.println("inner loop begin: " + i + " , " + j);
				if(j == 103) {
					continue loop1;
				}
				System.out.println("inner loop end: " + i + " , " + j);
			}
			System.out.println("outer loop end" + i);
		}
		System.out.println("main end");
	}
}
/*
-ie, we can control and outer loop from inner loop only through labled loop
*/



/*
//N.java
- we can control outer loop and inner loop with loop lable name with break and continue;
*/

/*
//M.java:
this is labled loop
-ie, we can give name to the loop as lable
-if we are not giving name to the break or contunue then bydefault it will take corrent loop for break or continue

*/
