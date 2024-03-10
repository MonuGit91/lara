class Z2{
    public static void main(String[] args){
        System.out.println("main begin");

        if(true) {
            System.out.println("if1 body");
            if(true) 
                if(false)
                    System.out.println("if3 body");
            System.out.println("if1 end");
        }

        System.out.println("main end");

    }
}
