class V{
    public static void main(String[] args){
        System.out.println("main begin");
    
        if(false) {
            System.out.println("if1 body");
        	if(true) { 
            	System.out.println("if2 body");
             	if(true) {
            		System.out.println("if3 body");
				}
			}
		}
    
        System.out.println("main end");

    }   
}
