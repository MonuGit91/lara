class R{
    public static void main(String[] args){
        System.out.println("main begin");
        int i = 4;
        for(; i <= 5;) {
            System.out.println("loop body: " + i++);
        }
        System.out.println("main end: " + i);

    }
}
