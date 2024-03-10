class F {
	static float test1(short s1) {
		return test2(s1);
	}
	static long test2(int s1){
		return s1;
	}
    public static void main(String[] args) {
    	byte b1 = 100;
    	double b1 = test1(b1);
        System.out.println("HelloWorld");
    }
}