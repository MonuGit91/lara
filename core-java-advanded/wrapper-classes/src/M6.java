class M6{
	public static void main(String[] args){
		String s1 = "10.5";
		Double obj1 = new Double(s1);
		Double obj2 = Double.valueOf(s1);
		double i = obj1.doubleValue();
		double j = obj2.doubleValue();
		System.out.println(i);
		System.out.println(j);
	}
}