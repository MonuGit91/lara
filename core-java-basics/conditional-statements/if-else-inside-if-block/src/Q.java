class Q{
    public static void main(String[] args){
        System.out.println("main begin");
        if(true) {
			System.out.println("if1 begin");
        	if(false) {
        		System.out.println("if2 body begin");
				if(true) {
					System.out.println("if3 body begin");
				}
				else {
					System.out.println("else3 body");
				}
				System.out.println("if2 body end");
			}
        	else {
        		System.out.println("else2-body");
			}
			System.out.println("if1 body end");
		}
        else {
        	System.out.println("else1-body");
		}
        
        System.out.println("main end");
    }
}
