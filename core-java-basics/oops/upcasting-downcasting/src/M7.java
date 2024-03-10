//down casting
class M7 {
    public static void main(String[] args) {
    	A a1 = new A();
    	B b1 = (B)a1;
        System.out.println("done");
    }
}
/*
here we are doing downcasting:
here compilation will be successfull but at at run time we will get class cast exception
because here B class contains 4 members after extending and A class has only 2 members.

*/