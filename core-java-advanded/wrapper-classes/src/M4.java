class M4{
	public static void main(String[] args){
		boolean flag = false;
		Boolean obj1 = new Boolean(flag);
		Boolean obj2 = Boolean.valueOf(flag);
		Boolean d1 = obj1.booleanValue();
		Boolean d2 = obj2.booleanValue();
		System.out.println("done");
	}
}