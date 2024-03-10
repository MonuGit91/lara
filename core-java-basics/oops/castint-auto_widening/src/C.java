class C {
	static void test(float f1) {
		System.out.println("test");
	}
    public static void main(String[] args) {
    	byte b1 = 10;
    	short s1 = 10;
    	int i = 10;
    	long lon = 10;
    	test(b1);//test((float)b1)
    	test(s1);//test((float)s1)
    	test(i);//test((float)i)
    	test(lon);//test((float)lon)
        System.out.println("done");
    }
}