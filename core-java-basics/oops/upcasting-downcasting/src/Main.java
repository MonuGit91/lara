import java.util.*;

class A{
	int i = 10;
}
class B extends A{
	int i = 20;
}
class C extends B{
	int i = 30;
}
class Main {
    public static void main(String[] args) {
        C c1 = new C();
        B b1 = c1;
        A a1 = c1;

        a1 = b1;
        System.out.println(a1.i + " " + b1.i+" "+c1.i);
    }
}
/*
output: 10 20 30
*/