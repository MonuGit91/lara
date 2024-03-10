class F{
    public static void main(String[] args){
        System.out.println("main begin");
        int i = 0;
        if(i++ == 1 && i++ == 2) {
            System.out.println("if:"+ i++);
        }
        else {
            System.out.println("else:"+ i++);
            i++;
        }
        System.out.println("main end:"+ i);
    }
}
