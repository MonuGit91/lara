import java.util.*;

class M11 {
    public static void main(String[] args) {
        B b1 = new C();
        C c1 = (C)b1;
        System.out.println("------------");
        D d1 = (D)b1;
        System.out.println("------------");
    }
}
/*
how to compile line 8 successfull
*/