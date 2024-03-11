abstract final class A{}
class M8{
	public static void main(String [] arg){
		System.out.println("main");
	}
	
}

/*
error: illegal combination of modifiers: abstract and final

abstract and final both together can not used
here final is saying class A can not extended of modified and abstract saying implement so conflict is accuring
*/