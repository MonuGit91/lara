package pack1;

class J extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(getName());
		System.out.println(isDaemon());
		System.out.println(getPriority());//pririty of current thread id == priority of of it's parent thread
		System.out.println(getId());
	}
}
public class M10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		J ref = new J();
		ref.start();
	}
}
