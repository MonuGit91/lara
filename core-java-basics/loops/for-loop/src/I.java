class I{
    public static void main(String[] args){
        System.out.println("main begin");
        for(int i = 10; i >= 1; i-= 3) {
            System.out.println("loop body: " + i);
        }
        System.out.println("main end:");
    }
}
/*
main begin

int i = 10; 10 >= 1 -> treue
loop body: 1
i = 10-3=7


*/
