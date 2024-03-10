class I{
	public static void main(String[] args){
        System.out.println("main begin");
        int i = 1;
        while(i++ <= 5);
            System.out.println("loop begin: " + i);
            System.out.println("loop end: " + i);
            i++;
            System.out.println("main end: " + i);
    }
}
/*
main begin
loop begin: 7
loop end: 7
main end: 8

explanation:-
main begin
int i = 1
i++ = (1 <= 5) -> true and i = 1+1 = 2
i++ = (2 <= 5) -> true and i = 2+1 = 3
i++ = (3 <= 5) -> true and i = 3+1 = 4
i++ = (4 <= 5) -> true and i = 4+1 = 5
i++ = (5 <= 5) -> true and i = 5+1 = 6
i++ = (6 <= 5) -> false and i = 6+1 = 7
loop end: 7
main end: 8

*/
