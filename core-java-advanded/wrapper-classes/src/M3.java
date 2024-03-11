class M3{
	public static void main(String[] args){
		Character obj1 = new Character('a');
		Character obj2 = Character.valueOf('a');
		double d1 = obj1.charValue();
		double d2 = obj2.charValue();
		System.out.println("done");
	}
}