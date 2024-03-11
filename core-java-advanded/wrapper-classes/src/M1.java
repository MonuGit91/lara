class M1{
	public static void main(String[] args){
		int i = 10;
		Integer obj1 = new Integer(i); //boxint
		Integer obj2 = Integer.valueOf(i);//unboxing
		int j = obj1.intValue(); // unboxing
		int k = obj2.intValue(); // unboxing
		System.out.println("done");
	}
}
/*
storing premetive to object is boxing
retreving premetive from object is called unboxing 
*/