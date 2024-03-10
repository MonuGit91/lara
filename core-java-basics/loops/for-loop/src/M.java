class M{
    public static void main(String[] args){
        System.out.println("main begin");
        for(int i = 5000; i > 0; i /= 10) {
            System.out.println("loop body: " + i);
        }
        System.out.println("main end");
    }
}
