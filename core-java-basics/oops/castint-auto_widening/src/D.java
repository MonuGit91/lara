class D {
	static byte test(){
		return 10;
	}
    public static void main(String[] args) {
    	byte b1 = test();//byte b1 = (byte)test();
    	short s1 = test();//byte b1 = (short)test();
    	int i = test();//byte b1 = (int)test();
    	long lon = test();
    	double d1 = test();
        System.out.println("done");
    }
}