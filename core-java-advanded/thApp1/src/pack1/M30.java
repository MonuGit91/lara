package pack1;

class Y extends Thread{
	Y(){
		start();//called auto start
	}
	public void run() {
		System.out.println("run begin");
		System.out.println("run end");
	}
}
public class M30 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		Y obj = new Y();
		obj.start();// do not call 2 times
		System.out.println(2);
	}

}