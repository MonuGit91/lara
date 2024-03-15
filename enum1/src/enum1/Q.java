package enum1;

interface P{
	void test1();
}

enum Q implements P{
	;
	public void test1() {
		
	}
}
/*
implementing interface is aloud in enum
*/