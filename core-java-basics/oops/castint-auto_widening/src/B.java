class B {
    public static void main(String[] args) {
    	byte b1 = 10;
    	int i = b1;//int i = (int)b1;
    	float f1 = i;
    	double d1 = b1;
    	double d2 = i;//double b2 = (double)i;
    	double d3 = f1;
        System.out.println("done");
    }
}
/*
type casting auto matacally done by compiler
*/