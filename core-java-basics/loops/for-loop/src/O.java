class O{
    public static void main(String[] args){
        System.out.println("main begin");
        int i = 10;
        for(i = 1; i <= 5; i++) {
            System.out.println("loop body: " + i);
        }
        System.out.println("main end: " + i);

    }
}
/*
main begin
int i = 10;

i = 1; 1 <= 5 -> true
loop body: 1
i = i++ = 1+1 = 2

2 <= 5 -> true
loop body: 2
i = i++ = 2+1=3

3 <= 5 -> true
loop body: 3
i = i++ = 3+1 = 4

4 <= 5 -> true
loop body: 4
i = i++ = 4+1 = 5

5 <= 5 -> true
loop body: 5
i = i++ = 5+1 = 6

6 <= 5 ->false

main end: 6


*/
