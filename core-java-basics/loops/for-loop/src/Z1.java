class Z1{
    public static void main(String[] args){
        System.out.println("main begin");
        //int i;
        for(int i = 1, System.out.println("init"); test(i); System.out.println("befrore change: "+i),i++, System.out.println("after change: " + i)) {
            System.out.println("loop body: " + i);
        }
        System.out.println("main end");
    }
        static boolean test(int i) {
            boolean flag = (i <= 5);
            System.out.println("blloean status for " + i + " is " + flag);
            return flag;
        }

}
/*
- int i = 1, System.out.println("init")
- in this line initilization and SOP in same line so CTE will oucore

*/
