package default_package;


class R {
	enum En{
		C1, C2, C3, C4;
	}
}
public class S{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		R.En e1 = R.En.C4;
		R.En e2 = R.En.C2;
		System.out.println(e1);
		System.out.println(e2);
	}

}
