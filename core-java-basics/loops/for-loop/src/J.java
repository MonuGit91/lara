class J{
    public static void main(String[] args){
        System.out.println("main begin");
        for(int i = 10; i <= 50; i = i*5) {
            System.out.println("loop body: " + i);
        }
        System.out.println("main end:");
    }
}

/*
main begin

int i = 10; 10 <= 50 -> true
loop body: 10
i = 10*5 = 50

50 <= 50 -> true
loop body: 50
i = 50*5 = 250

250 <= 50 -> false

main end
*/
