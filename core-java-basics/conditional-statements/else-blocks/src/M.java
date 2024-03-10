class M{
    public static void main(String[] args){
        System.out.println("main begin");
		int i = 10;
		{
			i = i+20;
            System.out.println("block1-statement1");
			System.out.println("block1-statement2");
			System.out.println("block1-statement3");
			System.out.println("block1-statement4");
        }
        System.out.println("some thing:" + i);
		{
			i = i+ 30;
			System.out.println("block2-statement1");
			System.out.println("block2-statement2");
			System.out.println("block2-statement3");
			System.out.println("block2-statement4");
		
		}
		System.out.println("main end:" + i);

    }
}
