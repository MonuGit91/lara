class J{
    public static void main(String[] args){
        int i = 0;
        if(i++ == 0 && i++ == 1) {
            System.out.println("if block:" + i++);
            i++;
        }  
        System.out.println("main:"+i);

    }
}
