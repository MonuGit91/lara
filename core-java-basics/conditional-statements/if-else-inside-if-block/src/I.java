class I{
    public static void main(String[] args){
        System.out.println("main begin");
        if(true) {
			System.out.println("if1 begin");
        	if(false) {
        		System.out.println("if2 body");
			}
        	else {     
        		System.out.println("else2-body");
			}
		}
		else {
			System.out.println("else1-body");
		}

        System.out.println("main end");
        
    }
}
