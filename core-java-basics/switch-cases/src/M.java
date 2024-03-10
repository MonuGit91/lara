class M{
    public static void main(String[] args){
        System.out.println("main begin");
        int i = 20;
        switch(i) {
            case 1:
                System.out.println("form case 1");
                System.out.println("from case1");
                break;
            case 5:
                System.out.println("form case 5");
                System.out.println("from case 5");
                break;
            default: 
                System.out.println("form default");
                System.out.println("form default");
                System.out.println("form default");
                break;
            case 10: 
                System.out.println("from case 10");
                System.out.println("form case 10");
			default:
                System.out.println("form default");
        }
        System.out.println("main end");
    }
}
