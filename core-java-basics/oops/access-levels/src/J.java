import java.util.*;
class J{
	private class A{
	}
	public static void main(String[] args){
		System.out.println("done");
	}
}
/*
for inner class private is alloud
-but we can not create object of private class 
-if you want to create object of private inner class then define private class as static 
	eg:
		class J{
			private static class A{
		}
		public static void main(String[] args){
			System.out.println("done");
		}
}
*/