class I{
    public static void main(String[] args){
        System.out.println("main begin");
        int i = 0;
        if(i++ == 0 && i++ == 0) {
            System.out.println("if:"+ i++);
        }
        else if(i++ == 2){
            System.out.println("else:"+ i++);
            i++;
        }
        System.out.println("main end:"+ i);
    }
}
